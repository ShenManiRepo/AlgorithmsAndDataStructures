package org.java.arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] input = {7,1,3,6,3,4,8};
        int k = 89;
        int[] result = obj.sampleMethod(input, k);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public int[] sampleMethod(int[] nums,int k){
        System.out.println("k value: "+k + " nums length: "+nums.length);
        k = k%nums.length;
        System.out.println("k value: "+k);
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return nums;
    }
    public void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
