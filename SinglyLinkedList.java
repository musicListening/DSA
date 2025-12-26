/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Akarsha
 */
public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null; 

    
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Node added: " + data);
    }

    public void deleteNode(int key) {
        Node current = head;
        Node prev = null;

        
        if (current != null && current.data == key) {
            head = current.next;
            System.out.println("Deleted: " + key);
            return;
        }

        
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        
        if (current == null) {
            System.out.println("Key " + key + " not found");
            return;
        }

        
        prev.next = current.next;
        
        
        if (current == tail) {
            tail = prev;
        }
        System.out.println("Deleted: " + key);
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Singly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.display();
        sList.deleteNode(2);
        sList.display();}
    
}
