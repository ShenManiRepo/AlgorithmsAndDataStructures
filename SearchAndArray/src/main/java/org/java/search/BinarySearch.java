package org.java.search;

public class BinarySearch {
    public static void main(String[] argv) {
        System.out.println("Hello, world!");
        System.out.println("This is a fully functioning Java environment.");
        BinarySearch s = new BinarySearch();
        int[] input_arr = {1,2,3,4,5,6,7,8,9,11,13,15,17,19};
        int search_num = 17;
        int index = s.searchIntIndex(input_arr,search_num);
        System.out.println("Index of the number is: "+index);
    }
    public int searchIntIndex(int[] input_arr,int num){
        int index = 0;
        int left = 0;
        int right = input_arr.length - 1;
        while(left <= right){
            int mid = (left+right)/2;

            if(input_arr[mid] == num){
                return mid+1;
            }
            if(num < input_arr[mid]){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }

}
