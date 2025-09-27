public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }

    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0, mid = 0, hi = n-1;

        while(mid<=hi){
            if(nums[mid] == 0){
                swap(nums,lo,mid);
                lo++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,hi);
                hi--;
            }
        }

    }

    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
