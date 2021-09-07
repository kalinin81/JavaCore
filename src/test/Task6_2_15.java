package test;

import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6_2_15 {
    public static void main(String[] args) {
        String str =
        "name1 1\n" +
        "name2 2\n" +
        "name3 3\n" +
        "name2 4\n" +
        "name3 5";

        Reader reader = new StringReader(str);
        Scanner scanner = new Scanner(reader);
        Map<String, Long> map = new HashMap<String, Long>();
        while (scanner.hasNextLine()) {
            String s = scanner.next();
            Long l = scanner.nextLong();
            //System.out.println(s + " gg " + l);
            map.merge(s, l, Long::sum);
        }
        System.out.println(map);
    }
}
