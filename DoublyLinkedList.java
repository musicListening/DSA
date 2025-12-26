/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Akarsha
 */
public class DoublyLinkedList {

     class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
        System.out.println("Added: " + data);
    }

    
    public void deleteNode(int key) {
        Node current = head;

        
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node " + key + " not found.");
            return;
        }

        
        if (current == head) {
            head = current.next;
            if (head != null) head.prev = null;
        }
        
        else if (current == tail) {
            tail = current.prev;
            if (tail != null) tail.next = null;
        }
        
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Deleted: " + key);
    }

    public void display() {
        Node current = head;
        System.out.print("Doubly Linked List (Forward): ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");}
    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addNode(10);
        dList.addNode(20);
        dList.addNode(30);
        
        dList.display();
        
        dList.deleteNode(20);
        dList.display();}
    
}
