
public class task428 {

    public static void main(String[] args) throws Throwable {

        try (Robot r = new Robot()) {
            System.out.println("try1");
            r.move();
        }
        catch (MyEx e) {
            System.out.println("catch");
            //throw new MyEx(e.ex,e.getCause());
        }
        finally {
            System.out.println("fin");
        }
    }

    public static class Robot implements AutoCloseable{
        public void close(){
            System.out.println("close");
            //int i = 1/0;
            throw new MyEx("close");
        }
        public void move(){
            System.out.println("Move");
            //throw new MyEx("Move");
            //StackTraceElement
        }
    }

    public static class MyEx extends RuntimeException{
        public String ex;
        public MyEx(String ex){
            this.ex=ex;
        }
        public MyEx(String ex, Throwable cause){
            super(ex,cause);
        }
    }

//    public static void moveRobot (RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        for (int i = 1; i <= 3; i++) {
//            try (RobotConnection rc = robotConnectionManager.getConnection()) {
//                rc.moveRobotTo(toX, toY);
//                break;
//            } catch (RobotConnectionException e) {
//                if (i == 3 && !e.getStackTrace()[0].getMethodName().equals("close")) {
//                    throw e;
//                }
//            } catch (Throwable e) {
//                throw e;
//            }
//        }
//    }

}
