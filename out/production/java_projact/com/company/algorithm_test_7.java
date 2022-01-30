package com.company;

public class algorithm_test_7 {
    public static void main(String[] args){
        Solution S= new Solution();
        S.solution("qwer");
    }
}

class Solution {
    public String solution(String s) {
        String [] arr=s.split("");
        int a=0;
        int b=0;
        int c=0;
        String answer = "";

        for(int i=0;i<s.length();i++){
            if(s.length()%2==1){
                a= s.length()/2;
                answer= arr[a];
                break;

            }else{
                b= s.length()/2;
                c= b-1;
                answer=arr[c]+arr[b];
                break;
            }
        }
        return answer;
    }
}