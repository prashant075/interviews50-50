package org.leetcodehard;

import java.util.*;

public class AlienDictionary {
    public static void main(String[] args) {
        String[] words = {"zy","zx"};
        Map<Character, Set<Character>> graph = new HashMap<>();
        int[] indegree = new int[26];
        for(String w: words){
            for(Character c: w.toCharArray()){
                graph.putIfAbsent(c, new HashSet<>());
            }
        }
        for(int i=1;i<words.length;i++){
            String word1 = words[i-1];
            String word2 = words[i];
            int min = Math.min(word1.length(),word2.length());
            for(int k=0;k<min;k++){
                char c1 = word1.charAt(k);
                char c2 = word2.charAt(k);
                if(c1!=c2){
                    if(!graph.get(c1).contains(c2)){
                        graph.get(c1).add(c2);
                        indegree[c2-'a']++;
                    }
                    break;
                }
            }

        }
        System.out.println(graph);
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(char c :graph.keySet()){
            if(indegree[c-'a']==0){
                queue.add(c);
                sb.append(c);
            }
        }
        while (!queue.isEmpty()){
            char c = queue.poll();
            for(char next:graph.get(c) ){
               indegree[next-'a']--;
               if(indegree[next-'a']==0){
                   sb.append(next);
                   queue.add(next);
               }
            }
        }
        //return sb.length()!=graph.size()?"":sb.toString();
        System.out.println(sb.toString());
    }


}
