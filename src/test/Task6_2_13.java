package test;

import java.util.*;

public class Task6_2_13 {
    public static void main(String[] args) {
        //Set<String> s = Collections.emptySet();
        Set<String> s = new HashSet<>();
        s.add("s1");
        s.add("s2");
        Set<String> l = new HashSet<>();
        l.add("s1");
        l.add("s3");
        //walk(s, l);
        Set<String> result = symmetricDifference(s, l);

        for (String el : result) {
            System.out.println(el);
        }
/*
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
*/

    }
    public static <T> void walk(Set<? extends T> s, Set<? extends T> l) {
        Set<T> res = new HashSet<>();
        Iterator<T> it = (Iterator<T>) s.iterator();
        while (it.hasNext()) {
            T obj = (T) it.next();
            if (l.contains(obj)) {
                res.add(obj);
            }
        }
        Iterator<T> it1 = (Iterator<T>) res.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        /*
        T el;
        for (el : s) {
            System.out.println(el);
        }
*/

    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
/*
        Set<T> result = new HashSet<>();
        Iterator<T> iteratorSet1 = (Iterator<T>) set1.iterator();
        while (iteratorSet1.hasNext()) {
            T obj = iteratorSet1.next();
            if (!set2.contains(obj)) {
                result.add(obj);
            }
        }
        Iterator<T> iteratorSet2 = (Iterator<T>) set2.iterator();
        while (iteratorSet2.hasNext()) {
            T obj = iteratorSet2.next();
            if (!set1.contains(obj)) {
                result.add(obj);
            }
        }
*/
        Set<T> result = new HashSet<>(set1);
        Iterator<T> iteratorSet2 = (Iterator<T>) set2.iterator();
        while (iteratorSet2.hasNext()) {
            T obj = iteratorSet2.next();
            if (result.contains(obj)) {
                result.remove(obj);
            } else {
                result.add(obj);
            }
        }
        return result;
    }

}
