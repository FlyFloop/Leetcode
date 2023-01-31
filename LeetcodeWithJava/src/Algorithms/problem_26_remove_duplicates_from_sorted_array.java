package Algorithms;

import java.util.ArrayList;

public class problem_26_remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrayL = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(arrayL));
    }
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i-1] != nums[i]){
                    nums[count] = nums[i];
                    count++;

                }
            }

            return count;
        }
    }
}
