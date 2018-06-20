package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int[] arr={1, 2, 3, 4, 5};
        int k=3;
        for(int i=0;i<arr.length;i++){
            if(!map.containsValue(arr[i])){
                map.put(arr[i],i);
            }else{
                int dist=map.get(arr[i]);
                dist=i-dist;
                if(k==dist){
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }
}
