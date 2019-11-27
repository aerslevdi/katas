package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int number) {
        int n = 0;
        int total = 0;
        while (n < number){
            if(n%3==0 || n%5 ==0){
                total = total + n;
            }
            n++;
        }
        return total;

    }

    public String highAndLow(String numbers){
        String[] nro = numbers.split(" ");

        int largo = nro.length;
        for (int i= 0; i<largo-1;i++) {
            int a = Integer.parseInt(nro[i]);
            for (int j = 0; j < largo - i - 1; j++) {
                if (Integer.parseInt(nro[j]) < Integer.parseInt(nro[j + 1])) {// swap arr[j+1] and arr[i]
                    String temp = nro[j];
                    nro[j] = nro[j + 1];
                    nro[j + 1] = temp;
                }

            }
        }
        int fin = largo-1;
        return nro[0] + " " +nro[fin];
    }
    public static long findNextSquare(long sq) {
       double start = Math.sqrt(sq);
        long nextSquare;
       if(start%1 ==0){
           nextSquare = (int)start;
           nextSquare = nextSquare+1;
           nextSquare = nextSquare * nextSquare;
       } else{
           nextSquare = -1;
       }

        return nextSquare;
    }
    public static int makeNegative(final int x) {
        if(x<=0){
            return x;
        }else{
            return x*-1;
        }

    }
    static String timeConversion(String s) {
        String[] arr = s.split(":");
        String solu= "";
        String midNoon = arr[2].substring(2);
        int plusTwelve = Integer.parseInt(arr[0]);
       /* for(int i =0;i<3;i++){
            if(Character.isAlphabetic(s.charAt(i))){
                return solu= arr[0]+":"+arr[1]+":"+arr[2];
            }else{
                int timeTurner = 12+Integer.parseInt(arr[0]);

                return solu = timeTurner +":"+ arr[1] +":"+ arr[2];
            }
        }*/
        if(midNoon.equalsIgnoreCase( "AM") && plusTwelve<10){

            return solu= "0"+arr[0]+":"+arr[1]+":"+arr[2].substring(0,2);
        }else if(midNoon.equalsIgnoreCase("AM") && plusTwelve==12){
            return solu= arr[0]+":"+arr[1]+":"+arr[2].substring(0,2);
        }else{
            int timeTurner = 12+plusTwelve;
            return solu = timeTurner +":"+ arr[1] +":"+ arr[2].substring(0,2);

        }

    }
}