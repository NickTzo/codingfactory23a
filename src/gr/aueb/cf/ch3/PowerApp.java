package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * ΥΠΟΛΟΓΙΖΕΙ Α^Β
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;
        System.out.println("Please insert a,b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        while (i <= b) {
            result = result * a;
            i++;
        }
        System.out.printf("%d^%d= %d",a,b,result);
    }
}
