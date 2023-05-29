package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογιζει το πραγοντικο του n (n!) με
 * την μεθοδο facto()
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int result;
        System.out.println("Please insert n(int)");
        n = scanner.nextInt();

        result = facto(n);
        System.out.printf("%d! = %d",n,result);
    }

    /**
     * Returns n!
     *
     * @param n       the number (n) of n!
     * @return        1*2*3*4*..*n
     */
    public static int facto(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
