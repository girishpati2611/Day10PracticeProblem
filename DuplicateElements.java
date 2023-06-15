package com.java;

public class DuplicateElements {
    public static void main(String[] args) {
        int array[]=new int[]{2,1,3,5,2,7,5,9,1};

        System.out.println("Printing duplicate elements in the array");
        for(int i=0; i< array.length; i++){
            for(int j=i+1; j< array.length; j++){
                if(array [i]==array [j]){
                    System.out.print(array[i]+" ");
                }
            }
        }
    }
}
