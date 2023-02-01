package z_lld;

import java.util.*;

public class Gartner {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] myArray = {1,2,3,4,5,10};
        List<Object> values = Arrays.asList("aaa", "a", "aa", "", "aaaa", "aaaa", 1, 2L);

//        Collections.sort(values, new Comparator<Object>() {
//
//            public int compare(Object o1, Object o2) {
//                String val1 =null;
//                String val2 =null;
//                if(o1 instanceof String){
//                    val1=o1.toString();
//                }
//                if(o2 instanceof  String){
//                    val2 = o2.toString();
//                }
////                if(String.valueOf(val1).compareTo(String.valueOf(val2)))){
////                    return -1;
////                }
//               return 1;
//            }
//
//        });

        System.out.println(Arrays.stream(myArray).sum());
        System.out.println(values);

                // Sort the list based on size of element in desc order
                // Expected output = aaaa,aaaa,aaa,aa,a,1,2
        //
    }
}
/*
* List<Object> values = Arrays.asList("aaa", "a", "aa", "", "aaaa", "aaaa”, 1, 2L);
        // Sort the list based on size of element in desc order
       // Expected output = aaaa,aaaa,aaa,aa,a,1,2
* */
