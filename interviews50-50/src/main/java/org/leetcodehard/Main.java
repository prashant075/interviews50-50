package org.leetcodehard;

public class Main {
    public static void main(String[] args) {

        System.out.println(gcd(16,4));
        System.out.println(check(new int[]{0,1,1,1,1}, new int[]{1,0,1,0,1}));
    }
    public static int gcd(int a , int b){
        if(b==0) return a;
        else
         return    gcd(b,a%b);
    }
    public static int check(int[] nums1, int[] nums2){
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int max=0;
        for(int i=0;i<=nums1.length;i++){
            for(int j=0;j<=nums2.length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]= Math.max(dp[i][j-1], dp[i-1][j])+1;
                    if(max<dp[i][j]){
                        max=dp[i][j];
                    }
                }else{
                    dp[i][j]=  dp[i-1][j-1];
                }
            }
        }
        return max;
    }
}