package Algorithms;

public class question_9_palindrome_number {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean result = sol.palindromnumber(-121);
        System.out.println(result);
    }
    static class Solution {
        public static boolean palindromnumber(int number) {
            if(number < 0){
                //negative number to positive number
                number = number * -1;
            }
            int tempNumber = number;
            int count = 0;
            int resultNumber = 0;
            int dividerNumber = number;
            while (tempNumber > 0 ){
                tempNumber /= 10;
                count++;
            }
            while(count > 0) {
                int dividedNumber = dividerNumber % 10;
                resultNumber = (resultNumber*10) + dividedNumber;
                dividerNumber /= 10;
                count--;
            }
            if(resultNumber == number){
                return true;
            }
            else{
                return false;
            }

        }
    }
}