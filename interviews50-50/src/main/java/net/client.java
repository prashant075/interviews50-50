package net;

public class client {
    public static void main(String[] args) throws KeyNotFoundException {
        /*
        *
        * step1 create Inatce;
        * Step2 Put
        * step3 */
        //step1;
        MyMap map = new MyHashMap();
        map.put("A","xyz");
        System.out.println(map.listKeys());
        //"A"
        try {
            map.delete("B");
        } catch (KeyNotFoundException e) {
            System.out.println(e.getMessage());
        }
        map.delete("A");
        //KEY NOT FOUND
        // DELETE A
        System.out.println(map.listKeys());
        // EMPTY LIST
        map.put("B","pqr");
        map.put("C","zxy");
        System.out.println(map.get("B"));
        //pqr
        System.out.println(map.listKeys());
        //B,C
    }
}
/*
* [A]
Key Not Found
[A]
pqr
[A, B, C]
* */
