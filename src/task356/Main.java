package task356;

import java.lang.String;

public class Main {

    public static class AsciiCharSequence implements CharSequence{
        //Твой код здесь
        private byte[] arr;
        public AsciiCharSequence(byte[] arr){
            this.arr=arr;
        }

        @Override
        public int length(){
            return arr.length;
        }

        @Override
        public char charAt(int i){
            return (char) arr[i-1];
        }

//        @Override
//        public byte[] subSequence(int beginIndex){
//            byte[] res = new byte[arr.length-beginIndex];
//            for(int i=beginIndex;i<arr.length;i++){
//                res[i-beginIndex]=arr[i];
//            }
//            return res;
//        }
//
        @Override
        public AsciiCharSequence subSequence(int beginIndex, int endIndex){
            byte[] res = new byte[endIndex-beginIndex+1];
            for(int i=beginIndex;i<=endIndex;i++){
                res[i-beginIndex]=arr[i];
            }
            return new AsciiCharSequence(res);
        }

        @Override
        public String toString(){
            String res="";
            for (byte i:arr){
                res+=(char)i;
            }
            return res;
        }

    }

    public static void main(String[] args){

    }

}
