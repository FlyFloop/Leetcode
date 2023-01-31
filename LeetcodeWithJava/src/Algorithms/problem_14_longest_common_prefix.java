package Algorithms;

import java.util.ArrayList;
import java.util.Comparator;

public class problem_14_longest_common_prefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] n = new String[]{"flower", "flight", "flower"};
        System.out.println(solution.longestCommonPrefix(n));
    }
    /*

                     for (int j = 0; j < words.get(i).length(); j++) {
                    if (i == words.size() - 1){
                        if (words.get(i - 1).charAt(j) == words.get(words.size() - 1).charAt(j)){
                            System.out.println(words.get(i).charAt(j));

                        }
                    }

                    if (words.get(i).charAt(j) == words.get(i+1).charAt(j)){
                        System.out.println(words.get(i).charAt(j));
                    }
                }
     */
    static class Solution {
        public String longestCommonPrefix(String[] strs) {

            if(strs.length == 0){
                return "";
            }
            String prefix = strs[0];
            for(int i = 1 ; i < strs.length ; i++){
                String str = strs[i];
                while(str.indexOf(prefix) != 0){
                    prefix = prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix ;
        }
    }
}
