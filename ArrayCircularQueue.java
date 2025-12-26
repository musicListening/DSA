/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

public class ArrayCircularQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue Overflow: Cannot add " + data);
            return;
        }

        
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            
            rear = (rear + 1) % capacity;
        }
        
        arr[rear] = data;
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int data = arr[front];

        
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            
            front = (front + 1) % capacity;
        }
        
        return data;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        q.dequeue(); 
        q.dequeue(); 
        
        
        q.enqueue(60); 
        q.enqueue(70); 
        
        q.display(); //   30 40 50 60 70
    }
}
    
