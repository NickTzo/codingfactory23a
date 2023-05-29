package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογιζει το a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 1;


        System.out.println("Please insert base , power");
        a = scanner.nextInt();
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            result *= a;
        }

        System.out.printf("Result: %,d",result);
    }
}
