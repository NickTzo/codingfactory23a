package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        try {
            System.out.println("Please insert two ints for division");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            result = numerator / denominator;

            System.out.printf("%d / %d = %d", numerator, denominator, result);
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Λαθος παρανομαστης");
        }
    }
}
