package test;

import java.util.*;

public class Task6_2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 2 3 4 5 6 7 8 9 10");
        //Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> array = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        boolean take = false;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (take) {
                //array.add(i);
                deque.addFirst(i);
                take = false;
            } else {
                take = true;
            }
        }
        //Collections.reverse(array);
        //for (Integer i: array) {
        for (Integer i: deque) {
            System.out.print(i + " ");
        }

        //System.out.println();Arrays.toString(array.toArray());

    }
}
