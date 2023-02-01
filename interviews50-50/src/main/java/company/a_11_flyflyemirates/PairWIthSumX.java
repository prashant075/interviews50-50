package company.a_11_flyflyemirates;

import java.util.ArrayList;
import java.util.List;

public class PairWIthSumX {
    public static void main(String[] args) {
        int [] input = {1,2,2,3,4,4,5,5,6,6,7,7};
        System.out.println(getPairs(input,8));
    }
    public static List<List<Integer>> getPairs(int [] nums , int x){
        List<List<Integer>> res = new ArrayList<>();
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            if(nums[low]+nums[high]==x){
                List<Integer> sub = new ArrayList<>();
                sub.add(nums[low]);
                sub.add(nums[high]);
                res.add(sub);
                while(low<high && nums[low]==nums[low+1]) low++;
                while(low<high && nums[high]==nums[high-1]) high--;
                low++;
                high--;
            }else if(nums[low]+nums[high] <x){
                low++;
            }else{
                high--;
            }
        }
        return res;
    }
}
