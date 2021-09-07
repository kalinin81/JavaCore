package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Task6_1_13 {

    public static class DynamicArray<T> {
        private Object[] array;
        private int currentIndex;

        public DynamicArray() {
            array = new Object[10];
        }
        public void add(T el) {
            if (currentIndex >= array.length) {
                array = Arrays.copyOf(array, array.length + 10);
            }
            array[currentIndex] = el;
            currentIndex++;
        }
        public void remove(int index) {
            if (index >= array.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.arraycopy(array, index+1, array, index, array.length - index - 1);
            currentIndex--;
        }
        public T get(int index) {
            if (index >= array.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return (T) array[index];
        }

    }

    public static void main(String[] args) {
        //DynamicArray<Integer> da = new DynamicArray<Integer>(10);

    }

}
