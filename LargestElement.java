package com.java;

public class LargestElement {
    public static void main(String[] args) {

    int []array={7,6,4,7,14,4,3,8,0};
    int largestNo=array[0];
      for(int i=0; i<array.length; i++){
         if(largestNo < array[i]) {
            largestNo=array[i];
         }
     }
        System.out.println("The largest no in the array is "+largestNo);
    }
}
