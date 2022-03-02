package com.company;


public class algorithm_test_15 {
    public static void main(String[] args) {
        Solution1 S =new Solution1();
        S.solution(10);

            }
        }

class Solution1 {
    public long solution(long n) {
        long answer = 0;
        long b=(long)Math.sqrt(n);

        if(n==b*b){
            answer=(b+1)*(b+1);
        }else{
            answer=-1;
        }
        System.out.println(answer);
        return answer;
    }
}


    /*for(int i=1;i<=a;i++){              //식은 맞으나 런타임오류 ㅠㅠ
            if(a==i*i){
                answer=(i+1)*(i+1);
            }else{}
            }
        return answer;*/
