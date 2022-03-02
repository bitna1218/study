package com.company;

import java.util.*;

public class algorithm_test_13 {
    public static void main(String[] args){
        Solution4 S= new Solution4();
        S.solution(1234);
    }
}

class Solution4 {
    public int solution(int n) {
        int answer = 0;
        int b = 0;

        for (int i = 0; true; i++) {
            b = n % 10;
            answer = answer + b;
            n = n / 10;

            if (n == 0) {
                break;
            }
        }
        return answer;
    }
}



//처음은 a을 10%를 해서 나온값을 배열에 저장
//두번째는 a를 10으로 나누면 숫자두개 출력중 a을 10%를 해서 나온값을 배열에 저장
//for문 반복으로 출력하기
