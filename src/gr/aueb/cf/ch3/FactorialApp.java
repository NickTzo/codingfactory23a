package gr.aueb.cf.ch3;
import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int i = 1;
        long facto = 1L;
        System.out.println("Please insert a number");
        n = scanner.nextInt();
        while (i <= n) {
            facto *=i;
            i++;
        }
        System.out.println("The result is:"+facto);
    }
}
