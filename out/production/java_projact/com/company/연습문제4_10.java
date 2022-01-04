import java.util.*;

public class 연습문제4_10 {
    public static void main(String[] args){
        int answer=(int)(Math.random()*100)+1;
        int input=0;
        int count=0;

        java.util.Scanner s =new java.util.Scanner(System.in);
        do{
            count++;
            System.out.print("1과 100사이의 값을 입력하시요:");
            input=s.nextInt();

            if(answer>input){
                System.out.println("더 큰수를 입력하세요.");
            }
            else if(answer<input){
                System.out.println("더 작은수를 입력하세요.");
            }
            else if(answer==input){
                System.out.println("맞혔습니다.");
                System.out.println("시도 횟수는"+count+"번 입니다.");
                break;
            }

        }while(true);

    }
}
