public class task3_3_12 {

    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human((byte)10, "name", "secondName", "sport");
        Human h3 = new Human((byte)10, "name", "secondName");
    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {
            int[] fff = new int[1];
            //Throwable

        }
        public Human(byte age, String name, String secondName, String favoriteSport) {
            this(age, name, secondName);
            this.favoriteSport = favoriteSport;
        }
        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
        //StringBuilder
        //Arrays.
    }
}
