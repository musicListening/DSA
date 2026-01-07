/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package submission4;

/**
 *
 * @author Akarsha
 */
public class HanoiTower {

   public static void solve(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + start + " to " + end);
            return;
        }
        solve(n - 1, start, end, middle);
        System.out.println("Move disk " + n + " from " + start + " to " + end);
        solve(n - 1, middle, start, end);
    }
    public static void main(String[] args) {
        int disks = 3;
        System.out.println("Hanoi Tower with " + disks + " disks:");
        solve(disks, 'A', 'B', 'C');
    }
    
}
