import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;

public class task5_3_12 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader isr = new InputStreamReader(System.in);
        StringBuilder sb = new StringBuilder("");
        int count;
        char[] chars = new char[1024];
        while ((count = isr.read(chars, 0, chars.length)) != -1) {
            sb.append(chars);
        }

        //String[] array = br.readLine().split(" ");
        //line.split()
        //String s =
//                //"aa bb\ncc dd"
//                //"-1e4 18 .111 11bbb"
//                "1 2 3"
         //       "1 2\n3"
         //       ;
        String s = sb.toString();
        //System.out.println(s);
        //System.in
        //Reader
        //InputStreamReader
        //Class
        String[] array = s.split("\\s");
        //Double sum = 0.000000, parse = 0.000000;
        BigDecimal bd = new BigDecimal(0d);

        for (String str: array) {
            //System.out.println(str);
            try {
                //parse = Double.parseDouble(str);
                bd = bd.add(BigDecimal.valueOf(Double.parseDouble(str)));
            } catch (NumberFormatException e) {
                //parse = 0.000000;
            }
            //sum += parse;
        }
        //Formatter
        //Double.
        //BigDecimal bd = new BigDecimal(sum
                //,
                //MathContext.DECIMAL32
                //new MathContext(9)
        //);
        //bd.setScale(1, RoundingMode.HALF_UP);
        //System.out.println(sum);
//        System.out.println(bd);
//        System.out.println(bd.scale());
//        BigDecimal bd1 = new BigDecimal(0.1);
//        System.out.println(
//                bd1
//        );
//        System.out.println(
//                bd1.scale()
//        );
//        System.out.println(
//                bd1.precision()
//        );
        //System.out.format("str %.3f %.6f",0.1,bd1).println();
        System.out.format("%.6f",bd).println();
    }
}
