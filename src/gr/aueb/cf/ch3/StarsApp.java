package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * ΕΚΤΥΠΩΝΕΙ ΜΗ ΟΡΙΖΟΝΤΙΑ ΑΣΤΕΡΑΚΙΑ ΟΠΟΥ Ν ΕΝΑΣ
 * ΑΚΕΡΑΙΟΣ ΠΟΥ ΙΝΕΙ Ο ΧΡΗΣΤΗΣ
 */
public class StarsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;
        System.out.println("Please insert number of stars");
        numberOfStars = scanner.nextInt();
        while (i <= numberOfStars) {
            System.out.println("*");
            i++;
            }

        }


    }

