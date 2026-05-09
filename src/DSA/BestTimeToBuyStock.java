package DSA;

public class BestTimeToBuyStock {

    // Implement logic
    public static int maxProfit(int[] prices) {
        // initialize min value with a max
        int min = Integer.MAX_VALUE;
        // initialize max profit with 0;
        int max = 0;
        for (int price: prices) {
            // set the min always
            min = Integer.min(price, min);
            // store the max profit based on the current price and stored min price
            max = Integer.max(max, price-min);
        }
        // return max profit
        return max;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4}; // answer 5, buy @ 1 and sell @ 6

        int result = maxProfit(prices);

        System.out.println("Max Profit: " + result);
    }
}