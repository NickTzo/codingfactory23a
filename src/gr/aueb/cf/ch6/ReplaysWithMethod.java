package gr.aueb.cf.ch6;

/**
 * Update Elements
 */
public class ReplaysWithMethod {
    public static void main(String[] args) {
    int[] grades;
    grades =  new int[]{10,15,18,19};
    upscaleByOne(grades);
    printArray(grades);
    }
    public static void upscaleByOne(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] += 1;
        }

    }

    public static void  printArray(int[] arr){
        for(int item : arr){
            System.out.println(item+ " ");
        }
    }
}
