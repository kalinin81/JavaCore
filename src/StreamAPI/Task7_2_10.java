package StreamAPI;

import java.util.stream.IntStream;

public class Task7_2_10 {
    public static void main(String[] args) {
        //System.out.println(
        IntStream.iterate(13, i -> i*i/10%1000).limit(10).forEach(System.out::println);
        //);
    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, i ->
                IntStream.of(2,3,4)
                        .map(n -> (int) ((int) (Math.pow(i,2) % Math.pow(10, n) / Math.pow(10, n-1)) * Math.pow(10, n-2)))
                        .sum()
        );
    }
}
