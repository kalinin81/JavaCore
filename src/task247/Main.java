package task247;
//рекурсия


import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        System.out.println(factorial(-5));
    }

    public static BigInteger factorial(int value) {
        if (value <= 0){
            return BigInteger.valueOf(0);
        } else{
            BigInteger bi = BigInteger.valueOf(value);
            return value <= 1 ? bi : bi.multiply(factorial(value - 1));
        }
    }

}
