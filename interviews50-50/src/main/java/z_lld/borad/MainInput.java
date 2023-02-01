package z_lld.borad;

import java.util.Scanner;

public class MainInput {
    Scanner scanner;
    MainInput(){
        scanner = new Scanner(System.in);
    }
    public  void mainIn() {
        while(true){
          int val =  getNextInt();
          System.out.println(val);
        }
    }
    private  int getNextInt() {
        int x = scanner.nextInt();
        return x;
    }
}
