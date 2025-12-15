/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Akarsha
 */
import java.util.Stack;
public class QueueStackPushFriendly {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public QueueStackPushFriendly() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    public void enqueue(int x) {
        inputStack.push(x);
        System.out.println("Enqueued: " + x);
    }
    public int dequeue() {
        if (outputStack.isEmpty() && inputStack.isEmpty()) {
            System.out.println("Error: Queue is empty.");
            return -1;
        }
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }
    public static void main(String[] args) {
        QueueStackPushFriendly q = new QueueStackPushFriendly();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        System.out.println("Removed: " + q.dequeue());  
        System.out.println("Removed: " + q.dequeue());  
        q.enqueue(4);
        System.out.println("Removed: " + q.dequeue()); 
    }
}
