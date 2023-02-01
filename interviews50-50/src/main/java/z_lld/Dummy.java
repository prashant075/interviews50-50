package z_lld;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dummy {
//    public static void main(String[] args) {
//        String str ="XYZ is employee of ABC company, XYZ is from bangalore, XYZ is ex-employee of AAA XYZ.";
//        String [] input = str.split(" ");
//        Map<String,Integer> map = new HashMap<>();
//        int maxFreq=0;
//        for(String each: input){
//            map.put(each, map.getOrDefault(each,0)+1);
//            maxFreq= Math.max(maxFreq, map.get(each));
//        }
//        System.out.println(map);
//        System.out.println(maxFreq);
//        for(Map.Entry<String,Integer> entry:map.entrySet()){
//            if(entry.getValue()==maxFreq){
//                System.out.println(entry.getKey());
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String str ="XYZ is employee of ABC company, XYZ is from bangalore, XYZ is ex-employee of AAA XYZ.";
//        String [] input = str.split(" ");
//        Map<String,Integer> map = new HashMap<>();
//        int maxFreq=0;
//        String output="";
//        for(String each: input){
//            String processed= str.replaceAll(each,"");
//            System.out.println(processed);
//            int val = str.length()-processed.length();
//            if(maxFreq<val){
//                maxFreq=val;
//                output=each;
//            }
//        }
//        System.out.println(output);
////        System.out.println(map);
////        System.out.println(maxFreq);
////        for(Map.Entry<String,Integer> entry:map.entrySet()){
////            if(entry.getValue()==maxFreq){
////                System.out.println(entry.getKey());
////            }
////        }
//    }
//
//}

    /*
     *  Computer Class /PC, Laptop
     *
     * Pulbic class ComputerFactory{
     *
     *   Public Computer  getComputerType(ComputerType type){
     *       switch(type){
     *           case:PC new PCComputer(type, )
     *       }
     * }
     * }
     * PCComputer extends Computer{
     *
     * }
     * Laptop extends Computer{
     *
     * }
     * ComputerType {
     *  PC,
     * LAPTOP
     * }
     *
     *
     * */

    /* public volatile int val =1;
     * int  count =50;
     * void  printMethod(int iterations){
     *   (Syncorinzed){
     *        if(iterations%count==0){
     *           notifyAll();
     *   }
     *  System.out.println(val):
     *   val++;
     *
     * }
     * }
     *
     *  Class Thread implement Runnable{
     *   public void run(){
     *   printMethod(itertion);
     *   }
     *   }
     *
     *
     * class Main {
     *   List<Thread> threads = new ArrayList<>();
     *   for(int i=0;i<5;i++){
     *       threads.add(new Thread() );
     *   }
     *
     *
     * }
     * */

    // highest frequently occurring words in the statement
// "XYZ is employee of ABC company, XYZ is from bangalore, XYZ is ex-employee of AAA company."
    public static void main(String[] args) {
        String s = "A$B$C";
        List<String> list =  Arrays.stream(s.split("\\$")).toList();
        System.out.println(list);
    }
}