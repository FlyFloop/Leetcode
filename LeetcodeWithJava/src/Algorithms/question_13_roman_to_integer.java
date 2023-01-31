package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class question_13_roman_to_integer {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.romanToInteger("MCMXCIV");
        System.out.println(result);
    }
    static class Solution {
        /*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
         */
        public  int  romanToInteger(String input) {
            String[] safeInputs = {"I", "V", "X", "L", "C", "D", "M"};
            ArrayList<String> safeArrayList = new ArrayList<>();
            safeArrayList.addAll(List.of(safeInputs));

            int sum = 0;
            if (input.length() > 15 || input.length() < 1){
                return -1;
            }
            for (int i = 0; i < input.length(); i++) {
                if (safeArrayList.contains(String.valueOf(input.charAt(i)))){
                    continue;
                }
                else{
                    return -1;
                }
            }

            for (int i = 0; i < input.length(); i++) {
                //old way..
                if(input.charAt(i) == 'I' && input.charAt(i+1) == 'V'){
                    sum += 4;
                    i++;
                    continue;
                }
                 if(input.charAt(i) == 'I' && input.charAt(i+1) == 'X'){
                    sum += 9;
                     i++;
                    continue;
                }
                 if(input.charAt(i) == 'X' && input.charAt(i+1) == 'L'){
                    sum += 40;
                     i++;
                    continue;
                }
                 if(input.charAt(i) == 'X' && input.charAt(i+1) == 'C'){
                    sum += 90;
                     i++;
                    continue;
                }
                 if(input.charAt(i) == 'C' && input.charAt(i+1) == 'D'){
                    sum += 400;
                     i++;
                    continue;
                }
                  if(input.charAt(i) == 'C' && input.charAt(i+1) == 'M'){
                    sum += 900;
                      i++;
                    continue;
                }
                 if (input.charAt(i) == 'I'){

                    sum += 1;
                }
                 if (input.charAt(i) == 'V'){
                    sum += 5;
                }
                 if (input.charAt(i) == 'X'){
                    sum += 10;
                }
                 if (input.charAt(i) == 'L'){
                    sum += 50;
                }
                  if (input.charAt(i) == 'C'){
                    sum += 100;
                }
                  if (input.charAt(i) == 'D'){
                    sum += 500;
                }
                  if (input.charAt(i) == 'M'){
                    sum += 1000;
                }
           

            }
            return sum;
        }
    }
}
