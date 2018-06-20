package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
       int[] arr={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
       int max=0;
       for(int i=0;i<arr.length;i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i],i);
           }else{
               int dist=map.get(arr[i]);
               dist=i-dist;
               if(dist>=max){
                   max=dist;
               }
           }
       }
       System.out.println("Distance:"+max);
    }
}
