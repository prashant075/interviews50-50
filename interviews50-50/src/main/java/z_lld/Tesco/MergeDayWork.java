package z_lld.Tesco;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*


Tesco has around 3200 stores and more than 10% of the stores have around 800 colleagues each.

In a store, a colleague can work for multiple departments. Here are shifts of a colleague in various departments:

In Bakery department: From 8 to 10

In Checkout department: From 10 to 12

In Diary department: From 14 to 19

Given the above split of shifts, provide an API/method to return the different shifts of a colleague for the day after merging contiguous shifts. This will be exposed to the colleague in different UI and help them plan their day accordingly.

His shift timings in this case are 8 to 12 and 14 to 19.
[[8,10],[14,19] [10,12]] -> 8,12 14,19
 8,10 14,19 10,12
 8,10 10,12  14,19

 495 750   -> 8:15, 12:30
840 1140 ->
 * */

public class MergeDayWork {
    public static void main(String[] args) {
        String[][] input1 = {{"8:15", "10:30"},{"10:30", "12:30"},{"14:00","19:00"}};
        int[][] convertedTime=getASMinofDay(input1);
        List<int[]> shiftTime = getShiftForDay(convertedTime);
        for (int[] eachShift : shiftTime) {
            System.out.print(eachShift[0] + " " + eachShift[1]);
            System.out.println();
        }
    }

    private static int[][] getASMinofDay(String[][] input) {
        int[][] res = new int[input.length][2];
        int i=0;
        for(String[] each:input){
            String[] startTime = each[0].split(":");
            String[] endTime = each[1].split(":");
            res[i][0]= convertMinVal(startTime[0],startTime[1]);
            res[i][1]= convertMinVal(endTime[0],endTime[1]);
            i++;
        }
        return res;
    }
    public static int convertMinVal(String hour, String min){
        int h = Integer.parseInt(hour)*60;
        int m = Integer.parseInt(min);
        return h+m;
    }

    public static List<int[]> getShiftForDay(int[][] input) {
        LinkedList<int[]> resultShift = new LinkedList<>();
        Arrays.sort(input, (a, b) -> Integer.compare(a[0], b[0])); //n(log(n))
        for (int[] each : input) { //o(n)
            if (resultShift.isEmpty() || resultShift.getLast()[1] < each[0]) {
                resultShift.add(each);
            } else {
                resultShift.getLast()[1] = Math.max(resultShift.getLast()[1], each[1]);
            }
        }
        return resultShift;

    }
}



