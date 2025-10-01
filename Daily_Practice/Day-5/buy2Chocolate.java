import java.util.Arrays;

public class buy2Chocolate {
    public static void main(String[] args) {
        int[] prices = {3,2,3};
        int money = 3;
        System.out.println(buyChoco(prices, money));
        
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total = prices[0]+prices[1];
        if(money>=total){
            return money-total;
        }
        return money;
    }
}
