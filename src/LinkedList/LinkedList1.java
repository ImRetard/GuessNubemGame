package LinkedList;

import java.util.Scanner;

public class LinkedList1 {
    Node1 head;

    public void append(int data) {
        Node1 someNode = new Node1(data);
        if (head == null) {
            head = someNode;
        } else {
            Node1 currentNode = head;
            while (currentNode != null) {
                if (currentNode.nextNode == null) {
                    currentNode.nextNode = someNode;
                    break;

                }
                currentNode = currentNode.nextNode;
            }
        }
    }

    public void shovvList() {
        System.out.println("Linked List head --> tail");
        Node1 currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public Node1 findItem() {
        Scanner ch = new Scanner(System.in);
        System.out.println("\nEnter search index: ");
        int index = ch.nextInt();
        Node1 startNode = head;
        int counter = 0;
        while (startNode != null) {
            if (index == counter) {
                System.out.println(startNode.data);
                break;
            }
            counter++;
            startNode = startNode.nextNode;

        }
        if (startNode == null) {
            System.out.println("No element with such index");
        }
        return startNode;
    }
    public void deleteItem() {
        Scanner ch = new Scanner(System.in);
        System.out.println("\nEnter search data: ");
        int data = ch.nextInt();

        Node1 currentNode;
        currentNode = head;

        if (currentNode != null && currentNode.data == data) {
            head=currentNode.nextNode;
            return;
        }
        while (currentNode != null && currentNode.data != data) {
            currentNode.previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        if(currentNode==null){
            System.out.println("No element with such data");
            return;

        }
        currentNode.previousNode = currentNode.nextNode;

    }
}
