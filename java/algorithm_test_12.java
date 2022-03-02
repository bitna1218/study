package com.company;

public class algorithm_test_12 {
    public static void main(String[] args){

        Solution3 S= new Solution3();
        S.solution(5);

    }
}

class Solution3 {
    public String solution(int num) {
        String answer = "";

        if(num%2==0){
            answer="Even";
        }else{
            answer="Odd";
        }
        return answer;
    }
}
