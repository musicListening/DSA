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
public class UnboundedArray {

    private int[] arr;
    private int top;
    private int capacity;

    public UnboundedArray() {
        capacity = 2; 
        arr = new int[capacity];
        top = -1; 
    }

    public void push(int data) {
        if (top == capacity - 1) {
            resize(capacity * 2); // Double the size
        }
        
        top++;
        arr[top] = data;
        System.out.println("Pushed: " + data);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int data = arr[top];
        top--;
        if (top > -1 && top < capacity / 4) {
            resize(capacity / 2);
        }
        
        return data; }
    private void resize(int newCapacity) {
        System.out.println(">> Resizing stack capacity from " + capacity + " to " + newCapacity);
        int[] tempArr = new int[newCapacity];
        
        for (int i = 0; i <= top; i++) {
            tempArr[i] = arr[i];
        }
        
        arr = tempArr;
        capacity = newCapacity;
    }
    public static void main(String[] args) {
        UnboundedArray stack = new UnboundedArray();
        stack.push(10);
        stack.push(20);
        stack.push(30); 
        stack.push(40);
        stack.push(50); 
        
        // Trigger shrinking
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop()); 
    }
    }
   

