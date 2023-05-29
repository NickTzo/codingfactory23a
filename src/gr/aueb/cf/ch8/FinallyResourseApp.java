package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        try{
            num = scanner.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            e.printStackTrace();
        }finally {
            try {
                if(scanner != null) scanner.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
