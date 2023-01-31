package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class question_1_two_sum {
    /*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.twoSumFunc(new int[]{21, 2, 7, 15,98}, 100);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
 static class Solution {
     public static int[] twoSumFunc(int[] array ,int target) {
         int[] arrayInt = new int[2];
         for (int i = 0; i < array.length; i++) {
             int tempV = target - array[i];
             for (int j = i+1; j < array.length; j++) {
                 if(array[j] == tempV){
                     arrayInt[0] = i;
                     arrayInt[1] = j;
                 }
             }
         }
         return  arrayInt;
     }
 }
}
