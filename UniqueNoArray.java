package BitwiseOperators;

public class UniqueNoArray {
    public static int findUnique(int [] arr){
        int unique = 0;

        for (int i = 0; i < arr.length; i++){
            unique ^= i;
        }
        return unique;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,3,4,2,7,4};
        System.out.println(findUnique(arr));
    }
}
