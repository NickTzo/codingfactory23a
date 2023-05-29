package gr.aueb.cf.ch8;

import java.util.Scanner;

public class InputMismatchExcept2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;
        while (true){
                System.out.println("Please insert a num");
                     if(scanner.hasNextInt()) {
                    inputNum = scanner.nextInt();
                     }else {
                    scanner.nextLine();
                    System.out.println("Error please insert a num");
                    continue;
                    }
                    if(inputNum == MAGIC_NUM){
                    System.out.println("Great");
                    break;
                    }

        }
        System.out.println("Thanks for using the Magic App");
    }
}
