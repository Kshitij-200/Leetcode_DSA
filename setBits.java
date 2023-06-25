package BitwiseOperators;

public class setBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(set_bits(n));
    }

    static int set_bits(int n){
        int count = 0;
        while (n > 0){
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
