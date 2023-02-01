import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FIZZBUZZ {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=15;i++){
            list.add(i);
        }
////        list.stream().filter(i->i%3==0).map(i->"Fizz").forEach(System.out::println);
////        list.stream().filter(i->i%5==0).map(i->"BUZZ").forEach(System.out::println);
////        list.stream().filter(i->i%5==0).filter(i->i%3==0).map(i->"FIZZBUZZ").forEach(System.out::println);
//       List<String> result=  list.stream().filter(i->i%3==0).map(i->"Fizz").collect(Collectors.toList());
//       result.addAll(list.stream().filter(i->i%5==0).map(i->"BUZZ").collect(Collectors.toList()));
//       result.addAll(list.stream().filter(i->i%5==0).filter(i->i%3==0).map(i->"FIZZBUZZ").toList());
//        System.out.println(result);
        for(int i=1;i<=15;i++){
           if(i%3==0 && i%5==0) System.out.println("FIZZBUZZ");
           else if(i%3==0) System.out.println("FIZZ");
           else if(i%5==0 ) System.out.println("BUZZ");
           else System.out.println(i);
        }



    }
    public void test(){
        return;
    }

}

//                    collection Interface                                                                 Map<>Key,Value
//             List  Interface         Set Interface           Queue                                          HashMap
//                                                                Dequeue
//                                                              PrioirityQueue
//                                        HashSet
//                                        LinkedHashSet
//                                        TreeSet
//            ArrayList
//            LinkedList
//
//Legcay Vector

//                Throwable
//Error                  Exception
//ClassDefError                  Checked Expecetion
//                                FileNotFound
//
//
//                                                 UnCheckedException
//                                                    RunTime
//                                                    ArthemticalExpcetion 1/0
//                                                    Class


