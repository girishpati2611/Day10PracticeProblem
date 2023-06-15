package com.java;

public class PrintReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,0};

        System.out.println("Printing the elements of an array in reverse order.");
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
