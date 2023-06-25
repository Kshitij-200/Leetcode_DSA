package search;

public class linear_search {
    static int  linearSearch(int [] arr, int target){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {5,4,10,87,45,5,23};
        int ans = linearSearch(arr,0);
        System.out.println(ans);

    }
}
