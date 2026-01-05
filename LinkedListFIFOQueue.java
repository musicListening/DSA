/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Akarsha
 */
public class LinkedListFIFOQueue {

   class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; 
    private Node rear;  

    public LinkedListFIFOQueue() {
        this.front = null;
        this.rear = null;
    }

   
    public void enqueue(int key) {
        Node newNode = new Node(key);

        
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println("Enqueued: " + key);
            return;
        }

        
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println("Enqueued: " + key);
    }

    
    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

       
        int data = this.front.data;
        this.front = this.front.next;

        
        if (this.front == null) {
            this.rear = null;
        }
        
        return data;
    }

    public static void main(String[] args) {
         LinkedListFIFOQueue q = new LinkedListFIFOQueue();
        q.enqueue(100);
        q.enqueue(200);
        
        System.out.println("Dequeued: " + q.dequeue()); // 100
        System.out.println("Dequeued: " + q.dequeue()); // 200
        
        q.enqueue(300);
        System.out.println("Dequeued: " + q.dequeue()); // 300
    }
    
}
