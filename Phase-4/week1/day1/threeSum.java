package week1.day1;
import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){

            if(i>0 && arr[i]==arr[i-1]) continue;

            for(int j=i+1; j<n-1; j++){

                if(j>i+1 && arr[j]==arr[j-1]) continue;

                for(int k=j+1; k<n; k++){

                    if(k>j+1 && arr[k]==arr[k-1]) continue;
                    
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
