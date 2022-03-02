package com.company;

public class algorithm_test_16 {
    public static void main(String[] args) {
        Solution S =new Solution();
        S.solution("fffff");
    }
}

/* class Solution {
    public boolean solution(String s) {           //1차 문제풀이ㅠㅠㅠㅠㅠㅠㅠㅠㅠ
        boolean answer = true;
        String b ="0123456789";
        char c;
        int e = 0;

        for(int i=0;i<s.length();i++) {
            c = s.charAt(i);
            String d = String.valueOf(c);
            if (b.contains(d)) {
                e = e + 1;

            } else {
                e = e + 2;
            }
        }
        if(s.length()==4||s.length()==6) {
            if (e == s.length()) {
                answer = true;
            } else {
                answer = false;
            }
        }else{
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}*/

class Solution {
    public boolean solution(String s) {
        String b = s.replaceAll("[0-9]",""); //2차 문제풀이ㅠㅠㅠㅠㅠㅠㅠㅠㅠ
        boolean answer = true;

        if(s.length()==4||s.length()==6) {
            if (b.length() == 0) {
                answer = true;
            } else {
                answer = false;
            }
        }else{
            answer = false;
        }

        System.out.println(answer);
        return answer;
    }
}





