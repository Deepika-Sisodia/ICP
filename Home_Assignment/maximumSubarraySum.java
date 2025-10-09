public class maximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
            maxSum = Math.max(maxSum,dp[i]);
        }

        System.out.println(maxSum);
    }
}
