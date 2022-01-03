class Solution {
    public String solution2(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer+="박";
            } else {
                answer+="수";
            }
        }

        return answer;
    }
}

public class algorithm_test_2 {
    public static void main(String[] args){
        Solution sol =new Solution();
        String a =sol.solution2(3);
        System.out.println(a);

    }
}