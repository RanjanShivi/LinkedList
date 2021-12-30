package com;

import java.util.Scanner;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("ADD");
        list.add(70);
        list.add(30);
        list.add(56);
        list.printList();

        System.out.println("\nAPPEND");
        list.append(70);
        list.append(30);
        list.append(56);
        list.printList();

        System.out.println("\nINSERT AT Nth POSITION");
        list.insertNthPos(70, 1);
        list.insertNthPos(30, 2);
        list.insertNthPos(56, 3);
        list.printList();


    }
}
