package Algorithms;

public class problem_35_search_insert_position {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrayL = new int[]{1,3,5,6,16,123};
        System.out.println(solution.searchInsert(arrayL,19));
    }
 static class Solution {
       public int searchInsert(int[] nums, int target) {
           int left = 0;
           int right = nums.length - 1;
           while (left <= right){
               int middle = left + (right - left )/2;
               if (target < nums[middle]){
                   right = middle - 1;
               }
               else if (target > nums[middle]){
                   left = middle + 1;
               }
               else {
                   return middle;
               }
           }
           //çünkü left + 1
           return left ;
     }
 }

}
