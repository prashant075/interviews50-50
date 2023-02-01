package org.leetcodehard;

import java.util.ArrayList;
import java.util.List;

import static company.a_08_MorganStanley.Thead.obj;

class A{

}
class B extends  A{}

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.remove(list.indexOf(0)));

    }
}
