class Solution {
    boolean solution(String s) {
        char t;
        int a=0;
        int b=0;
        boolean answer;

        for(int i=0;i<s.length();i++){
            t=s.charAt(i);
            if(t=='p'||t=='P'){
                a+=1;
            }else if(t=='y'||t=='Y') {
                b+=1;
            }
        }
        if(a==b){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}
