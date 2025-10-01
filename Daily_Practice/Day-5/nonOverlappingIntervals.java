import java.util.Arrays;

public class nonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);

        int c = 0;
        int prev = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<prev){
                c++;
            }
            else{
                prev = intervals[i][1];
            }
        }
        System.out.println(c);
    }
}
