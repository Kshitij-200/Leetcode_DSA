package search;

public class minNumber {

    static int min_Number(int [] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {0,4,10,87,45,-88,23};
        int ans = min_Number(arr);
        System.out.println(ans);
    }
}
