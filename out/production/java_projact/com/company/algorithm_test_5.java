package com.company;
import java.util.*;

public class algorithm_test_5 {
    public static void main(String[] args){


        int count ;
        String num[];
        String search;
        int locate;

        Scanner scanner=new Scanner(System.in);
        System.out.println("입력할 단어의 총갯수는?");
        count = scanner.nextInt();
        num = new String[count];

        System.out.println("단어를 입력하세요.");

        for(int i=0;i<count;i++){
            num[i]=scanner.next();
        }
        System.out.println("찾는걸 입력하세요.");
        search=scanner.next();
        locate=Arrays.asList(num).indexOf(search);

        System.out.println("김서방은"+locate+"있습니다.");

           }
        }


