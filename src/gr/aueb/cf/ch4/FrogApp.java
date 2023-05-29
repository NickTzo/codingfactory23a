package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ενας μικρος βατραχος θελει να περασει ενα ποταμι
 * ο frog εστω βρισκεται στην θεση X και θελει να φτασει
 * στην θεση Y η θεση μεγαλυτερη (η σε θεση >= Y)
 * ο Frog jumps a fixed distance d.
 * το προγραμμα αυτο βρισκει τον ελαχιστο αριθμο jumps
 * που ο Frog πρεπει να κανει ωστενα φτασει στον στοχο του.
 * πχ αν εχουμε Χ=10 Υ=85 και d=30 τοτε ο Frog θα χρεαστει 3 jumps
 * γιατι θα ξεκινησει απο το stars at 10 και μετα το πρωτο Jump παει στην θεση 10+30=40
 * στο δευτερο jump παει 30+40=70 και στο τριτο jump παει
 * 70+30=100>85
 */
public class FrogApp {
    public static void main(String[] args) {
        int start;
        int end;
        int step;
        int totalSteps = 0;
        int totalJumps = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give the start,end and the step");
        start = scanner.nextInt();
        end = scanner.nextInt();
        step = scanner.nextInt();

        totalJumps = (int)Math.ceil((end-start)/(double)step);
        System.out.println("Total jumps:"+totalJumps);


        for(int i = start; i < end; i=i+step){
            totalSteps ++;
        }
        System.out.println("Total steps:"+totalSteps);
    }
}
