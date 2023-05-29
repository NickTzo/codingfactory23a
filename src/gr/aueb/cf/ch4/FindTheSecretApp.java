package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρηστης εχει 10 ευκαιριες για να βρει
 * ενα μυστικο κλειδι(int). Αν το βρει νωριτερα απο την 10η φορα,
 * η for θα πρεπει να σταματησει (break)
 */
public class FindTheSecretApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for(int i = 1;  i <= 10; i++){
            System.out.println("Please make a guess");
            num = scanner.nextInt();

            if(num == SECRET_KEY){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No worries, play again");
            System.exit(1);
        }
        System.out.println("Success!!! Play again!");
    }
}
