package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογιζει το a^n με BigInteger.
 */
public class BigIntPowerApp {
    public static void main(String[] args) {
        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert two ints , base and power");
        a = BigInteger.valueOf(scanner.nextInt());
        n = BigInteger.valueOf(scanner.nextInt());

        for(int i = 1; i <= n.intValue(); i++){
            result = result.multiply(a);
        }
        System.out.printf("%d^%d = %,d",a,n,result);
    }
}
