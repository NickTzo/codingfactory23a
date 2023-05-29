package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * Ο ΧΡΗΣΤΗΣ ΔΙΝΕΙ 2 ΑΚΕΡΑΙΟΥΣ ΚΑΙ
 * ΥΠΟΛΟΓΙΖΕΙ + - * / %
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please insert two numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Sum" + (num1 + num2));
        System.out.println("Sub" + (num1 - num2));
        System.out.println("Mul" + (num1 * num2));
        System.out.println("Div" + (num1 / num2));
        System.out.println("Mod"+ (num1 % num2));

    }
}
