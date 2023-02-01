package z_lld;

import company.a_31_ezetap.A;

import java.util.*;

public class Net {
    public static void main(String[] args) {
       // int[][] op = new int[][]{,{11,15}{15,18}};
        int[][] op = new int[][]{{8,11},{8,10}};
//        List<int[]> op = new ArrayList<>();
//        op.add(new int[]{1,3});
//        op.add(new int[]{2,6});
//        op.add(new int[]{8,10});
//        op.add(new int[]{15,18});
        //{{2,6},{1,3},{8,10},{15,18}};
        //{1,4},{4,5}

        merge(op);

    }
    public static List<int[]> merge(int[][] input){
        List<int[]> res = new ArrayList<>();
        res.add(input[0]);
        for(int i=1;i<input.length;i++){
            if(input[i-1][1]>=input[i][0]){
               res.get(res.size()-1)[1]= Math.max(input[i][1],res.get(res.size()-1)[1]);
            }else{
               res.add(input[i]);
            }
        }
        for(int[] each:res){
            System.out.println(each[0]+" "+each[1]);
        }
        return res;
    }
}
