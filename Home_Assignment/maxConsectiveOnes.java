public class maxConsectiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int n = nums.length;
        int l = 0, r = 0, maxLen = 0, zeroes = 0;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }

            while(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }

            int len = r-l+1;
            maxLen = Math.max(len,maxLen);
            r++;
        }

        System.out.println(maxLen);
    }
}
