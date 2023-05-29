package gr.aueb.cf.ch8;

public class ArithmenticExceptApp {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        int result;
        try {
            result = num1 / num2;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        //System.out.print(result);
    }
}
