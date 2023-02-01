package company.a_08_MorganStanley;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class asset {
    public static void main(String[] args) {
        Integer integer=10;
        integer++;
        assert integer==null && integer>=0;
        System.out.println(integer);
        asset asset1 = new asset();
        asset1.t();
        Innner innner = asset1.new Innner();
    }
    private class Innner {

    }
    public void t(){
        Map<color, String> map = new HashMap<>();
        map.put(new color("Blue"), "Blue");
        System.out.println(map.get(new color("Blue")));
    }
    class   color{
        private String name;
        public color(String name){
            this.name=name;
        }
    }
}
