package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογιζει το a^n ανδρομικα
 */
public class PowerRecursiveApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        float n;
        System.out.println("Please insert two float numbers");
        a = scanner.nextFloat();
        n = scanner.nextFloat();
        System.out.println(power(a,n));
    }

    /**
     * Recursive a^n
     * @param a the base
     * @param n the power
     * @return   the power of a
     */
    public static float power (float a, float n) {
        if(n>0){
            return a * power(a,n-1);
        }
        if(n<0){
            return  1 / power(a,-n);
        }
            return  1;
    }
}
