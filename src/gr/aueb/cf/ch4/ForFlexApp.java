package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Να διαβαζουμε απο το standard input το
 * start-value , end-value ,step και εκτυπωνει
 * το πληθος των επαναληψεων
 */
public class ForFlexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int interations = 0;

        System.out.println("Provide star , end , step values");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for(int i = startValue; i <= endValue; i = i + step ) {
            interations++;
            System.out.println(1 + "");
        }
        System.out.println("Interations:"+interations);
    }
}
