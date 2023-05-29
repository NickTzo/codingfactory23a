package gr.aueb.cf.ch6;

public class BinarySearchApp {
    public static void main(String[] args) {
        final int KEY = 7;
        int[] arr = {2,4,5,6,7,8,9};
        int low = 0;
        int high = arr.length - 1;
        int positiion = -1;

        positiion = binarySearch(arr,KEY,low,high);


        if(positiion == -1){
            System.out.println("Value was not found");
        }else{
            System.out.println("Value was found in position " + (positiion+1));
            System.out.printf("Position: %d, Value: %d", (positiion + 1 ), arr[positiion]);
        }
    }

    /**
     * Return the position of a certain value
     * with in array.
     * @param arr the array
     * @param value the value to find
     * @param low start index
     * @param high end index
     * @return the position of the value within the array
     * -1 otherwise
     */
    public static int binarySearch(int[] arr, int value, int low, int high){
        int median;

        if(arr==null) return -1;
        if((low < 0) || (high > arr.length - 1)) return -1;
        if(high < low) return -1;

        median = (low + high) / 2;

        if(value == arr[median]){
            return median;
        }

        if(value < arr[median]){
            return binarySearch(arr,value,low,median - 1);
        }else {
            return binarySearch(arr,value,median + 1,high);
        }
    }
}
