import java.util.Arrays;

public class largestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        String[] arr = new String[nums.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(arr, (a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        String ans = sb.toString();

        if(ans.charAt(0)=='0'){
            System.out.println("0");
        }
        System.out.println(ans);
    }
}
