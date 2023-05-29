package gr.aueb.cf.ch3;
import java.util.Scanner;
public class LinearBingoApp {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        final int SECRET_KEY = 17;
        //bingo = false
        while (true){
            System.out.println("Please provide a secret num");
            num = scanner.nextInt();

            if (num != SECRET_KEY){
                System.out.println("Please try again!!");
                continue;
            }
            System.out.println("Bingo!!");
            break;
        }
        /** Δευτερη επιλογη
         *
         * do {
         System.out.println("Provide a secret num");
         num = scanner.nextInt();
         } while (num != SECRET_KEY); {
         System.out.println("Bingo");
         }
         */

        /** Τριτη επιλογη
         *
         * do{
         * System.out.println("Please provide a secret num");
         *             num = scanner.nextInt();
         *
         *             if (num != SECRET_KEY){
         *                 System.out.println("Please try again!!");
         *                 continue;
         *             }
         *             System.out.println("Bingo!!");
         *             bingo = true
         * }
         * while{!bingo};
         */
    }
}
