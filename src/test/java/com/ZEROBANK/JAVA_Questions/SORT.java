package com.ZEROBANK.JAVA_Questions;


import java.util.*;

public class SORT {


    public static void main(String[] args) {

        Integer arr[] = {3, 1, 1, 23, 6, 9, 7, 65, 2, 3};

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

//to remove duplicates of off an Array
        ArrayList<Integer>nonDups= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            int count= 0;

            for (int j = 0; j <arr.length ; j++) {
                if ( arr [i] == arr [j]){
                    count++;
                }
            }
            if(count==1){
                nonDups.add(arr[i]);
            }


        }



        System.out.println(nonDups);
        System.out.println(nonDups.get(nonDups.size() - 2));

    }




}
