package gr.aueb.cf.ch6;

/**
 * Αναζητα το ελαχιστο  στοιχειο ενος πινακα
 */
public class ArrayMinMaxApp {
    public static void main(String[] args) {

        int[] arr = {30,12,87,7,15};
        int minPosition = 0;
        int minValue = arr[minPosition];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] <  minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d, MinPosition: %d", minValue,  minPosition + 1);
    }
}
