/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Akarsha
 */
public class CircularDoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

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
            head.next = head; 
            head.prev = head; 
        } else {
            
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head; 
            head.prev = newNode; 
            tail = newNode;      
        }
        System.out.println("Added: " + data);
    }

    
    public void deleteNode(int key) {
        if (head == null) return;

        Node current = head;
        
        do {
            if (current.data == key) {
                
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                   
                    current.prev.next = current.next;
                    current.next.prev = current.prev;

                    
                    if (current == head) head = current.next;
                    
                    if (current == tail) tail = current.prev;
                }
                System.out.println("Deleted: " + key);
                return;
            }
            current = current.next;
        } while (current != head);
        
        System.out.println("Node " + key + " not found.");}

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(Back to Head)");}
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.addNode(1);
        cdll.addNode(2);
        cdll.addNode(3);
        
        cdll.display();
        
        cdll.deleteNode(2);
        cdll.display(); 
    }
    
}
