package lesson01;


import java.math.BigInteger;
import java.util.Arrays;

public final class Quiz {
    public final int pp;
    public static final int pp1=1;

    public Quiz(){
        this.pp = 1;
    }
    public static void main(String[] args) throws Exception {

        //java.lang.Double

    }


    private final static void task2412() {
        String[] roles ={
            "Городничий",
            "Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич"};
        String[] text = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String str1, str2,str3,res_str="";
        StringBuilder[] res = new StringBuilder[roles.length];
        for (int i=0;i<roles.length;i++){
            res[i] = new StringBuilder();
        }

        for (int i=0;i<text.length;i++){
            str1 = text[i];
            str2 = str1.substring(0,str1.indexOf(":"));
            str3= str1.substring(str1.indexOf(":")+1);
            for (int j=0;j<roles.length;j++){
                if (roles[j].equals(str2)){
                    res[j].append((i+1) + ")" + str3 + '\n');
                    break;
                }
            }
        }
        for (int i=0;i<roles.length;i++){
            res_str+=roles[i]+":"+'\n'+res[i].toString()+'\n';
        }
        System.out.println(res_str);
    }

    private static void task2411() {
        //        int[] a2 = {1,2,3};
//        int[] a1 = {4,4};
//        int[] a2 = {1,2,3};
//        int[] a1 = {};
        int[] a2 = {1,2,3,5};
        int[] a1 = {4,4,4,6};


        int n1,n2,i1=0,i2=0,ir=0;
        if(a1.length==0 && a2.length==0) {
            n1=0;
            n2=0;
        }
        else if (a1.length==0){
            n2=a2[0];
            n1=a2[a2.length-1];
        }
        else if (a2.length==0){
            n1=a1[0];
            n2=a1[a1.length-1];
        }
        else{
            n1=a1[0];
            n2=a2[0];
        }

        int[] res = new int[a1.length+a2.length];
        while (ir<=res.length-1){
            while (i2<=a2.length-1 && (n2<=n1 || i1==a1.length)) {
                res[ir]=a2[i2];
                ir++;
                i2++;
                if (i2<a2.length){
                    n2=a2[i2];
                }
                else{
                    break;
                }
            }
            while (i1<=a1.length-1 && (n1<=n2 || i2==a2.length)) {
                res[ir]=a1[i1];
                ir++;
                i1++;
                if (i1<a1.length){
                    n1=a1[i1];
                }
                else{
                    break;
                }
            }

        }
        //return res;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(res));
    }

    private static void task247_BigInt() {
        BigInteger bi = BigInteger.valueOf(1);
        for (long i=1;i<=10;i++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi.toString());
    }

    private static void switch_() {
        String s = "A";
        char ch = 'A';
        boolean bl = true;
        float fl = 0.1F;
        long l = 1L;
        int i = 1;

        switch (s){
            case "A":
                s="A";
        }
        switch (ch){
            case 'A':
                ch='A';
        }
//        switch (bl){
//            case true:
//                bl=true;
//        }
    }

    private static void task239() {
        String s = "Was it a cat I saw?";
        String s2 = s.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();

        System.out.println(sb.toString().equals(s2));

        System.out.println(s2);
    }

    private static void taskTill239() {
        long l1=1L;
        float f1=2F;
        char ch1 = 'a';
        Character ch2 = 'b';
        String st1 = "3";
        int i1=4;
        byte b1 = 5;
        boolean bl = true;

        f1=l1;
        System.out.println(f1);
        ch2=ch1;
        System.out.println(ch2);
        //i1=st1;
        l1=i1;
        System.out.println(l1);
        //ch1=b1;
        //l1=f1;
        i1=ch1;
        //b1=i1;

        //System.out.println(Integer.bitCount(-4));

        //st1='A'+'1'+"2";
        //st1="A"+12;

        //System.out.println('A'+'1'+"2");
        System.out.println("A"+12);
        System.out.println('A'+"12");
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println((int)'\t');
        System.out.println((int)'\u0003');
        System.out.println((int)'A');
        System.out.println('\t' + '\u0003');
    }



}
