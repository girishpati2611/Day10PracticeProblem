package com.java;

public class SmallestNo {
    public static void main(String[] args) {

        int []array={7,6,4,7,14,4,3,8,1};
        int smallestNo=array[0];
        for(int i=0; i<array.length; i++){
            if(smallestNo > array[i]) {
               smallestNo=array[i];
            }
        }
        System.out.println("The smallest no in the array is "+smallestNo);
    }
}

