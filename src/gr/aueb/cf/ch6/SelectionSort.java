package gr.aueb.cf.ch6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 11, 3, 25, 12};


        int minPosition = 0;
        int minVal = arr[minPosition];
        int tmp;

        //Find the min value
        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            minVal = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minPosition = j;
                    minVal = arr[j];
                }
            }
                //Swap
                tmp = arr[i];
                arr[i] = arr[minPosition];
                arr[minPosition] = tmp;
            }
            for (int item : arr)
                System.out.print(item + " ");
        }
    }

