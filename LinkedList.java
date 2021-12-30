package com;

public class LinkedList {

    private Node head;
    private int counter;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        counter++;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        counter++;
    }

    public void insertNthPos(int data, int pos) {
        Node newNode = new Node(data);
        int countNode = 0;
        Node prev = head;
        if (head == null) {
            head = newNode;
        } else if (pos < 0 || pos > counter) {
            System.out.println("Invalid Position");
        } else if (pos - 1 == 0) {
            add(data);
        } else {
            Node temp = head;
            while (countNode < pos - 1) {
                prev = temp;
                temp = temp.getNext();
                countNode++;
            }
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
            counter++;
        }
    }

    public void pop() {
        if (head == null)
            System.out.println("List Empty");
        else if (head.getNext() == null) {
            System.out.println(head.getData() + " Removed...");
            head = null;
            counter--;
        } else {
            Node temp = head;
            System.out.println(temp.getData() + " Removed...");
            head = head.getNext();
            temp.setNext(null);
            counter--;
        }
    }

    public void popLast() {
        if (head == null)
            System.out.println("List Empty");
        else if (head.getNext() == null) {
            System.out.println(head.getData() + " Removed...");
            head = null;
            counter--;
        } else {
            Node temp = head;
            Node prev = head;
            while (temp.getNext() != null) {
                prev = temp;
                temp = temp.getNext();
            }
            System.out.println(temp.getData() + " Removed...");
            prev.setNext(null);
            counter--;
        }
    }

    public void removeNthPos(int pos) {
        int countNode = 0;
        if (head == null)
            System.out.println("List Empty");
        else if (head.getNext() == null) {
            System.out.println(head.getData() + " Removed...");
            head = null;
            counter--;
        }
        else if (pos < 0 || pos > counter) {
            System.out.println("Invalid Position");
        } else if (pos - 1 == 0) {
            pop();
        } else {
            Node prev = head;
            Node temp = head;
            while (countNode < pos - 1) {
                prev = temp;
                temp = temp.getNext();
                countNode++;
            }
            System.out.println(temp.getData() + " Removed...");
            prev.setNext(temp.getNext());
            temp.setNext(null);
            counter--;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            System.out.println("Linked List: ");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " -> ");
                temp = temp.getNext();
            }
        }
    }
}
