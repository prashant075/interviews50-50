package company.a_02_twilio;


public class LenFivePalSeq {
    public static void main(String[] args) {
        System.out.println(solve("010110"));
    }

    private static long solve(String s){
        long ans = 0;
        int len = s.length();
        long[][] dp = new long[len][len];

        /* compute how many palindromes of length 3 are possible for every 2 characters match */
        for(int i = len - 2;i >= 0; --i){
            for(int j = i + 2; j < len; ++j){
                dp[i][j] = dp[i][j-1] + (dp[i + 1][j] == dp[i + 1][j-1] ? 0 : dp[i + 1][j] - dp[i + 1][j - 1]);
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] += j - i - 1;
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(" "+dp[i][j]);
            }
            System.out.println();
        }

        /* re-use the above data to calculate for palindromes of length 5*/
        for(int i = 0; i < len; ++i){
            for(int j = i + 4; j < len; ++j){
                if(s.charAt(i) == s.charAt(j)){
                    ans += dp[i + 1][j - 1];
                }
            }
        }

        //for(int i=0;i<len;++i) System.out.println(Arrays.toString(dp[i]));

        return ans;
    }
}
/**
 * Test case 1:
 *
 * input: "0100110"
 *
 * output: 5
 *
 * indices(1,2,3,6,7) -> "01010"
 *
 * indices(1,2,3,5,7) -> "01010"
 *
 * indices(1,2,4,6,7) -> "01010"
 *
 * indices(1,2,4,5,7) -> "01010"
 *
 * indices(1,2,5,6,7) -> "01110"
 *
 * 5 mod(10^9 +7) = 5
 * Test case 2:
 *
 * input: "010110"
 *
 * output: 3
 *
 * indices(1,2,3,4,6) -> "01010"
 *
 * indices(1,2,3,5,6) -> "01010"
 *
 * indices(1,2,4,5,7) -> "01110"
 *
 * 3 mod(10^9 +7) = 3
 * Test case 3
 *
 * input: "01111"
 *
 * output: 0
 *
 * There is no palindromic subsequence of length 5
 * */