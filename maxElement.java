package Arrays;

public class maxElement {
    static int max_element(int [] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {8,4,9,144,23,0,-1};
        int ans = max_element(arr);
        System.out.println(ans);
    }
}
