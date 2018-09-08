package lesson_27;

import java.util.Scanner;

public class LinkedListt {
    Node head;

    public void insertAfter(int data) {
        Node currentNode = findItem();
        if (currentNode == null) {
            System.out.println("Empty current node");
        } else {
            Node newNode = new Node(data);
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;

        }
    }

    public void deleteItem() {
        Scanner ch = new Scanner(System.in);
        System.out.println("\nEnter search data: ");
        int data = ch.nextInt();

        Node currentNode;
        Node previous = null;
        currentNode = head;

        if (currentNode != null && currentNode.data == data) {
            head=currentNode.nextNode;
            return;
        }
        while (currentNode != null && currentNode.data != data) {
            previous = currentNode;
            currentNode = currentNode.nextNode;
        }
        if(currentNode==null){
            System.out.println("No element with such data");
            return;

        }
        previous.nextNode = currentNode.nextNode;

    }

    public void push(int data) {
        Node someNode = new Node(data);
        someNode.nextNode = head;
        head = someNode;
    }

    public void append(int data) {
        Node someNode = new Node(data);
        if (head == null) {
            head = someNode;
        } else {
            Node currentNode = head;
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
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public Node findItem() {
        Scanner ch = new Scanner(System.in);
        System.out.println("\nEnter search index: ");
        int index = ch.nextInt();
        Node startNode = head;
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

}
