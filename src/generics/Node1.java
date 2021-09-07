package generics;

public class Node1 {

    public static void main(String[] args) {
        Node1 n = new Node1();
        n.main();
    }
    public void main(){
        Node n = new Node("str");
        MyNode mn = new MyNode(1);
        n.setData("str");
        mn.setData(1);
        //mn.setData("str");
    }

    public class Node {

        public Object data;

        public Node(Object data) { this.data = data; }

        public void setData(Object data) {
            System.out.println("Node.setData");
            this.data = data;
        }
    }

    public class MyNode extends Node {

        public MyNode(Integer data) { super(data); }


        @Override
        public void setData(Object data) {
            setData((Integer) data);
        }


        public void setData(Integer data) {
            System.out.println("MyNode.setData");
            super.setData(data);
        }
    }
}
