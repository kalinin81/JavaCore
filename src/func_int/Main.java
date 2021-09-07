package func_int;

import com.sun.corba.se.impl.oa.NullServantImpl;

import java.util.List;
import java.util.function.*;

public class Main {

    @FunctionalInterface
    interface NumberGenerator<T extends Number> {
        boolean
        //T
        cond(T arg);
    }

    public static void main(String[] args) {
/*
        UnaryOperator<Integer> sqr = sqrt();
        int res = sqr.apply(2);
        System.out.println(res);
*/
        //NumberGenerator<Number> gen = x -> {return x.intValue() > 0;};
        //System.out.println(gen.cond(5));
        //Number
        Integer
                n1 = 5;
        //System.out.println(getGenerator().cond(n1));
//        Integer i = 5;
//        Number n = i;
//
        //System.out.println(n1.intValue()+n);
        boolean bool1 = ret(5);
        boolean bool2 = ret(5.0);

        Integer i1 = 2;
        Integer i2 = 3;
        System.out.println(i1+i2);

    }

    class NG implements NumberGenerator {
        @Override
        public boolean cond(Number arg) {
            return false;
        }
    }
    public static <T extends Number> boolean ret(T val) {
        return val.intValue() > 0;
    }
    public static UnaryOperator<Integer> sqrt() {
        //UnaryOperator<Integer> sqr = x -> {return x * x;};
        //return (UnaryOperator<Integer>)
                return x -> {return x * x;};
    }
    public static NumberGenerator<? extends Number> getGenerator() {
        return //(NumberGenerator<? super Number>)
         x -> {return
                 x.intValue() > 0
                 //x
                 ;};
    }
}
