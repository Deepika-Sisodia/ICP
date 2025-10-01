import java.util.ArrayList;
import java.util.Arrays;

public class jobSequencing {
    public static void main(String[] args) {
        int deadline[] = {4, 1, 1, 1}, profit[] = {20, 10, 40, 30};
        int n = deadline.length;
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = deadline[i];
            arr[i][1] = profit[i];
        }
        
        Arrays.sort(arr, (a,b)->b[1]-a[1]);
        
        int maxDeadline = 0;
        for(int i: deadline){
            maxDeadline = Math.max(maxDeadline,i);
        }
        
        boolean[] slot = new boolean[n+1];
        int count = 0;
        int tprofit = 0;
        
        for(int i=0; i<n; i++){
            int d = arr[i][0];
            for(int j=d; j>0; j--){
                if(!slot[j]){
                    slot[j] = true;
                    count++;
                    tprofit += arr[i][1];
                    break;
                }
            }
        }
        
        
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(count);
        ll.add(tprofit);
        System.out.println(ll);
    }
}
