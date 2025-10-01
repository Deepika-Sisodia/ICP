import java.util.*;
public class activitySelection{
    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5}, finish = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = start[i];
            arr[i][1] = finish[i];
        }
        
        Arrays.sort(arr, (a,b)-> a[1]-b[1]);
        
        int activites = 1;
        int prev = arr[0][1];
        for(int i=1; i<n; i++){
            if(arr[i][0]>prev){
                activites++;
                prev = arr[i][1];
            }
        }
        System.out.println(activites);
    }
}