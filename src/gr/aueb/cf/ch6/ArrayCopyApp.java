package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Makes an array copy using utility methods
 */
public class ArrayCopyApp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = new int[arr.length];
        int[] arr3;

        //System Array Copy
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        //Second Array Copy with Arrays Class
        Arrays.copyOf(arr, arr.length);
        //arr.length = τα ιδια στοιχεια αλλα μπορουμε και περισσοτερα και λιγοτερα στοιχεια δηλαδη arr.length+10 η arr.length-5

        //Third Array Copy with Arrays Class
        arr3 = Arrays.copyOfRange(arr, 0, arr.length);
    }
}
