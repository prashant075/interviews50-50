package org.leetcodehard;

import java.util.Arrays;
import java.util.Stack;

public class Paypal {
    public static void main(String[] args) {

        /*
         *Input: s = "())))[]{}"
         * Output: true
         *
         *  )
         */
//        String str = "()[]{}";
//        System.out.println(checkParanthsis(str));
        String str1 = "(()[]{}";
        System.out.println(checkParanthsis(str1));



        System.out.println(Day.values());

    }

    private static boolean checkParanthsis(String str) {
        //()[]{}"

        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch=='('){
                stack.push(')');
            } else if(ch=='['){
                stack.push(']');
            } else if (ch=='{'){
                stack.push('}');
            }else {
                char t = stack.pop();
                if(t != ch) return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
        }
    //Input: matrix ={ {1,2,3,1},
                        // {4,5,6,1},
                        // {7,8,9,1} }
    //Input: matrix = {{0,1,2,0},
                    // {3,4,0,0},
                    // {1,3,0,1}}
//    452
//    315
    public void printSpiral(int[][] matrix){

/*
*  step 1 is any zero startrowZero
* step 2 is any zero startcolZero
* Step3 row+1 , col+1 till row-1, col-1 start marking zero
*
* step 4 if startrow make shole zero
* step 5 startcol mark whole zero
*
* */

    }
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }




}
