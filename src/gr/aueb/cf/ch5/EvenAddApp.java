package gr.aueb.cf.ch5;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * αποφασιζει αν ενας int ειναι
 * αρτιος η περιττος
 */
public class EvenAddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isEven;
        System.out.println("Please insert a number(int)");
        num = scanner.nextInt();
        isEven = isEven(num);
        System.out.println("Num " + num + " isEven: " + isEven);
        System.out.println();
        System.out.printf("%d number is Even: %b",num,isEven(num));
    }

    /**
     * Evaluates an int if its even or not
     * @param n the number (int) to  evaluate
     * @return true if its even otherwise false if its odd
     */
    public static boolean isEven(int n){
//        if(n % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }
        /**
         * Πιο συντομα γινεται με το απο κατω και προτιματε
         */
        return n % 2 == 0;
    }
}
