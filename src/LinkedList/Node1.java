package LinkedList;

import java.util.Scanner;

public class Node1 {
    public int data;
    public Node1 nextNode;
    public Node1 previousNode;

    public Node1(int data) {
        this.data = data;
        nextNode = null;
        previousNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        Scanner ch=new Scanner(System.in);

        this.data = data;
    }

    public Node1 getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node1 nextNode) {
        this.nextNode = nextNode;
    }

    public Node1 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node1 previousNode) {
        this.previousNode = previousNode;
    }
}
