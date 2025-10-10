import java.util.*;
public class uniquePath {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        boolean[][] board = new boolean[m][n];
        int [][] dp = new int[m][n];
        for(int i[]: dp){
            Arrays.fill(i,-1);
        }
       
        System.out.println(paths(board,m,n,0,0,dp));
    }

    public static int paths(boolean board[][], int m, int n, int cr, int cc, int[][] dp){
        if(cr==m-1 && cc==n-1){
            return 1;
        }
        if(cr<0 || cc<0 || cr>m-1 || cc>n-1 || board[cr][cc]==true){
            return 0;
        }

        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }

        board[cr][cc] = true;
        // down
        int p1 = paths(board,m,n,cr+1,cc,dp);
        // right
        int p2 = paths(board,m,n,cr,cc+1,dp);
        board[cr][cc] = false;

        return dp[cr][cc]=p1+p2;
    }
}
