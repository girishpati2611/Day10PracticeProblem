package com.java;

public class SortArray {
    public static void main(String[] args) {
        int array[]={2,5,3,7,4,9,6,8,1};

        System.out.println("The given array is :");
        for (int i=0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
            System.out.println("Sorted array in ascending order is :");
            for (int j=0; j< array.length; j++){
                for (int k=j+1; k< array.length; k++){
                    if(array[j] > array[k]){
                        int temp= array[j];
                        array[j]=array[k];
                        array[k]=temp;
                    }
                }
            }
            for (int i=0; i< array.length; i++){
                System.out.print(array[i]+" ");
        }
    }
}
