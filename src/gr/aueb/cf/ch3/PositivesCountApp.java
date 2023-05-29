package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * ΜΕΤΡΑΕΙ ΤΟ ΠΛΗΘΟΣ ΤΩΝ ΘΕΤΙΚΩΝ ΑΡΙΘΜΩΝ
 * ΠΟΥ ΔΙΝΕΙ Ο ΧΡΗΣΤΗΣ
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0 ;
        System.out.println("Please insert a number");
        num = scanner.nextInt();;
         while (num >=0){
             positiveCount++;
             System.out.println("Please give another number to continue");
             num = scanner.nextInt();
         }
        System.out.println("The total is:"+positiveCount);
    }
}

