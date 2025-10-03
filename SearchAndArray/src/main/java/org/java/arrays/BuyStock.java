package org.java.arrays;

public class BuyStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,8,4};
        BuyStock buyStock = new BuyStock();
        int maxProfit = buyStock.maxProfit2(prices);
        System.out.println("Max Profit: " + maxProfit);
    }
    public int maxProfit(int[] prices){
        int left = 0;
        int profit = 0;
        for(int right = 1;right<prices.length;right++){
            if(prices.length == 1) return 0;
            if(prices[left] > prices[right]){
                left++;
            }else{
                int diff = prices[right] - prices[left];
                if(diff > profit){
                    profit  = diff;
                }
            }
        }
return profit;
    }
    public int maxProfit2(int[] nums){
        int profit = 0;
        int left =0;
        for(int right = 1; right < nums.length;right++){
            if(nums.length == 1) return 0;
            if(nums[right] > nums[left]){
                profit = Math.max(profit,nums[right]-nums[left]);

            }else{
                left = right;
            }
        }
        return profit;
    }
}
