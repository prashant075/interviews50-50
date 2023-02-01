package company.a_10_akamai;

import java.util.*;

public class TopologicalSort {

    public static List<String> topological( HashMap<String, String[]> map){
       Map<String, Integer> indgreeMap = new HashMap<>();
       for(Map.Entry<String, String[]> entry:map.entrySet()){
           indgreeMap.put(entry.getKey(), entry.getValue().length);
       }
       Map<String, List<String>> graph = new HashMap<>();
       for(Map.Entry<String, String[]> entry:map.entrySet()){
           String check = entry.getKey();
           for(String val:entry.getValue()){
               if(!graph.containsKey(val))
                   graph.put(val, new ArrayList<>());
               graph.get(val).add(check);

           }
       }
       Queue<String> queue = new LinkedList<>();
        for(Map.Entry<String, Integer> entry:indgreeMap.entrySet()){
           if(entry.getValue()==0){
               queue.add(entry.getKey());
           }
        }
        List<String> res = new ArrayList<>();
        while (!queue.isEmpty()){
            String s = queue.poll();
            res.add(s);
            if(graph.containsKey(s)) {
                for (String nbr : graph.get(s)) {
                    indgreeMap.put(nbr, indgreeMap.get(nbr) - 1);
                    if (indgreeMap.get(nbr) == 0) {
                        queue.add(nbr);
                    }
                }
            }

        }
       return res;
    }
    public static void main(String[] args) {
        HashMap<String, String[]> map = new HashMap<>();
        map.put("A", new String[]{"E","F"});
        map.put("B", new String[]{"C"});
        map.put("C", new String[]{"D"});
        map.put("D", new String[]{"E"});
        map.put("E", new String[]{});
        map.put("F", new String[]{});
        System.out.println(topological(map));
        System.out.println(Character.isLetter('a'));
    }
}
