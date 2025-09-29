import java.util.ArrayList;
import java.util.List;

public class luckyMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ll = new ArrayList<>();
        for(int i=0; i<m; i++){
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for(int j=0; j<n; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    idx = j;
                }
            }
            int max = Integer.MIN_VALUE;
            for(int j=0; j<m; j++){
                max = Math.max(max,matrix[j][idx]);
            }
            
            if(min==max){
                ll.add(min);
            }
        }

        
        
        System.out.println(ll);
    }
}
