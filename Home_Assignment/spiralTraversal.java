public class spiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int startrow = 0, startcol = 0;
        int endrow = arr.length-1, endcol = arr[0].length-1;
        int te = arr.length*arr.length;
        int c = 0;
        while(te>c){
            for(int i=startcol; i<=endcol && c<te; i++){
                System.out.print(arr[startrow][i]+" ");
                c++;
            }

            startrow++;
            for(int i=startrow; i<=endrow && c<te; i++){
                System.out.print(arr[i][endcol]+" ");
                c++;
            }
            endcol--;
            for(int i=endcol; i>=startcol && c<te; i--){
                System.out.print(arr[endrow][i]+ " ");
                c++;
            }
            endrow--;
            for(int i=endrow; i>=startrow && c<te; i--){
                System.out.print(arr[i][startcol]+ " ");
                c++;
            }
            startcol++;
        }

    }
}
