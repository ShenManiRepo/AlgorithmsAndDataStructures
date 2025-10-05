package org.java.arrays;

import java.util.HashMap;

public class LargestSubarraySumZero {
    public static void main(String[] args) {
        int[] input = {15,1,2,-2,3,-4,9,-8,7,1,-2,4,5,-3,2,8};
        int[] input1 = {10, 5, 2, 7, 1, 9};
        int k =15;
        LargestSubarraySumZero obj = new LargestSubarraySumZero();
        int result = obj.sampleMethod(input1,k);
        System.out.println("Result: " + result);
    }
    public int sampleMethod(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0, maxlen = 0;

        for(int i=0;i< nums.length;i++){
            System.out.println("numbers: "+nums[i]);
            sum += nums[i];
            System.out.println("Sum: "+sum);
            System.out.println("maxlen: "+maxlen);
            if(sum == k){
                System.out.println("inside if sum==k");
                maxlen = i+1;
            }else if(map.containsKey(sum-k)){
                System.out.println("inside else if sum-k");
                maxlen = Math.max(maxlen,i-map.get(sum-k));
            }else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}
