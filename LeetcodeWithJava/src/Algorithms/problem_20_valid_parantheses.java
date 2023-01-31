package Algorithms;

public class problem_20_valid_parantheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println( solution.validParantheses("()[]{}"));
    }
    static class Solution {
        public boolean validParantheses(String strs) {
           int count = strs.length();
           int tem = 0;
           while (count > 0) {
               if (strs.charAt(tem) == '(' && strs.charAt(tem+1) == ')') {

               }
               else if (strs.charAt(tem) == '{' && strs.charAt(tem+1) == '}') {

               }
               else if (strs.charAt(tem) == '[' && strs.charAt(tem+1) == ']') {

               }
               else {
                   return false;
               }
               count += 2;
           }
            return true;
    }
}
}
