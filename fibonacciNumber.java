package Recursion;

public class fibonacciNumber {
    public static int fibonacci_number(int n){
        if (n < 2){
            return n;
        }
        return fibonacci_number(n - 1) + fibonacci_number(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci_number(6));
    }
}
