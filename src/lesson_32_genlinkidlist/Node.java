package lesson_32_genlinkidlist;

import java.util.Scanner;

public class Node <P>{
    public P data;
    public Node <P> nextNode;
    public Node <P> previousNode;

    public Node(P data) {
        this.data = data;
        nextNode = null;
        previousNode = null;
    }

    public P getData() {
        return data;
    }

    public void setData(P data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

}
