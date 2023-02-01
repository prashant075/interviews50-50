package company.a_08_MorganStanley;

import z_lld.logger.LogSubject;

import java.util.List;

public class shippingTime {
    private static long maxValue= Long.MIN_VALUE;
    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize){
        long capt=0;
        int size = boxes.size();
        int j;
        long endingmaxvalue=0;
        for(j=0;j<size;j++){
            capt+=boxes.get(j);
            if(capt<=truckSize){
                endingmaxvalue = boxes.get(j)*unitsPerBox.get(j);
                if(maxValue<endingmaxvalue){
                    maxValue = endingmaxvalue;
                }
            }
        }
        return maxValue;
    }
}
