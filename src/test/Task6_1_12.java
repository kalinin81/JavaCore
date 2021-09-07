package test;

import java.util.Objects;
import java.util.Optional;

public class Task6_1_12 {

    public static class Pair<T1, T2> {
        private T1 value1;
        private T2 value2;
        private Pair(T1 value1, T2 value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
        public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
            return new Pair<T1, T2>(value1, value2);
        }
        public T1 getFirst() {
            return value1;
        }
        public T2 getSecond() {
            return value2;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (!(obj instanceof Pair)) {
                return false;
            }

            Pair<?, ?> other = (Pair<?, ?>) obj;
            return Objects.equals(value1, other.value1) && Objects.equals(value2, other.value2);
        }
        @Override
        public int hashCode() {
            return Objects.hash(value1, value2);
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(i);
        System.out.println(s);
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
/*
        Pair<String,String> pair =
                //new Pair<String, String>(null, null)
                Pair.of(null, null)
                ;
*/

    }
}
