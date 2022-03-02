import java.util.*;

public class Ex4_18 {public static void main(String[] args) {
    int menu = 0;
    int num =0;

    Scanner scanner = new Scanner (System.in);

    while(true){
        System.out.println("(1) 햄버거");
        System.out.println("(2) 닭갈비");
        System.out.println("(3) 토스트");
        System.out.println("원하는 메뉴(1~3)를 선택하세요.(종류는0)");

        String tmp = scanner.nextLine();
        menu = Integer.parseInt(tmp);

        if(menu==0){
            System.out.println("프로그램을 종료합니다.");
            break;
        }else if(!(1<=menu&& menu<=3)){
            System.out.println("메뉴를 잘못 선택하셨습니다.(종료는0)");
            continue;
        }
        System.out.println("선택하신 메뉴는 "+menu+"번 입니다.");
    }
}
}
