package com.company;
import java.util.*;

public class algorithm_test_5 {
    public static void main(String[] args){
        Solution S = new Solution();
        String[] arr= {"kim","jane"};
        S.solution(arr);
    }
}


class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++){
            if ( seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }
}
