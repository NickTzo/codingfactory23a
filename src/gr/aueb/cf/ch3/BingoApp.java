package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * Κανει Bingo οταν ο χρηστης μαντεψει σωστα ενα secret key
 */
public class BingoApp {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 11;
         while (true){
             System.out.println("Please proveide a secret num");
             num = scanner.nextInt();

             if(num == SECRET){
                 System.out.println("BINGO!!");
                 break;
             }else {
                 System.out.println("Try again!");
             }
         }

    }
}
