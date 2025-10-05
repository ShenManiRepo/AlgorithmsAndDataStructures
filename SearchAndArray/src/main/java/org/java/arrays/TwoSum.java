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
        int target = 5;
        int[] indices = s.twoSumEfficient(input_nums, target);
        System.out.println("Indices of the two numbers that add up to target: " + indices[0] + ", " + indices[1]);
    }
    public int[] twoSumEfficient(int[] nums,int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int searchEle = target-nums[i];
            System.out.println("Search element:"+searchEle+"element at index"+nums[i]);
            if(map.containsKey(searchEle)){
                System.out.println("nth element:"+map.get(i));
                return new int[]{map.get(searchEle),i};
            }else{
                System.out.println("numbers in array:"+nums[i]+":Index"+i);
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,1};
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
