package org.leetcodehard;

import java.util.HashMap;
import java.util.Map;

public class MaxPointinLine {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};

    }
    public int maxPoints(int[][] points) {
        if(points==null)
            return 0;
        int max =0;
        int res=0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int dealtx = points[j][0]-points[i][0];
                int dealty = points[j][1]-points[i][1];
                int gcd = gcd(dealtx, dealty);
                int dx = dealtx/gcd;
                int dy = dealty/gcd;
                String val = dx+":"+dy;
                map.put(val, map.getOrDefault(val,0)+1);
                max = Math.max(max, map.get(val));

            }
            res = Math.max(res, max+1);
        }
        return res;
    }
    public static int gcd(int a , int b){
        if(b==0) return a;
        else
            return    gcd(b,a%b);
    }
}