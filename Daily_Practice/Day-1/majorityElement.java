public class majorityElement {
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityEle(nums));
    }

    public static int majorityEle(int[] nums) {
        int candidate = nums[0];
        int v = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == candidate){
                v++;
            }
            else{
                v--;

                if(v==0){
                    candidate = nums[i];
                    v=1;
                }
            }
        }

        return candidate;
    }
}
