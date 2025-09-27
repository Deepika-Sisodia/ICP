public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,7,9};
        int target = 4;

        System.out.println(lowerBound(arr, target));
    }

    public static int lowerBound(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                ans = mid;
                hi = mid - 1;
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }

        return ans;
    }
}
