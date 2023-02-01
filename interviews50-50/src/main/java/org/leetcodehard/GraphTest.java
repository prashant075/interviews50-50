package org.leetcodehard;

import z_lld.serveyRatingService.Questions;

import java.util.*;

public class GraphTest {
    public static int solution(int[] T, int[] A){
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int i=0;i<T.length;i++){
            graph.put(i, new ArrayList<>());
            graph.get(i).add(T[i]);
        }
        graph.get(0).remove(0);
        System.out.println(graph);
        int[] visited = new int[100];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<A.length;i++){
            queue.add(A[i]);
        }
        while (!queue.isEmpty()){
            int val = queue.poll();
            if(visited[val]!=1){
                ++visited[val];
            }
            for(int nbh:graph.get(val)){
                queue.add(nbh);
            }
        }
        for(int val:visited){
            System.out.print(val+" ");
        }
        return 1;
    }


    public static void main(String[] args) {
        int [] arr={0,0,1,1};
        int [] a= {2};
        solution(arr, a);
        int [] ar1={0,0,0,0,2,3,3};
        int [] a1= {2,5,6};
        solution(ar1, a1);
        int [] ar2={0,3,0,0,5,0,5};
        int [] a2= {4,2,6,1,0};
        solution(ar2, a2);
    }
}
