public class bestTimeBuySell {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,8,4};
        int buy = arr[0];
        int sell = 0;
        int maxProfit = 0;
        int profit = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<buy){
                buy = arr[i];
            }
            else{
                sell = arr[i];
                profit = sell - buy;
            }

            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);
    }
}
