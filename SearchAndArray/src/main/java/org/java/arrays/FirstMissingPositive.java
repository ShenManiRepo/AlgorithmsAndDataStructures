package org.java.arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] unsortedMixedMumbers = {-3,1,2,-1,0,4,7};
        FirstMissingPositive obj = new FirstMissingPositive();
        int result = obj.sortArr(unsortedMixedMumbers);
        System.out.println("First Missing Positive: " + result);
    }
    public int sortArr(int[] nums){

        int n = nums.length;
        for(int i=0;i<nums.length;i++){
        while(nums[i] >0 && nums[i] < n && nums[nums[i]-1] != nums[i]){
            int temp = nums[nums[i] -1];
            nums[nums[i]-1] = nums[i];
            nums[i] = temp;
        }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1)
                return j+1;
        }
        return n+1;
    }

}
