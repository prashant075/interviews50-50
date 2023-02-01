package org.leetcodehard;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(revser(s));
    }

    private static String revser(String s) {
        if(s.length()==0){
            return "";
        }
        String c = s.substring(0,1);
        return  revser(s.substring(1))+c;
    }
}
