public class searchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(search(matrix, target));
    }

    public static boolean search(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(target == matrix[i][j]){
                return true;
            }
            else if(target<matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }

        return false;
    }
}
