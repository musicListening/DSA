/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Akarsha
 */
import java.util.Stack;
public class QueueStackPopFriendly {

    /**
     * @param args the command line arguments
     */
    private Stack<Integer> mainStack;
    private Stack<Integer> helperStack;

    public QueueStackPopFriendly() {
        mainStack = new Stack<>();
        helperStack = new Stack<>();
    }

    
    public void enqueue(int x) {
        while (!mainStack.isEmpty()) {
            helperStack.push(mainStack.pop());
        }
        mainStack.push(x);
        while (!helperStack.isEmpty()) {
            mainStack.push(helperStack.pop());
        }
        
        System.out.println("Enqueued: " + x);
    }

    public int dequeue() {
        if (mainStack.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return mainStack.pop();}
    public static void main(String[] args) {
        QueueStackPopFriendly q = new QueueStackPopFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue()); 
    }
    
}
