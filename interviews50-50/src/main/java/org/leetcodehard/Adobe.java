package org.leetcodehard;

import java.util.Arrays;
import java.util.Stack;

public class Adobe {
    public static void main(String[] args) {
        int arr [] ={4,3,2,1};
        int[] res =nextGreater(arr);
        for(int each:res){
            System.out.println(each);
        }


    }
    public static int[]   nextGreater(int[] array){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[array.length];
        for(int i=0;i<array.length;i++){
            while(!stack.isEmpty() && array[stack.peek()]<array[i]){
                res[stack.peek()]= array[i];
                stack.pop();
            }

            stack.push(i);

        }
        while(!stack.isEmpty()){
            res[stack.pop()]=-1;
        }
        return  res;
    }
}
