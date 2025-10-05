package org.java.arrays;

import java.util.PriorityQueue;

public class FindMedianHeap {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public FindMedianHeap(){
        minHeap = new PriorityQueue<Integer>((a,b )-> a-b);
        maxHeap = new PriorityQueue<Integer>((a,b )-> b-a);
    }
    public void addNumber(int num){
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
        if(minHeap.size() < maxHeap.size()){
            minHeap.add(maxHeap.poll());
        }
    }
    public int findMedian(){
        if(minHeap.size() == maxHeap.size()){
            return (minHeap.peek()+maxHeap.peek())/2;
        }
        else
            return minHeap.peek();
    }

    public static void main(String[] args) {
        FindMedianHeap s = new FindMedianHeap();
        s.addNumber(1);
        s.addNumber(2);
        System.out.println("Median: " + s.findMedian());
        s.addNumber(3);
        System.out.println("Median: " + s.findMedian());
        s.addNumber(5);
        s.addNumber(6);
        s.addNumber(7);
        s.addNumber(8);
        s.addNumber(9);
        s.addNumber(10);
        s.findMedian();
        System.out.println("Median: " + s.findMedian());
    }
}
