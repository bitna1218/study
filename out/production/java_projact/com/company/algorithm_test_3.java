import java.util.*;

class algorithm_test_3 {
    public static void main(String[]args){

        int i =0;
        int j =0;
        int sum =0;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n =Integer.parseInt(input);

        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i*j==n){
                    sum+=i;
                }
            }
            }
        System.out.println(sum);
        }
    }


