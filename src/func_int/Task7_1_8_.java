package func_int;

import java.util.ArrayList;
import java.util.List;

public class Task7_1_8_ {

    @FunctionalInterface
    interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }

    public static NumberGenerator<? extends Number> getGenerator() {
        return x -> {return x.intValue() > 0;};
    }

    class Cls1<W extends Number> {
        W value;
        public W get() {
            return value;
        }
        public void set(W value) {
            this.value = value;
        }
    }
    public Cls1<? extends Number> getClsExtends(){
        return new Cls1();
    }
    public Cls1<? super Number> getClsSuper(){
        return new Cls1();
    }
    public void main() {
       // getClsExtends().set(5.9);
        getClsSuper().set(5.9);
        List<? extends Number> listExtends = new ArrayList<Integer>();
        List<? super Number> listSuper = new ArrayList<Object>();
        Cls1<? extends Number> clsExtends1 = new Cls1<Integer>();
        Number n = 5;
        //clsExtends1.set(n);
        Cls1<? extends Number> clsExtends2 = new Cls1();
        //clsExtends2.set(5);
        //Cls1<? super Number> clsSuper = new Cls1<Object>();
    }
    public void test123() {
        Cls1<? extends Number> clsExtends123 = new Cls1<Integer>();
        Number nnn123 = 5;
        List<? super Number> lst = new ArrayList<Number>();
        lst.add(5);
        //clsExtends1.set(nnn123);
    }

    /*
        Cls1<Double> dbl1 = new Cls1();
        dbl1.set(5.9);
        System.out.println(dbl1.get());
        Cls1<Number> num1 = new Cls1();
        num1.set(5.9);
        System.out.println(num1.get());
        Cls1<Number> numExtends = (Cls1<Number>) getClsExtends();
        numExtends.set(5.9);
        Cls1<Number> numSuper = (Cls1<Number>) getClsSuper();
        numSuper.set(5.9);
*/

    public static void main(String[] args) {

        Task7_1_8_ t = new Task7_1_8_();
        t.main();
        /*
        NumberGenerator<Double> d = x -> x > 0;
        System.out.println(d.cond(5.0));
        System.out.println(getGenerator().cond(5.0));
        NumberGenerator<Number> d2 = (NumberGenerator<Number>) getGenerator();
        NumberGenerator<Double> d3 = (NumberGenerator<Double>) getGenerator();
*/
        //NumberGenerator<Double> d4 = getGenerator();

    }
}
