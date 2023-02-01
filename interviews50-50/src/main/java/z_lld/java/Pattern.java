package z_lld.java;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            int temp =n;
            for(int j=1;j<=n;j++){
                if(i>=j){
                    System.out.print(temp--+" ");
                }else {
                    System.out.print(n-i+1+" ");
                }
            }
            System.out.println();
        }
    }
}
/*
4444
4333
4322
4321
* */
