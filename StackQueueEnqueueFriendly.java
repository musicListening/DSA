/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Akarsha
 */
import java.util.LinkedList;
import java.util.Queue;
public class StackQueueEnqueueFriendly {
    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;
    public StackQueueEnqueueFriendly() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }
    public void push(int x) {
        mainQueue.add(x);
        System.out.println("Pushed to stack: " + x);
    }
    public int pop() {
        if (mainQueue.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        while (mainQueue.size() > 1) {
            tempQueue.add(mainQueue.remove());
        }
        int topElement = mainQueue.remove();
        Queue<Integer> swap = mainQueue;
        mainQueue = tempQueue;
        tempQueue = swap;
        return topElement;
    }
    public static void main(String[] args) {
       StackQueueEnqueueFriendly s = new StackQueueEnqueueFriendly();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("Popped: " + s.pop()); 
        System.out.println("Popped: " + s.pop()); 
        
        s.push(4);
        System.out.println("Popped: " + s.pop());    }
    
}
