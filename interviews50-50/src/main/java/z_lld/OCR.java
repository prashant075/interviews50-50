package z_lld;

import java.util.ArrayList;
import java.util.List;

class OCR {
    public static void main(String[] args) {
        OCR ic   = new OCR();
        System.out.println(ic.solution("a23le", "2pl1"));
    }
    public boolean solution(String S, String T) {
        // write your code in Java SE 8
        String str1 = buildString(S);
        String str2 = buildString(T);
        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!='?' && str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public String buildString(String str){
        int start=0;
        StringBuilder sb = new StringBuilder();
        while(start<str.length()){
            char ch = str.charAt(start);
            if(Character.isDigit(ch)){
                int count=0;
                while(start<str.length() && Character.isDigit(str.charAt(start))){
                    count +=count*10 +(str.charAt(start)-'0');
                    start++;
                }
                for(int i=0;i<count;i++){
                    sb.append('?');
                }
            }else{
                sb.append(ch);
                start++;
            }
        }
        return sb.toString();
    }
//    public boolean solution(String S, String T) {
//
//        String source = process(S);
//        int j=0;
//
//        String target = process(T);
//        System.out.println(source+" "+target);
//
//        if(source.length()!=target.length()) // If source and target string lengths are not equal after processing then they can't be equal
//            return false;
//
//        for(int i=0;i<source.length();i++){
//            if(source.charAt(i)=='?' || target.charAt(i)=='?') // Every '?' can be replaced by any character
//            {
//            }
//            else if(source.charAt(i)!=target.charAt(i))    // If characters are not equals then it will be false
//                return false;
//        }
//        return true;
//    }
//
//    public String process(String str){
//        StringBuilder ocr = new StringBuilder();
//        int i=0;
//        int n = str.length();
//
//        while(i<n){
//            char c = str.charAt(i);
//            if(Character.isDigit(c)){
//                int count = 0;
//                while(i<n && Character.isDigit(str.charAt(i))){     // If character is a digit convert in to number by checking all the subsequent digits
//                    count = (count*10) + (str.charAt(i)-'0');
//                    i++;
//                }
//                for(int a=0;a<count;a++){
//                    ocr.append('?');
//                }
//            }
//            else{     //Append the character to the list, it can directly be appended to a String also, but I realized it later (It could have saved some extra space)
//                ocr.append(str.charAt(i));
//                i++;
//            }
//
//        }
//
//        return ocr.toString();
//    }
}
