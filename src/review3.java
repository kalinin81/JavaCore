import java.util.Arrays;

public class review3 {

    /*
    public static void main(String[] args) {
        Animal a = new Animal();
        a.say(1);
        a.say("str");
        //Arrays.copyOf()
        //Arrays.copyOfRan
        //String.valueOf()
        byte[] b = new byte[1];
        //b.
    }

    public static class Animal {
        public int fld;
        public static void say(String s) {
            System.out.println("str");
            //fld = 1;
            //this.fld = 1;
        }
        public void say(int i) {
            System.out.println("int");
            fld = 1;
        }
    }

     */


        public static void main(String[] args) {
            // Пример статического и динамического связывания в Java
            Insurance current = new CarInsurance();

            // Динамическое связывание на основе объекта
            int premium = current.premium();

            // Статическое связывание на основе класса
            String category = current.category();

            System.out.println("premium : " + premium);
            System.out.println("category : " + category);
            System.out.println(Insurance.category());
            System.out.println(CarInsurance.category());

        }
}

class Insurance{
    public static final int LOW = 100;

    public int premium(){
        return LOW;
    }

    public static String category(){
        return "Insurance";
    }

}

class CarInsurance extends Insurance {
    public static final int HIGH = 200;
    @Override
    public int premium(){
        return HIGH;
    }
    //@Override
    public static String category(){
        return "Car Insurance";
    }

}
