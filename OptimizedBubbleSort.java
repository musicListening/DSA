/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package submission4;

/**
 *
 * @author Akarsha
 */
public class OptimizedBubbleSort {
    public static void main(String[] args) {
        int[] nums = {64, 34, 25, 12, 22, 11, 90};
        int size = nums.length;
        boolean swapped;
        System.out.println("Start Optimized Bubble Sort");

        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        System.out.print("Sorted: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    
    }
    
}
