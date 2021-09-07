package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

    public static class Cls {
        public String str;
        public Cls(String s) {
            str = s;
        }
    }
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3);
        Map<String, Cls> map = new HashMap<>();
        map.put("s", new Cls("ss"));
        map.put("s2", new Cls("ss2"));
        map.put("s3", new Cls("ss3"));
        List<Cls> ccc = new ArrayList<>();
        ccc.add(new Cls("rr1"));
        ccc.add(new Cls("rr12"));
        ccc.add(new Cls("rr13"));
        //Stream.generate(() -> map.values()).forEach(System.out::println);
        System.out.println(
        map.entrySet().stream()
                //.forEach(System.out::println);
        .anyMatch( es -> es.getValue().str.equals("ss2"))
        );
        List<Cls> list = map.entrySet().stream().map(es -> es.getValue()).collect(Collectors.toList());
        Optional<Map.Entry<String, Cls>> op = map.entrySet().stream().filter(es -> es.getValue().str.equals("ss33")).findAny();
        System.out.println(op.isPresent() ? op.get().getKey() : null);

        list.stream().forEach(System.out::println);

        /*
        Map<String, List<String>> map = new HashMap<>();
        List<String> lst = new ArrayList<>();
        lst.add("value");
        map.put("k",lst);
        map.merge("k", lst, (oldValue, newValue) -> {oldValue.add(newValue.get(0)); return oldValue;});
        lst.stream().forEach(System.out::println);
*/
    }
}
