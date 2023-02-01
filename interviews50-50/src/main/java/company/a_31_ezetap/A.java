package company.a_31_ezetap;

import java.math.BigInteger;

public class A {
    public static final int END = Integer.MAX_VALUE;
    public static final int START= END-100;
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("5000");
        BigInteger bigInteger1 = new BigInteger("50000");
        BigInteger bigInteger3 = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total.add(bigInteger);
        total.add(bigInteger1);
        total.add(bigInteger3);
        System.out.println(total);
        final String pig = "ken";
        final String dog = "len"+pig.length();
        System.out.println("A "+ pig==dog);
        int count=0;
        for(int i=START;i<=END;i++)
            count++;
        System.out.println(count);
    }

}
