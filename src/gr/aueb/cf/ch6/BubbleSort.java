package gr.aueb.cf.ch6;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,6,4,8,3,6,5};

        for(int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j, i);
                }
            }
        }
        for(int element : arr){
            System.out.print(element + " ");
        }
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
