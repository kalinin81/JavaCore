package generics;

import java.util.ArrayList;
import java.util.List;

public class TestCls {
    public static void main(String[] args) {
        List<? super Number> lst123 = new ArrayList<Number>();
        lst123.add(98765);
        Box123 box1 = met123();
    }
    static class Box123 {}
    public static Box123 met123() {
        return new Box123();
    }
}
