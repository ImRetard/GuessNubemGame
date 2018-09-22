package lesson_32_genlinkidlist;

import java.util.Scanner;

public class LinkedList<T extends Comparable> {
    Node<T> head;

    public void append(T data) {
        Node<T> someNode = new Node(data);
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
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public Node<T> findItem() {
        Scanner ch = new Scanner(System.in);
        System.out.println("\nEnter search index: ");
        int index = ch.nextInt();
        Node<T> startNode = head;
        int counter = 0;
        while (startNode != null) {
            if (index == counter) {
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

    public void deleteItem(T delData) {
        Node<T> currentNode;
        Node<T> prevNode=null;
        currentNode = head;

        if (currentNode != null && (currentNode.data.compareTo(delData)) == 0) {
            head = currentNode.nextNode;
            return;
        }
        while (currentNode != null && (currentNode.data.compareTo(delData)) != 0) {
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        if (currentNode == null) {
            System.out.println("No element with such data");
            return;

        }
        //currentNode.previousNode = currentNode.nextNode;
        prevNode.nextNode=currentNode.nextNode;


    }
}
