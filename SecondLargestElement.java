package com.java;

public class SecondLargestElement {

        //Sorting array in ascending order to find second largest element
    public static void secondLargest(int array[]) {
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] > array[k]) {
                    int temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }
        System.out.println("The second largest element in the array is "+array[array.length-2]);
    }
    public static void main(String[] args) {
        int array[]=new int[]{6,4,7,2,8,9,4,10,6};
        secondLargest(array);
    }
}
