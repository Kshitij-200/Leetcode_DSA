package BitwiseOperators;

public class evenOrOdd {
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    public static void main(String[] args) {
        int n = 58;
        System.out.println(isOdd(n));
    }
}
