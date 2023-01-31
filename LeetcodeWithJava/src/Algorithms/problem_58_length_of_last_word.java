package Algorithms;

import java.util.ArrayList;

public class problem_58_length_of_last_word {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
    }
   static class Solution {
        public int lengthOfLastWord(String s) {
            ArrayList<Integer> n = new ArrayList<>();
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length() - 1 && s.charAt(i) != ' '){
                    counter++;
                    if (counter != 0){
                        n.add(counter);
                    }
                }
                if (s.charAt(i) != ' '){
                    counter++;
                }
                else{
                    if (counter != 0){
                        n.add(counter);
                    }
                    counter = 0;
                }
            }

            return n.get(n.size() - 1);
        }
    }
}
