package org.leetcodehard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VaccinationDrive_Fi {
    public static void main(String[] args) {
        List<Integer> centreFrom = new ArrayList<>();
        centreFrom.add(1);
        centreFrom.add(1);
        centreFrom.add(1);
        centreFrom.add(2);
        centreFrom.add(3);
        centreFrom.add(3);
        centreFrom.add(5);
        centreFrom.add(4);

        List<Integer> centreTo = new ArrayList<>();
        centreTo.add(2);
        centreTo.add(3);
        centreTo.add(4);
        centreTo.add(5);
        centreTo.add(6);
        centreTo.add(7);

        List<Integer> status = new ArrayList<>();
        status.add(2);
        status.add(2);
        status.add(2);
        status.add(3);
        status.add(2);
        status.add(2);
        status.add(1);
        int res = findMinimumTime(6, centreFrom, centreTo, status);
        System.out.println(res);
    }
    static int findMinimumTime(int centreNodes, List<Integer> centreFrom, List<Integer> centreTo, List<Integer> status) {
        List<Integer>[] graph = new ArrayList[centreNodes];
        for(int i=0; i<centreNodes; i++)
            graph[i] = new ArrayList<>();
        for(int i=0; i<centreFrom.size(); i++)
        {
            graph[centreFrom.get(i)-1].add(centreTo.get(i)-1);
            graph[centreTo.get(i)-1].add(centreFrom.get(i)-1);
        }
        int surPlus=0;
        int difference=0;
        for(int each:status){
            if(each==1)surPlus++;
            else if(each==3)difference++;
        }
        int max = 0 ;
        if(surPlus<difference){
            for(int i=0; i<centreNodes; i++)
            {
                if(status.get(i)==1)
                    max = Math.max(max, bfs(centreNodes, graph, i, status, 3));
            }
        }else{
            for(int i=0; i<centreNodes; i++)
            {
                if(status.get(i)==3)
                    max = Math.max(max, bfs(centreNodes, graph, i, status,1));
            }
        }


        return max;
    }

    static int bfs (int centreNodes, List<Integer>[] graph, int start, List<Integer> status, int check)
    {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[centreNodes];
        q.add(start);
        visited[start]=true;
        int level = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size>0)
            {
                int node = q.poll();
                for(int neighbour : graph[node])
                {
                    if(!visited[neighbour])
                    {
                        if(status.get(neighbour)==check)
                            return level+1;
                        q.add(neighbour);
                        visited[neighbour]=true;
                    }
                }
                size--;
            }
            level++;
        }
        return -1;
    }
//    int findMinimumTime(int centreNodes, List<Integer> centreFrom, List<Integer> centreTo, List<Integer> status) {
//       int min_dist=0;
//       Queue<Pair> queue = new LinkedList<>();
//       for(int i=0;i<centreNodes;i++){
//           if(status.get(i)==1){
//               int start=i+1;
//               int dist=0;
//               queue.add(new Pair(start,dist));
//               boolean[] visited = new boolean[centreNodes+1];
//               while (queue.size()>0){
//                   Pair pair = queue.poll();
//                   int cur_node = pair.node;
//                   int cur_dist = pair.dist;
//                   visited[cur_node]=true;
//                   if(status.get(cur_node-1)==3){
//                       dist=cur_dist;
//                       break;
//                   }else{
//                       for(int j:centreFrom){
//                           if(j==cur_node && !visited[centreTo.get(j)-1]){
//                               queue.add(new Pair(centreTo.get(j)-1,cur_dist+1));
//                           }else if(j==cur_node && !visited[centreFrom.get(j)-1]){
//                               queue.add(new Pair(centreFrom.get(j)-1,cur_dist+1));
//                           }
//                       }
//                   }
//
//               }
//               min_dist =Math.max(dist,min_dist);
//           }
//       }
//        return min_dist;
//
//    }
//    class Pair{
//        int node;
//        int dist;
//        public Pair(int node, int dist){
//            this.node=node;
//            this.dist = dist;
//        }
//    }


}
