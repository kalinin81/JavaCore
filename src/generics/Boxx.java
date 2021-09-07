package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Boxx {
    public static void main(String[] args) {
/*
        Box<Integer> b = new Box<>();
        b.set(1);
        //b.inspect("str");
        String s = b.ret("s");
        Integer i = b.ret(1);
        System.out.println("s: " + s.getClass().getName());
        System.out.println("i: " + i.getClass().getName());
*/

/*
        Collection<String> coll;
        List<String> lst;
        ArrayList<String> arr = new ArrayList<>();
        lst = arr;
        coll = arr;
*/

        List<Integer> l = new ArrayList<>();
        l.add(1);
        Integer i = gelEl(l);
        System.out.println("val: " + i + " i: " + i.getClass().getName());
    }

    public static <Q> Q gelEl(List<? extends Number> list) {
        //list.set(0, (Number) 2);
        System.out.println(list.toString());
        //List<? extends Number> lst = list.clone();
        return (Q) list.get(0);
        //Object
    }

    public static class Box<T> {

        public <U> U ret(U u) {
            return u;
        }

        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }

        public <U //extends Number
                > void inspect(U u){
            System.out.println("T: " + t.getClass().getName());
            System.out.println("U: " + u.getClass().getName());
        }

    }

}
