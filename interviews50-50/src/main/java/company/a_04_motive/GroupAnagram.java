package company.a_04_motive;

import java.util.*;


public class GroupAnagram {
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
       Map<String, List<String>> map = new HashMap<>();
       for(String s: strs){
           char[] ch = s.toCharArray();
           Arrays.sort(ch);
           String str = String.valueOf(ch);
           if(!map.containsKey(str)) map.put(str, new ArrayList<>());
           map.get(str).add(s);
       }
       System.out.println(map.values());
    }
}
