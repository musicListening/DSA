/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Akarsha
 */
public class LinkedListStack {
class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; 

    public LinkedListStack() {
        this.top = null;
    }

    
    public void push(int x) {
        Node newNode = new Node(x);
        
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top; 
            top = newNode;      
        }
        System.out.println("Pushed " + x);
    }

    
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        
        int data = top.data;
        top = top.next; 
        return data;
    }

    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack (Top -> Bottom): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.printStack();
        
        System.out.println("Popped: " + stack.pop()); //  30
        stack.printStack();}
    
}
