package search;

public class evenDigits {

    static int evenorNot(int n){
        int count = 0;
        while (n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    static int even_Digits(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (evenorNot(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {0,4,10,87,45,88,23};
        int ans = even_Digits(arr);
        System.out.println(ans);
//        int a = 7589;
//        System.out.println(evenorNot(a));

    }
}
