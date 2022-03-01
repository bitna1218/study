package com.company;

public class algorithm_test_10 {
    public static void main(String[] args) {
        Solution S= new Solution();
        int[] array={1,2,3,4};
        S.solution(array);
    }
}

class Solution {
    public double solution(int[] arr) {
        double a=0;
        double answer=0;

        for(int i=0;i<arr.length;i++){
            a=a+arr[i];
        }
        answer=a/arr.length;
        return answer;
    }
}
