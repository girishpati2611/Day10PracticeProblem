package com.java;

public class OddPositionElement {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8};

        System.out.println("Printing the elements in the array present on odd position ");
        for(int i=0; i< arr.length; i++){
            if(i % 2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
