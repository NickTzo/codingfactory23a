package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υλοποιει εναν απλο calculator που παρεχει
 * τις υπηρεσιες add,sub,mul,div,mod.
 * ενφανιζει ενα μενου προς τον χρηστη με
 * επιλογες λαμβανει την τιμη της επιλογης
 * και στη συνεχεια δυο αμομα τιμες των Num1 num2
 * και τελικα εμφανιζει το αποτελεσμα
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        int result;
        do{
            //printMenu + choice + getNextInt()
            printMenu();
            choice = getNextInt("Please insert your choice");
            //validate   if choice is invalid(choice)(continue)
            if(isChoiceInvalid(choice)){
                System.out.println("Choice is invalid");
                continue;
            }
            //if its choice is quit(choice) {break}
            if(isChoiceQuit(choice)){
                break;
            }
            //result + onChoicegetresult(choice)
            result = onChoiceGetResult(choice);
            System.out.println("Result:"+result);

            //sout(result)
        }while(true);
        exit();
    }
    public static void printMenu(){
        System.out.println("1.Προσθεση");
        System.out.println("2.Αφαιρεση");
        System.out.println("3.Πολλαπλασιαμος");
        System.out.println("4.Διαιρεση");
        System.out.println("5.Υπολοιπο");
        System.out.println("6.Εξοδος");
    }
    public static int getNextInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static boolean isChoiceInvalid(int choice){
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice){
        return choice == 6;
    }
    public static int add(int num1,int num2){
        return num1 + num2;
    }
    public static int sub(int num1,int num2){
        return num1 - num2;
    }
    public static int mul(int num1,int num2){
        return num1 * num2;
    }
    public static int div(int num1,int num2){                    // 1ος τροπος
        int value;
        if(num2 == 0){
            value = Integer.MAX_VALUE;
        }else {
            value = num1 / num2;
        }
        return value;
    }

    /* Δυο τροποι ο πανω και ο κατω προτειμαμε τον 1ο τροπο */

    public static int mod(int num1,int num2){                  // 2ος τροπος
        if(num2 == 0){
            return Integer.MAX_VALUE;
        }//else δεν χρεαιζεται λογο του return
        return num1 % num2;
    }
    public static void exit(){
        System.out.println("Επιλεξατε Εξοδος");
    }

    public static int onChoiceGetResult(int choice){
        int num1 = getNextInt("Please insert the first number(int)");
        int num2 = getNextInt("Please insert the second number(int)");
        int result = 0;

        switch (choice){
            case 1 :
                result = add(num1,num2);
                break;
            case 2 :
                result = sub(num1,num2);
                break;
            case 3 :
                result = mul(num1,num2);
                break;
            case 4 :
                result = div(num1,num2);
                break;
            case 5 :
                result = mod(num1,num2);
                break;
            case 6 :
            default:
                break;
        }
        return result;
    }
}
