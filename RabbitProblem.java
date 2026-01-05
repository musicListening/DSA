/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Akarsha
 */
public class RabbitProblem {

   public static int fibonacciRabbits(int n) {
        
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int pairs = fibonacciRabbits(n - 1) + fibonacciRabbits(n - 2);
        
        return pairs;
    }

    public static void main(String[] args) {
       
        int months = 12; // for 1 year
        
        System.out.println("--- Rabbit Population" + months);
        int totalPairs = fibonacciRabbits(months);
        int adultPairs = fibonacciRabbits(months - 1);
        int babyPairs = totalPairs - adultPairs;

       
        System.out.println("Total Pairs: " + totalPairs);
        System.out.println("Adult Pairs: " + adultPairs);
        System.out.println("Baby Pairs:  " + babyPairs);
        }
    }
    

