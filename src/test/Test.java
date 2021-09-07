package test;


public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.main();
    }
    public void main() {
        Cls1 cls1 = new Cls1();
        Cls2 cls2 = new Cls2();
        //cls2.
    }
    class Cls1 {
        private int privateFld;
        public int publicFld;
        private void privateMethod(){        }
        public void publicMethod(){        }
    }
    class Cls2 extends Cls1 {
        public int fld;
    }
}
