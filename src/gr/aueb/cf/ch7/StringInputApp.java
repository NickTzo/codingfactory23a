package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;

        System.out.println("Please provide string");
        //s = scanner.next(); // ends with whitespace ( space,tab \t,newline \n)
        s = scanner.nextLine();

        System.out.println(s);
    }
}
