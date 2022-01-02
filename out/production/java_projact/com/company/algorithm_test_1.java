class Solution {
    public long solution(int a, int b){
        long answer = 0;
        if(a<b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        else if (b<a){
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        else{
            answer=a;
        }
        return answer;
    }
}

public class algorithm_test_1 {
    public static void main(String[] args){


    }
}
