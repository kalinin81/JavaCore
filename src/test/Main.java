package test;

import apple.laf.JRSUIConstants;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
       /* Main main = new Main();
        main.main();
*/
        ArrayList<Lion> lions = new ArrayList<>();
        //ArrayList<Lion> lions = new ArrayList<>();
        lions.add(new Lion());
        //Lion l1 = lions.get(0);
        Lion l1 = (Lion) getFirst(lions);
        //Lion l1 = Main.<Lion>getFirst(lions);
/*
        ArrayList<String> s = new ArrayList<>();
        s.add("s");
        String ss = s.get(0);
*/

        //ArrayList<? extends  Wild> wilds = lions;
        //ArrayList<? super Lion> wilds = lions;
        //ArrayList<? super Wild> wilds = new ArrayList<>();
        //ArrayList<? super Lion> wilds = new ArrayList<>();
//        lions.add(new Lion());
//        wilds.add(new Lion());
//        wilds.add(new Wild());
//        wilds.add(new Lion1());
//        //wilds.add(new Animal());
//        Wild w1 = (Wild) wilds.get(0);

/*
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        cat2 = cat;
*/

/*
        Cat c1 = new Cat();
        Pet p1 = new Pet();
        //p1 = c1;
        c1 = (Cat) p1;
*/

    }
    public void main() {
/*
        Optional bar = Optional.empty();
        Integer value = (Integer) bar.orElse(1);
*/
        System.out.println("main.main()");

//        Lion[] arr_lions = new Lion[10];
//        arr_lions[0] = new Lion();
//        Wild[] arr_wilds = arr_lions;
//        arr_lions[1] = new Lion();
//        arr_wilds[2] = new Lion();


/*
        ArrayList<? extends  Wild> wilds1 = new ArrayList<>();
        wilds1.get(0);
*/


/*
        CopyList<Wild> copyList = new CopyList<>();
        List<Wild> arr1 =
                //met(arr)
                copyList.met(arr)
                ;

        System.out.println(arr1);
*/


    }
    public static <T> List<T> met(List<? extends T> src) {
        List<T> dest = new ArrayList<>();
        for (T el : src) {
            dest.add(el);
        }
        return dest;
    }

    public static class CopyList<T> {
        T value;
        public <E> List<E> met(List<? extends E> src) {
            List<E> dest = new ArrayList<>();
            for (E el : src) {
                dest.add(el);
            }
            return dest;
        }
        public List<T> met1(List<? extends T> src) {
            List<T> dest = new ArrayList<>();
            for (T el : src) {
                dest.add(el);
            }
            return dest;
        }
        public static <T> List<T> met2(List<? extends T> src) {
            List<T> dest = new ArrayList<>();
            for (T el : src) {
                dest.add(el);
            }
            return dest;
        }
        public static <T> List<T> met3(List<? extends T> src) {
            List<T> dest = new ArrayList<>();
            for (T el : src) {
                dest.add(el);
            }
            return dest;
        }
    }

    public static <T> Object getFirst(List<? super T> list) {
        return list.get(0);
    }

    public static class Animal {}
    public static class Pet extends Animal {}
    public static class Wild extends Animal {}
    public static class Cat extends Pet{}
    public static class Lion extends Wild {}
    public static class Lion1 extends Lion {}
}
