package DSA.LeetCode.BuynSellStock;

public class BuynSellStock {

    public static int buynSellStock(int[] prices) {
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyStock < prices[i]) {
                int profit = prices[i] - buyStock;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStock = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 5, 4, 1, 6, 7, 3 };
        System.out.println(buynSellStock(prices));
    }

}
