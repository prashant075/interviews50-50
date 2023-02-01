package org.leetcodehard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Median {
    public static void main(String[] args) {
        int[] array = new int[]{5,3,1,4,7,7,8};
        solve(6,array,2);
        //[4], [1,4,7], [5,3,1,4,7], [3,1,4,7,7]
    }

    static void  solve(int n, int[] v, int k) {
        int[] smaller = new int[n];
        int[] bigger = new int[n];
        int[] dp = new int[n];
        k -= 1;
        for (int i = 0; i < n; i++)
            if (v[i] < v[k]) {
                ++smaller[i];
            }

        for (int i = 0; i < n; i++)
            if (v[i] > v[k]) {
                ++bigger[i];
            }
        for (int i = 0; i < n; i++)
            dp[i] = smaller[i] - bigger[i];

    int ans =  subarraySum(0, n, dp) -  subarraySum(0, k - 1, dp) - subarraySum(k + 1, n, dp);
    System.out.println(ans);
    }
    public static int subarraySum(int start, int end, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum =0, count=0;
        map.put(0,1);
        for(int i=start;i<end;i++){
            sum +=nums[i];
            if(map.containsKey(sum)){
                count +=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

}
/**
 *
 * int sum(int start, int end, vector<int>& v) {
 *
 *     unordered_map<ll, ll> prevSum;
 *     int res = 0, currSum = 0;
 *     for (int i = start; i < end; i++) {
 *         currSum += v[i];
 *         if (currSum == 0)
 *             res++;
 *         if (prevSum.find(currSum - 0) != prevSum.end())
 *             res += (prevSum[currSum - 0]);
 *         prevSum[currSum]++;
 *     }
 *
 *     return res  ;
 * }
 *
 * void solve(int n, vector<int>&v, int k){
 *     vector<int>smaller(n, 0), bigger(n, 0), d(n, 0) ;
 *     k-= 1;
 *     for(int i = 0 ; i < n; i++)
 *         smaller[i] = v[i] < v[k];
 *
 *     for(int i = 0 ; i < n; i++)
 *         bigger[i] = v[i] > v[k] ;
 *
 *     for(int i = 0 ; i< n; i++)
 *     d[i] = smaller[i] - bigger[i] ;
 *
 *     cout<< sum(0, n, d) - sum(0, k, d) - sum(k+1, n, d)  ;
 * }
 */

