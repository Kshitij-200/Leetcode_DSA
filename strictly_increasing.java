package Arrays;

public class strictly_increasing {

    public static int makeArrayIncreasing(int[] arr1, int[] arr2) {
        int c = 0;

        for(int i = 0; i < arr1.length - 1; i++){
                if(arr1[i] > arr1[i + 1]) {
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr2[j] > arr1[i - 1] && arr2[j] < arr1[i + 1]) {
                            swap(arr1[i], arr2[j]);
                            c++;
                        } else {
                            j++;
                        }
                    }
                }
        }

        return c;
    }

    public static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,5,3,6,7};
        int [] arr2 = {4,3,1};
        int ans = makeArrayIncreasing(arr1,arr2);
        System.out.println(ans);
    }
}
