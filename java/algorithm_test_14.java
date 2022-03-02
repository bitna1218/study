package com.company;

import java.util.*;
import java.util.stream.StreamSupport;

public class algorithm_test_14 {
    public static void main(String[] args) {
        int a = 3;
        int b = 12;


    }
}

class Solution {
    public int[] solution(int a, int b) {

        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<Integer> arr1= new ArrayList<>();


        for(int i=1;i<=a;i++){
            if(a%i==0){
                arr.add(i);
            }
        }

        for(int i=1;i<=b;i++){
            if(b%i==0){
                arr1.add(i);
            }
        }

        arr.retainAll(arr1);
        int max= Collections.max(arr);
        int min=a*b/max;

        int[] answer = {max,min};
        System.out.println(answer);
        return answer;

    }
}
