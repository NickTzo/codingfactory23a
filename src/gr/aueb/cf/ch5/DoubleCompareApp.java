package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελεγχει ισοτητα/ανισοτητα στους
 * floating points
 */

public class DoubleCompareApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d1;
        double d2;
        final double EPSILON =0.000005;

        System.out.println("Please insert two doubles");
        d1 = scanner.nextInt();
        d2 = scanner.nextInt();

        if(Math.abs(d2-d1)<= EPSILON){
            System.out.println("EQUAL");
        }else{
            System.out.println("NOT EQUAL");
        }
    }
}
