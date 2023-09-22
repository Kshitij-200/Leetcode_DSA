class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        int [][] t1 = new int [m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            t1[i][0] = 0;
        }

        for(int j = 1; j <= n; j++){
            t1[0][j] = 0;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    t1[i][j] = 1 + t1[i - 1][j - 1];
                }else{
                    t1[i][j] = Math.max(t1[i - 1][j] ,t1[i][j - 1]);
                }
            }
        }

        if(t1[m][n] == m){
            return true;
        }

        return false;
    }
}