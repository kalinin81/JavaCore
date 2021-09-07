package StreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7_2_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, Charset.forName("UTF-8")));
        //Stream<String> str = br.lines();
        String s =
                //"s01 s02 s03 s04 s05 s06 s07 s08 s09 s10 s11 s12"
                "Lorem123ipsum--dolor.sit amet, consectetur фы123 ыв123. ыв32"
                ;
        String[] array = s.split("(?U)\\W+");
        Stream.of(s)
            .map(String::toLowerCase)
            .flatMap(n -> Stream.of(n.split("(?U)\\W+")))
            .collect(Collectors.groupingBy(ss -> ss, Collectors.summingInt(n -> {return 1;})))
            .entrySet().stream()
            .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()) != 0 ? c2.getValue().compareTo(c1.getValue()) : c1.getKey().compareTo(c2.getKey()))
            .limit(10)
            .forEach((c1) -> System.out.println(c1.getKey()))
            ;

/*
        Map<Department, Integer> totalByDept
                = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));
*/
/*
        HashMap<String,Integer> map = new HashMap<>();
        map.merge("k1",1, (t, u) -> {return ++t;});
        map.merge("k1",1, (t, u) -> {return ++t;});
        map.merge("k1",1, (t, u) -> {return ++t;});
        map.merge("k2",1, (t, u) -> {return ++t;});
*/

/*
        Predicate<Integer> condition = i -> i > 0;
        Function<Object, Boolean> ifTrue = i -> true;
        BiFunction<Integer,Integer,Integer> biF = (t,u) -> {return ++t;};
        System.out.println(condition.test(1));
        System.out.println(ifTrue.apply(new Object()));
        System.out.println(biF.apply(1,1));
*/

    }
}
