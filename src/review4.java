public class review4 {
    public static void main(String[] args) {
        try {
            int i = 1/0;
        } finally {
            int[] arr = new int[1];
            arr[1] = 1;
        }
    }
}
