/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.LinkedList;
import java.util.Queue;
public class StackQueuePopFriendly {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackQueuePopFriendly() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
      public void push(int x) {
        
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        System.out.println("Pushed: " + x);
    }

    
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return q1.remove();
    }
    public static void main(String[] args) {
        StackQueuePopFriendly s = new StackQueuePopFriendly();
        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println("Popped: " + s.pop()); //30
        System.out.println("Popped: " + s.pop()); // 20
    }
    
}
