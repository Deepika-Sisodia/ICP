import java.util.*;
public class shift2DGrid {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        List<List<Integer>> ans = new ArrayList<>();
        k = k%(total);
        int[] arr = new int[m*n];
        int idx = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[idx] = grid[i][j];
                idx++;
            }
        }

        for(int i=0; i<m; i++){
            List<Integer> ll = new ArrayList<>();
            for(int j=0; j<n; j++){
                int newIdx = (i*n+j-k+total)%total;
                ll.add(arr[newIdx]);
            }
            ans.add(ll);
        }
        System.out.println(ans);
    }

    
}