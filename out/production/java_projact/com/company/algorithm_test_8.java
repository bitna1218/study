package com.company;

import java.util.*;

public class algorithm_test_8 {
    public static void main(String[] args) {
        Solution1 S= new Solution1();
        S.solution(2,5);
    }
    }
class Solution1 {
    public long[] solution(int x, int n) {
        long[] array = new long[n];
        long[] answer = {};
        int a = 0;

        if (0 < x) {
            for (int i = 0; i < n; i++) {
                a = a + x;
                array[i] = a;
                answer=array;
            }
        } else {
            for (int i = 0; i < n; i++) {
                a = a + x;
                array[i] = a;
                answer=array;
            }
        }
        return answer;
    }
}

//    class Solution1 {
//        public long[] solution(int x, int n) {
//            long[] answer = {};
//            ArrayList arrayList1 = new ArrayList();
//            int a = x * n;
//
//            if (0 < x) {
//                for (int i = x; i <= a; i += x) {
//                    arrayList1.add(i);
//                }
//            } else {
//                for (int i = x; a <= i; i += x) {
//                    arrayList1.add(i);
//                }
//            }
//            return answer;
//        }
//    }
