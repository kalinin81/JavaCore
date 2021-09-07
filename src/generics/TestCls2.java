package generics;

import java.util.ArrayList;
import java.util.List;

public class TestCls2 {
    public static void main(String[] args) {
        List<? super
                //Integer
                Number
                > lstNumber = new ArrayList<>();
        List<Object> lstObject = new ArrayList<>();
        //lstObject = lstNumber;
        Integer numInt = 123;
        Number numNum = 456;
        lstNumber.add(numInt);
        lstNumber.add(numNum); //required capture of ? super Integer, provided Number

        List<? extends Number> lst1 = new ArrayList<>();
        Number n = 999;
        //lst1.add(n);
    }
}
