package gr.aueb.cf.ch6;

public class SymmetricArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3};

        System.out.println("Is symmetric "+isArraySymmetric(arr));
        System.out.println("Is symmetric "+isAreSymmetric(arr));
    }
    public static boolean isArraySymmetric(int[] arr){
        boolean isSymmetric = true;

        for(int i = 0 , j = arr.length-1; i < j; i++, i--){
            if(arr[i] != arr[j]){
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isAreSymmetric(int[] arr){
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for(int i = 0; i < n/2; i++){
            if(arr[i] != arr[n-1]){
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
