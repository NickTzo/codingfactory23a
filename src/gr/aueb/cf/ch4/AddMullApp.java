package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ΠΡΟΣΘΕΤΕΙ ΚΑΙ ΠΟΛΛΑΠΑΛΑΣΙΑΖΕΙ
 * n ΠΡΩΤΟΥΣ ΑΚΕΡΑΙΟΥΣ. ΤΟ n ΤΟ ΔΙΝΕΙ Ο ΧΡΗΣΤΗΣ
 */
public class AddMullApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a num (int)");
        n = scanner.nextInt();


        for(int i = 1; i <= n; i++){
            sum = sum + i;
            result = result * i;
        }
        System.out.println("Sum:" + sum);
        System.out.println("Mul:" + result);
        System.out.printf("Mul: %,d", result);
    }
}
