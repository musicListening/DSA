/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package submission4;

/**
 *
 * @author Akarsha
 */
public class BubbleSort {
    public static void main(String[] args) {
       int[] nums = {64, 34, 25, 12, 22, 11, 90};
        int size = nums.length;
        System.out.println("Start Bubble Sort");

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
