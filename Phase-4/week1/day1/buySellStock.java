package week1.day1;
import java.util.*;

public class buySellStock {
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;

        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        //     int buy = arr[i];
        //     for(int j=i+1; j<n; j++){
        //         max = Math.max(arr[j]-buy,max);
        //     }
        // }

        // System.out.println(max);

        int max_profit = Integer.MIN_VALUE;
        int buy = arr[0];
        for(int i=1; i<n; i++){
            if(buy>arr[i]){
                buy = arr[i];
            }
            else{
                int sell = arr[i];
                int profit = sell-buy;

                max_profit = Math.max(max_profit,profit);
            }
        }

        System.out.println(max_profit);
    }
}

