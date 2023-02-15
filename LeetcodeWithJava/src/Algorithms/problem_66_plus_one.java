package Algorithms;

public class problem_66_plus_one {
    /*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
     */
    public static void main(String[] args) {
        Solution  solution = new Solution();
        int[] array = {9};
        int [] result = solution.plusOne(array);
        for (int number :
                result) {
            System.out.print(number);
        }

    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            int tempNumber = 0;
            int[] result = new int[digits.length];
            int timesCounter = 1;
            int count = digits.length;
            while(count > 0){
                tempNumber += (timesCounter * digits[count - 1]);
                timesCounter *= 10;
                count--;
            }
            tempNumber++;
            count = digits.length;
            while (count > 0){
                if (tempNumber == 10 ){
                    int[] exceptionResult = new int[2];
                    exceptionResult[0] = 1;
                    exceptionResult[1] = 0;
                    return exceptionResult;
                }
                result[count-1] = tempNumber % 10;
                tempNumber /= 10;
                count--;
            }
            return  result;
        }
    }
}
