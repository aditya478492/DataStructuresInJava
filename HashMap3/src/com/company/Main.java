package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int[] arr={0, -1, 2, -3, 1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    int s=-(arr[i]+arr[j]);
                    if(!map.containsKey(s)){
                        map.put(s,arr[j]);
                    }else {
                        if (s+arr[i]+arr[j]==0) {
                            System.out.println(arr[i] + " " + arr[j] + " " + s);
                        }
                    }
                }
            }
        }
    }
}
