package lesson_27;

public class Node <P extends Number> {
   public P data;
   public P nextNode;

    public Node(int data) {
        //this.data = (P)data;
        nextNode=null;
    }
}
