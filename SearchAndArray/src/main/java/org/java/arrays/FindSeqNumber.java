package org.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSeqNumber {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        FindSeqNumber solution = new FindSeqNumber();
        int[] seqList = solution.findSeqNum(low,high);
        System.out.println("Sequential numbers between " + low + " and " + high + " are: " + Arrays.toString(seqList)+"Number of possible:"+seqList.length);
    }
    public int[] findSeqNum(int low,int high) {
        List<Integer> result = new ArrayList<>();
        String maxseq = "123456789";
        for (int i = 1; i < 9; i++) {
            System.out.println("i value: " + i);
            for (int j = 0; i + j <= 9; j++) {

                String substr = maxseq.substring(j, i + j);
                System.out.println("i+j value: " + substr);
                int num = Integer.parseInt(substr);
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        int[] res = Arrays.stream(result.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        return res;
    }
}
