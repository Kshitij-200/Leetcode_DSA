package Strings;

public class palindrome {
    static boolean palindromeorNot(String s){
        s = s.toLowerCase();
        int start = s.charAt(0);
        int end = s.charAt(s.length() - 1);
        while (start <= end){
            if (start != end){
               return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcdcba";
        System.out.println(palindromeorNot(s));
    }
}
