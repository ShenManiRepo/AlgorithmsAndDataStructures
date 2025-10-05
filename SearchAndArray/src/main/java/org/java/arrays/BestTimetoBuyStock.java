package org.java.arrays;

public class BestTimetoBuyStock {
    public static void main(String[] args) {
        BestTimetoBuyStock obj = new BestTimetoBuyStock();
        int[] input = {7,1,3,6,3,4,8};
        int result = obj.sampleMethod(input);
        System.out.println("Result: " + result);
    }
    public int sampleMethod(int[] nums) {
        int profit = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                profit = profit + (nums[i]-nums[i-1]);
            }
        }
        return profit;
    }
}
