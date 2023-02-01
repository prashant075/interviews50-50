package company.a_21_fallabella;

import java.util.*;

public class OA {
    public static void main(String[] args) {
      //  collect();
        String a = "A";
        String b = new String(a);
        int value =0;
        value=(a==b)?1:2;
        System.out.println(value);


    }
    public static   void collect(){
        List<Integer> integers = new ArrayList<>(4);
        integers.add(3,1);
        System.out.println(integers);
    }
    public static   void collectMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        Collections.unmodifiableMap(map);
        map.put("b",2);
        System.out.println(map);
    }
    public static int getMinDeletions(String s) {
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        return s.length()-set.size();
    }
    public static int getMaxDeletions(String input) {
        Stack<Character> upDown = new Stack<>();
        Stack<Character> leftRight = new Stack<>();
        int size = input.length();

        for(char C : input.toCharArray()) {
            if(C == 'U' || C == 'D') {
                if(upDown.isEmpty() || upDown.peek() == C) {
                    upDown.push(C);
                } else if(! upDown.isEmpty()) {
                    upDown.pop();
                }

            } else {
                if(C == 'L' || C == 'R') {
                    if(leftRight.isEmpty() || leftRight.peek() == C) {
                        leftRight.push(C);
                    } else if (! leftRight.isEmpty()) {
                        leftRight.pop();
                    }
                }
            }
        }

        int output = size - (upDown.size() + leftRight.size());
        return output;

    }

    public static List<Integer> constructSequence(int n, int lower, int upper) {
        List<Integer> sol = new ArrayList<>();
        int totalNumbers = (upper-lower+1);
        if(n > totalNumbers*2 - 1){
            sol.add(-1);
            return sol;
        }

        int startPoint = upper - 1;
        if(n > totalNumbers + 1){
            startPoint = upper - (n - totalNumbers);

        }
        while(startPoint <= upper){
            sol.add(startPoint);
            startPoint++;
        }
        startPoint = upper - 1;
        while(startPoint >= lower){
            sol.add(startPoint);
            if(sol.size() == n)
                return sol;
            startPoint--;
        }
        return sol;
    }
    public static int getMin(String s) {
        int valid=0, result=0;
        for(int i=0;i<s.length();i++){
            valid += s.charAt(i)=='('?1:-1;
            if(valid==-1){
                result+=1;
                valid+=1;
            }
        }
        return valid+result;
    }

}

