package search;

public class NandDoubleexists {
    public static boolean checkIfExist(int[] arr) {
        sort(arr);

        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++){
                if (arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}
