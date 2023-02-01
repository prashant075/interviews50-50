package company.a_08_MorganStanley;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class color{
    private String name;
    public color(String name){
        this.name = name;
    }
}
class MyClass{
        int ival = 85;
        MyClass(){
            ival = 41;
        }
        {
            ival = 27;
        }
        enum Animals{
            LION, DOG, COW;
        }

        public static void main(String[] args) {
            MyClass myClass = new MyClass();
            System.out.println(myClass.ival);
            Integer n=10;
            n++;
            assert  n==null && n>=0;
            System.out.println(n);
            Animals[] animals =Animals.values();
            System.out.println(animals[1]);
            Map<color, String> map = new HashMap<>();
            map.put(new color("Blue"), "Blue");
            System.out.println(map.get(new color("Blue")));
            System.out.println(Arrays.stream(new int[]{1,2,3,4,5}).filter(i->i%2==0).map(i->i*2).sum());

        }
    }

