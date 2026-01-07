/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package submission4;

/**
 *
 * @author Akarsha
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {12, 11, 13, 5, 6};
        int size = nums.length;
        System.out.println("Start Insertion Sort");

        for (int i = 1; i < size; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        System.out.print("Sorted: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
