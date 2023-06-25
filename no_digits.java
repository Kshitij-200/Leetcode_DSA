package search;

public class no_digits {
    public static void main(String[] args) {
        int a = 54;
        int count = 0;
        while (a > 0){
            count++;
            a = a / 10;
        }
        System.out.println(count);



    }
}
