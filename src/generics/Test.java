package generics;

import javafx.beans.binding.NumberBinding;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
/*
        Cls1<Integer> cls1 = new Cls1<>();
        String s = met3("str");
        int i = met3(2);
        System.out.println(s + " " + i);
*/
    List<?> lst = new ArrayList<>();
    //lst.add(5);

    }
    public class Box123<T> {
        private T t123;
        private int i123;
    }
    public class Cls444<T> {
        private T t444;
        private int i444;
    }
    public static class Cls1<T extends Number> {

    }
    public static void met1(Cls1<? extends Number> cls) {
        Cls1<? extends Number> fld;
    }
    public void met2(Cls1<? extends Number> cls) {
        Cls1<? extends Number> fld;
    }
    public static <T> T met3(T vvv) {
        //Cls1<? extends Number> fld;
        return vvv;
    }
}
