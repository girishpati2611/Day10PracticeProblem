package com.java;

public class FrequencyOfElements {
    public static void main(String[] args) {
        //initialising array
        int arr[] = new int[]{1, 24, 6, 74, 5, 24, 76, 6, 6, 5, 24, 6};

        //Array fre will store the frequency of elements
        int fre[]=new int[arr.length];
        int visited =-1;

        for(int i=0; i<arr.length; i++){
           int count=1;
            for(int j=i+1; j<arr.length; j++){
             if(arr[i] == arr[j]){
               count++;

               fre[j]=visited;
            }
        }
        if(fre[i]!=visited)
          fre[i]=count;}
        System.out.println("Element | Frequency");
        for(int i=0; i<fre.length; i++){
           if(fre[i]!=visited)
               System.out.println(" "+arr[i]+" | "+fre[i]);
        }
    }
}