package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Στον 1ο τροπο  βαζουμε το scanner πανω στην try και γινεται μονο στην java 11 και με τα οχι στην jαva 8
 */

public class TryWithResourcesApp {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);){
            int num;
            num = scanner.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
//            e.printStackTrace();
            System.out.println("Error");
        }
    }

    /**
     * Στον 2ο τροπο  βαζουμε το scanner μεσα στην try και γινεται μονο στην java 11 και με τα οχι στην jαva 8
     * αυτο το κανουμε για readability αλλα εχει δυο σημαντικα μειωνεκτιματα
     * 1ον μεσα στην try δεν πρεπει να ξαναδωσουμε num = scanner.nextInt();
     * και επισης το num δεν μπορει να αλλαξει δηλαδη δεν μπορει να ξαναβρεθει στην αριστερη μερια του κωδικα
     */


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try(scanner){
//            int num;
//            num = scanner.nextInt();
//            System.out.println(num);
//        }catch (InputMismatchException e){
////            e.printStackTrace();
//            System.out.println("Error");
//        }
//    }
}
