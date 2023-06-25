package MathsForDsa;

public class Seive {
    static void sieve(int n, boolean [] primes){
        for (int i = 2; i*i <= n; i++){
            if (!primes[i]){

            }
        }
    }
    public static void main(String[] args) {
        int n = 49;
        boolean [] primes = new boolean[n + 1];
        sieve(n, primes);
    }
}
