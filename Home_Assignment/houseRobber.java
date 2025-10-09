import java.util.*;
public class houseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(robb(nums,dp,0));
    }

    public static int robb(int[] arr, int[] dp ,int idx){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }

        int rob = arr[idx]+robb(arr,dp,idx+2);
        int not_rob = robb(arr,dp,idx+1);

        return dp[idx] = Math.max(rob,not_rob);
    }
}
