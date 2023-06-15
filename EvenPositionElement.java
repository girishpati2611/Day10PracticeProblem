package com.java;

public class EvenPositionElement {
    public static void main(String[] args) {
        int arr[]=new int[]{3,6,2,4,3,9,7};

        System.out.println("Printing the elements in the array present on even position ");
        for(int i=0; i< arr.length; i++){
            if(i % 2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
