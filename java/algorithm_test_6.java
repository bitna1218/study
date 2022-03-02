package com.company;
import java.util.*;
public class Test_6 {
    public static void main(String[] args) {

        Solution S = new Solution();
        int []arr = {1, 1, 3, 3, 0, 1, 1};
        S.solution(arr);

//
//        int[] list = {1, 1, 3, 3, 0, 1, 1};
//        ArrayList <Integer> arrayList = new <Integer> ArrayList();
//
//        for(Integer item: list){
//            if(!arrayList.contains(item))
//                arrayList.add(item);
//        }
//        System.out.println(arrayList);
    }
}


class Solution {
    public static int solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (Integer item : arr) {
            if (!arrayList.contains(item))
                arrayList.add(item);
        }
        return arrayList;
    }
}
