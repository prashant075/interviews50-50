package z_lld;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    /*3 => 1,5
2 => 5,3
4 => 3
5 => 1
    *
    * */
    public void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(3, Arrays.asList(new Integer[]{1,5}));
        map.put(2, Arrays.asList(new Integer[]{5,3}));
        map.put(4, Arrays.asList(new Integer[]{3}));
        map.put(5, Arrays.asList(new Integer[]{1}));

        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indgree = new int[6];
        for(Integer key:map.keySet()){
            for(Integer val:map.get(key)){
                ++indgree[key];
                if(!graph.containsKey(val)){
                    graph.put(val, new ArrayList<>());
                }
                graph.get(val).add(key);
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<6;i++){
            if(indgree[i]==0){
                System.out.println(i);
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            Integer parent = queue.poll();
            if(graph.containsKey(parent)) {
                for (int nbh : graph.get(parent)) {
                    if (--indgree[nbh] == 0) {
                        queue.add(nbh);
                        System.out.println(nbh);
                    }
                }
            }
        }
         List<User> users = Arrays.asList(
                new User("C", 30),
                new User("D", 40),
                new User("A", 10),
                new User("B", 20),
                new User("E", 50));
        List<User> sortedList = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
        //start encluxive and end excluxive
        System.out.println("caab".equalsIgnoreCase("Caa"));
    }
    class User{
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
