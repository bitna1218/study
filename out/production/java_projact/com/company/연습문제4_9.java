
public class 연습문제4_9 {public static void main(String[] args){
    int num=12345;
    int sum=0;
    int a=0;
    int b=0;
    int c=0;

    for(int i=1;i<=5;i++){
        if(i==1){
            b=num;
            b %= 10;
    }
        else {
            num /= 10;
            a = num;
            a %= 10;
            c+=a;
        }
    }
    sum=b+c;
    System.out.println("sum="+sum);
    }
    }








