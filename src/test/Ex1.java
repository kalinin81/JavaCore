package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        //Gen<Collection<Integer>> gen = new Gen();
        Gen<?> gen = new Gen();
        gen.m(integerList);

        //System.out.println(String.class instanceof Class);
    }

    static class Gen<T> {
        <T> void m(Collection<T> collection) {
            System.out.println("m1");
            for (T s : collection) {
                System.out.println(s);
            }
        }
        <T> void m(List<String> list) {
            System.out.println("m2");
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}