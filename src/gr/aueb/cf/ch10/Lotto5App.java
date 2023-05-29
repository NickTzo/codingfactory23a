package gr.aueb.cf.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto5App {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(new File("C:\\Users\\Nikos\\OneDrive\\Υπολογιστής\\Notes\\Java\\Exersice in lesson\\lottoin.txt"));
            PrintStream ps = new PrintStream("C:\\Users\\Nikos\\OneDrive\\Υπολογιστής\\Notes\\Java\\Exersice in lesson\\lottoout.txt" , StandardCharsets.UTF_8)){

            final int LOTTO_SIZE = 5;
            int[] inputNumbers = new int[49];
            int pivot = 0;
            int[] result = new int[5];
            int num;
            int window;

            while ((num = in.nextInt()) != -1 && pivot <= 48){
                inputNumbers[pivot] = num;
                pivot++;
            }
                int[] numbers = Arrays.copyOfRange(inputNumbers , 0 , pivot); //ο copyOfRange αντιγραφει απο 0 εως lenght-1 για αυτο βαζουμε Pivot
                Arrays.sort(numbers);

                window = pivot - LOTTO_SIZE;
                for(int i = 0; i <= window; i++){
                    for(int j = i; j <= window + 1; j++){
                        for(int k = j; k <= window + 2; k++){
                            for(int l = j; l <= window + 3; l++){
                                for(int m = j; m <= window + 4; m++){
                                    result[0] = numbers[i];
                                    result[1] = numbers[j];
                                    result[2] = numbers[k];
                                    result[3] = numbers[l];
                                    result[4] = numbers[m];


                                    if(!isEvenGE(result, 3) && !isOddGE(result, 3)) {
                                        ps.printf("%d %d %d %d %d\n", result[0], result[1], result[2], result[3], result[4]);
                                    }
                                }
                            }
                        }
                    }
                }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Returns true if the number of evens is greater or equal to a threshold limit
     * @param arr
     * the inout array
     * @param threshold
     * the upper limit of the constraint
     * @return
     * true if the numbre of evens is greater tha the equal
     */

    public static boolean isEvenGE(int[] arr, int threshold){
        int even = 0;

        for (int num : arr){
            if (num % 2 == 0) even++;

        }   return even > threshold;
    }

    public static boolean isOddGE(int[] arr, int threshold){
        int odd = 0;

        for (int num : arr){
            if (num % 2 != 0) odd++;

        }   return odd > threshold;
    }

}
