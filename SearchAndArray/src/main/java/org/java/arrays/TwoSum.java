package org.java.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        //Solve the issues using hashmap
        int[] input_nums = {2,1,3,5,8};
        TwoSum s = new TwoSum();
        int target = 8;
        int[] indices = s.twoSum(input_nums, target);
        System.out.println("Indices of the two numbers that add up to target: " + indices[0] + ", " + indices[1]);
    }
    public int[] twoSum(int[] nums,int target){
        int[] result = new int[2];
        Map<Integer,Integer> inputMap = new HashMap<Integer,Integer>();
        inputMap = IntStream.range(0,nums.length).boxed().collect(Collectors.toMap(i->i, i->nums[i]));
        for(Map.Entry<Integer,Integer> getElem: inputMap.entrySet()){
            int complement = target - getElem.getValue();
            System.out.println("complement:"+complement);
            System.out.println("getElem.getKey():"+getElem.getKey());
            System.out.println("getElem.getValue():"+getElem.getValue());
            if(inputMap.containsValue(complement) && inputMap.get(getElem.getKey()) != complement){
                result[0] = getElem.getKey();
                for(Map.Entry<Integer,Integer> getElem2: inputMap.entrySet()){
                    if(getElem2.getValue() == complement){
                        result[1] = getElem2.getKey();
                    }
                }
            }
        }
        return result;
    }
}
