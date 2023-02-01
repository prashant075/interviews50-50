package company.a_11_flyflyemirates;

import java.util.LinkedList;
import java.util.List;

public class LetterPermutation {
    public static void main(String[] args) {
        System.out.println(phoneCombination("23"));
    }
    public static List<String> phoneCombination(String input){
        List<String> res = new LinkedList<>();
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for(int i=0;i<input.length();i++){
            int size = res.size();
            for(int j=0;j<size;j++){
                String c = res.remove(0);
                for(char x: digitletter[input.charAt(i)-'0'].toCharArray()){
                    res.add(c+x);
                }
            }
        }
        return res;
    }
}
