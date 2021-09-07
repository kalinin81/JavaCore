package task425;



public class Main {

    public static void main(String[] args) throws Ex{
        System.out.println(tryCatchFinally());

    }

    private static String tryCatchFinally() throws Ex{
        //String res = null;
        //int i = 1/0;
        try {
            //int i = 1/0;
            //System.out.println("try " +i);
            //throw new Ex();
            //System.exit(0);
            return "return try";
            //break;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            //int y=1/0;
            throw new Ex();
        }
        finally {
            System.out.println("finally");
           // BigInteger
        }
        //return "end of tryCatchFinally";
    }

    public static class Ex extends Exception{
        public String getMessage(){
            return "Ex";
        }
    }

    class C implements AutoCloseable{
        public void close(){

        }
    }

}
