package StreamAPI;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task7_2_11 {
    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T max = null;
        T min = null;
        T[] array = (T[]) stream.sorted(order).toArray();
        if (array.length != 0) {
            max = order.compare(array[0], array[array.length-1]) > 0 ? array[0] : array[array.length-1];
            min = order.compare(array[0], array[array.length-1]) > 0 ? array[array.length-1] : array[0];
        }
        minMaxConsumer.accept(min, max);
    }

}
