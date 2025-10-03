package org.java.arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int nums[] = {1,2,0,3,0,4,5,0,0,6,7,0};
        MoveZeroToEnd move = new MoveZeroToEnd();
        move.moveZeroes(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
  public void moveZeroes(int[] nums){
        if(nums.length == 1) return;
        int left = 0;
        for(int right =0 ;right < nums.length;right++){
            System.out.println("leftNum"+nums[left]+"rightNum"+nums[right]);
            if(nums[right] !=0){
                nums[left] = nums[right];
                left++;
            }
        }
        for(int i = left;i<nums.length;i++){
            nums[i] = 0;
        }
  }
}
