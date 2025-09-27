public class validPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int lo = 1;
        int hi = num;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            long sq = (long) mid*mid;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return false;
    }
}
