package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβαζει απο το standar input (απο το πληκτρολογιο του χρηστη) δυο ακεραιους και τους προσθετη
 */
public class ScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert two ints");

        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}
