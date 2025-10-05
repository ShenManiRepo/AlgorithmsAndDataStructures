package org.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] inputArr = {2,3,4,1,5,6};
        FindDuplicate findDuplicate = new FindDuplicate();
        boolean duplicate = findDuplicate.findDuplicate(inputArr);
        System.out.println("Duplicate number present: " + duplicate);
    }
    public boolean findDuplicate(int[] inputArr){
        Set inputSet = new HashSet<Integer>();
        for(int i=0;i<inputArr.length;i++){
            if(inputSet.contains(inputArr[i])){
                return true;
            }else{
                inputSet.add(inputArr[i]);
            }
        }
        return false;
    }
}
