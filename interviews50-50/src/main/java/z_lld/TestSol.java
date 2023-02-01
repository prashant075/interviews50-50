package z_lld;

import java.util.*;

public class TestSol {
    class cordinate{
        int x;
        int y;

        public cordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    /*
    *  List of Geo Cordinate
    *  {1,2},{2,1},{1,-2}, {2,-2}
    *
    *  */
    public static void main(String[] args) {
        TestSol obj = new TestSol();
        List<cordinate> objCordinates = obj.createCordinates();

//        List<List<Integer>> cordinates = new ArrayList<>();
//        cordinates.add(new ArrayList<>(Arrays.asList(1,2)));
//        cordinates.add(new ArrayList<>(Arrays.asList(29,1)));
//        cordinates.add(new ArrayList<>(Arrays.asList(1,72)));
//        cordinates.add(new ArrayList<>(Arrays.asList(23,-2)));
//        cordinates.add(new ArrayList<>(Arrays.asList(16,1)));
        try {
            getTopOneClosest(objCordinates);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public List<cordinate> createCordinates(){
        List<cordinate> cordinates = new ArrayList<>();
        cordinate cordinate1 = new cordinate(1,2);
        cordinate cordinate2 = new cordinate(4,5);
        cordinate cordinate3 = new cordinate(6,7);
        cordinates.add(cordinate1);
        cordinates.add(cordinate2);
        cordinates.add(cordinate3);
        return cordinates;
    }

    private static void getTopOneClosest(List<cordinate> cordinates) throws Exception {
        if(cordinates.isEmpty()){
            throw  new Exception("Not Element Present for Calculation");
        }
        PriorityQueue<cordinate> queue = new PriorityQueue<>(new Comparator<cordinate>() {
            @Override
            public int compare(cordinate o1, cordinate o2) {
                return getDistance(o1)-getDistance(o2);
            }
        });
        for(cordinate cordinate: cordinates){
            queue.add(cordinate);
        }
        Optional<cordinate> result = Optional.ofNullable(queue.poll());
        if(result.isPresent()){
            System.out.println("Clostest Point "+ result.get().x +" "+result.get().y);
        }

    }

    private static int getDistance(cordinate o) {
        return (int) (Math.pow(o.x, 2)+ Math.pow(o.y, 2));
    }
//    private static void getTopOneClosest(List<List<Integer>> cordinates) {
//        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(TestSol::getDistance));
//        for(List<Integer> eachCor: cordinates){
//            queue.add(eachCor);
//        }
//        List<Integer> res = queue.poll();
//        System.out.println(res);
//    }

    private static int getDistance(List<Integer> o1) {
        return (int) (Math.pow(o1.get(0),2)+ Math.pow(o1.get(1),2));
    }

    //post end point{

    // List of cordinate to
    // }
}
