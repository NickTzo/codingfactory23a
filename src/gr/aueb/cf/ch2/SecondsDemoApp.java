package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * ΜΕΤΑΤΡΕΠΕΙ ΔΕΥΤΕΡΟΛΕΠΤΑ ΣΕ ΜΕΡΕΣ, ΩΡΕΣ, ΛΕΠΤΑ
 */
public class SecondsDemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSec = 0;
        int days = 0;
        int hours = 0;
        int min = 0;
        int sec = 0;
        int remainSec = 0;
        final int DAYS_SEC = 24*3600;
        final int HOUR_SEC = 3600;
        final int MIN_SEC = 60;

        System.out.println("Please insert seconds");
         inputSec = scanner.nextInt();
         remainSec = inputSec;
         days = remainSec / DAYS_SEC;
         remainSec = remainSec % DAYS_SEC;
         hours = remainSec / HOUR_SEC;
         remainSec = remainSec % HOUR_SEC;
         min = remainSec / MIN_SEC;
         remainSec =  remainSec % MIN_SEC;

        System.out.printf("%,d INPUT SECONDS %d DAYS %d HOURS %d MINUTES %d SECONDS", inputSec ,days , hours , min , remainSec);

    }
}
