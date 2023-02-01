package company.a_27_Fivetran;

import java.util.*;

/*
* vector<int> solve(int n, vector<int> A){ //C++
    vector<int> ans(n);
    int mx = 0, M = int(1e9) + 7, sum = 0, ssum = 0;
    for (int i = 0; i < n; ++i){
        sum += A[i];
        sum %= M;
        ssum += sum;
        ssum %= M;
        mx = max(mx, A[i]);
        ans[i] = ssum + 1LL * mx * (i + 1) % M;
        ans[i] %= M;
    }
    return ans;
}*/
public class PrefixScore {

    public static void main(String[] args) {
        int[] ar ={1343344444,2,3};
        Arrays.stream(solve(3,ar)).forEach(System.out::println);
    }
    public static int[] solve(int n , int[] array){
        int currMax =0, MOD=1000000007, sum=0, totalSum=0;
        int[] ans = new int[array.length];
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            sum%=MOD;
            totalSum+=sum;
            totalSum%=MOD;
            currMax = Math.max(currMax,array[i]);
            int temp = (int)(1L*currMax*(i+1))%MOD;
            ans[i]=totalSum + temp;
            ans[i]%=MOD;
        }
        return ans;
    }
    public static class Pair{
         int  worst;
         int expect;
        Pair(int worst, int expect){
            this.worst = worst;
            this.expect =expect;
        }
    }
    public static long planProduction(List<Integer> worstCase, List<Integer> expected) {
        List<Pair> pairs = new ArrayList<>();
        for(int i=0;i<worstCase.size();i++){
            Pair p = new Pair(worstCase.get(i), expected.get(i));
            pairs.add(p);
        }
        Collections.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.expect!=o2.expect){
                    return o2.worst-o1.worst;
                }
                return o1.expect-o2.expect;
            }
        });
        return 0;
    }
}
