package Algorithms;

public class problem_27_remove_elements {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrayL = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(solution.removeElement(arrayL,0));
    }
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int indexer = nums.length;
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1 && nums[i] == val){
                    indexer--;
                }
                else if (i == 0){
                    nums[i] = nums[i+1];
                    indexer--;
                }
                else if (nums[i] == val) {
                    nums[i] = nums[i-1];
                    indexer--;
                }
            }
            return indexer;
        }
    }
}
