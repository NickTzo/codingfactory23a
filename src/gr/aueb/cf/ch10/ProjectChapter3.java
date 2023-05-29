package gr.aueb.cf.ch10;

import java.util.IllformedLocaleException;
import java.util.Scanner;

/**
 * ΕΝΦΑΝΙΖΕΙ ΕΝΑ MENU ΠΟΥ ΕΧΕΙ ΚΑΠΟΙΕΣ ΕΠΙΛΟΓΕΣ
 * Ο ΧΡΗΣΤΗΣ ΕΠΙΛΕΓΗ ΚΑΙ ΤΟΥ ΕΡΧΕΤΑΙ ΤΟ ΑΠΟΤΕΛΕΣΜΑ
 * Q/q -> QUIT
 */
public class ProjectChapter3 {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IllegalArgumentException{
        boolean quit = false;
        String response;
        do{
            printMenu();
            response = getChoice();

            try {
                if (response.matches("[Qq]")) {
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            }catch (IllegalArgumentException e){
                System.out.println("Invalid Choice");
            }


        }while (!quit);
        System.out.println("BYE");
    }




    public static void printMenu(){
        System.out.println("Please select one of the following: ");
        System.out.println("1.Insert");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Select");
        System.out.println("Q/q to exit");
    }



    public static String getChoice(){
        return scanner.nextLine().trim();
    }




    public static void printOnChoice(String s) throws IllegalArgumentException{
        int choice = -1;

        try{
            if (s == null) throw new IllegalArgumentException();

            choice = Integer.parseInt(s);

                switch (choice){
                    case 1:
                        System.out.println("Inserted");
                        break;
                    case 2:
                        System.out.println("Updated");
                        break;
                    case 3:
                        System.out.println("Deleted");
                        break;
                    case 4:
                        System.out.println("Selected");
                        break;
                    default:
                        throw new IllegalArgumentException();
                }


        }catch (IllegalArgumentException e){
//            e.printStackTrace();
            throw e;
        }
    }
}
