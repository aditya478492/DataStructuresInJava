package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int x=0,y=0,res,res1=0;
        for(int i=1;i<=num;i++){
            y=i;
            res=1;
            while(y!=0){
                x++;
                res=res*x;

                y--;
            }
            res1=res1+res;
        }
        System.out.print(res1);
    }
}
