package company.a_08_MorganStanley;

class Animal{}
class Dog extends Animal{}
class Lab extends Dog{}
public class MainClass {
    static void printVal(Animal a){
        System.out.println(1);
    }
    static void printVal(Dog a){
        System.out.println(2);
    }
    static void printVal(Object a){
        System.out.println(3);
    }

    public static void main(String[] args) {
        Lab a = new Lab();
        printVal(a);
    }
}
