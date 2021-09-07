package StreamAPI;

import com.sun.xml.internal.rngom.digested.DValuePattern;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    interface Get<E> { E get();}
    public static class Cls<E> //implements Get<E>
    {
        List<E> lst;
        public void get() {
            //E ff =
            List<?> ff = (List<?>) lst;
        }
        public List<E> get1(Integer val) { return lst;       }
        public List<E> get1(String val) {  return lst;      }
    }
    //public static class Cls1<List<E>> {}
    public static class fff<E extends Integer, String> {
        //public void met(fff<E> val) {}
    }
    public static void main(String[] args) {
        Number[] arr = new Integer[2];
        Integer i = 2;
        arr[0]=i;
        Number num = 2;
        arr[1]=num;
        List<? super Number> lst = new ArrayList<>();
        lst.add(i);
        lst.add(num);
        EOFException ex = new EOFException();
        IOException io = new EOFException();
        Exception exc = new EOFException();
        Throwable thr = new EOFException();
/*
        IntStream s4 = IntStream.empty();
        for (int i=1;i<=5;i++) {
            s4 = IntStream.concat(s4, IntStream.of(i));
        }
        IntStream s1 = IntStream.of(1);
        IntStream s2 = IntStream.of(2);
        IntStream s3 = IntStream.concat(s1, s2);
        //s3.forEach(System.out::println);
        s4.forEach(System.out::println);

*/
/*
        IntStream.iterate(13, i ->
        IntStream.of(2,3,4)
                .map(n -> (int)
                        ((int) (Math.pow(i,2) % Math.pow(10, n) / Math.pow(10, n-1)) * Math.pow(10, n-2))
                )
                .sum()
        )
        .limit(10)
        .forEach(System.out::println);
*/
/*
        int seed = 13;
        int el = seed;
        IntStream s4 = IntStream.of(el);
        while (el != 0) {
            el =
                    IntStream.of(el)
                            .flatMap(i ->
            //.map(
                                            IntStream.iterate(2, n -> n + 1)
                                                    .limit(3)
                                                    .map(n -> (int)
                                                            ((int) (Math.pow(i,2) % Math.pow(10, n) / Math.pow(10, n-1)) * Math.pow(10, n-2))
                                                    )
                            )
                            .sum()
                    ;
            s4 = IntStream.concat(s4, IntStream.of(el));
*/
/*
            System.out.println(
                    el
            );
*//*

        }
        s4.forEach(System.out::println);
*/
    }

}
