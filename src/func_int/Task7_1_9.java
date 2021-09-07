package func_int;

import test.Task6_1_12;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task7_1_9 {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (T obj) -> condition.test(obj) ? ifTrue.apply(obj) : ifFalse.apply(obj);
    }
    public <T, U> Function<T, U> ternaryOperatorNonStatic(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (T obj) -> condition.test(obj) ? ifTrue.apply(obj) : ifFalse.apply(obj);
    }
    public void main() {
        Predicate<Integer> condition = i -> i > 0;
        Function<Object, Boolean> ifTrue = i -> true;
        Function<Object, Boolean> ifFalse = i -> false;
        Function<Integer, Boolean> safeStringLength =
                ternaryOperatorNonStatic(condition, ifTrue, ifFalse);
        //(String str) -> condition.test(str) ? ifTrue.apply(new Object()) : ifFalse.apply(str);
        //String
        Integer
                s =
                //new String()

                3
                //"str123"
                ;
        System.out.println(safeStringLength.apply(s));

    }
    public static void main(String[] args) {
/*
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength =
                ternaryOperator(condition, ifTrue, ifFalse);
*/

        Task7_1_9 t = new Task7_1_9();
        t.main();
/*
        Predicate<Integer> condition = i -> i > 0;
        Function<Object, Boolean> ifTrue = i -> true;
        Function<Object, Boolean> ifFalse = i -> false;
        Function<Integer, Boolean> safeStringLength =
                ternaryOperator(condition, ifTrue, ifFalse);
                //(String str) -> condition.test(str) ? ifTrue.apply(new Object()) : ifFalse.apply(str);
        //String
        Integer
                s =
                //new String()
                -3
                //"str123"
                ;
        System.out.println(safeStringLength.apply(s));
*/
/*
        ArrayList<Integer> lst = new ArrayList<>();
        CharSequence cs = "str12";
        boolean t = condition.test(s);
        System.out.println(t);
        System.out.println(s==null);
        int i1 = ifTrue.apply(lst);
        System.out.println(i1);
        int i2 = ifFalse.apply(s);
        System.out.println(i2);
*/
    }
}
