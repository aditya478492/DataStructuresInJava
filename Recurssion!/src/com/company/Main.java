package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        System.out.print(fact(num));
    }

public static int fact(int n){
    if(n==0){
        return 1;
    }else{
        return n*fact(n-1);
    }
}}
