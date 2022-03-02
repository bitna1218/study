package com.company;

import java.util.Scanner;

public class 계산기 {public static void main(String[] args) {

    int result;
    System.out.println("연산자를 선택하여 번호를 누르세요.");
    System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");

    Scanner scanner = new Scanner(System.in);
    result = scanner.nextInt();

    if (1 == result) {

        System.out.println("숫자 2개를 입력하세요.");
        Scanner number = new Scanner(System.in);
        int X = number.nextInt();
        int Y = number.nextInt();

        int a = X + Y;

        System.out.println("답은" + a);
    } else if (2 == result) {

        System.out.println("숫자 2개를 입력하세요.");
        Scanner number = new Scanner(System.in);
        int X = number.nextInt();
        int Y = number.nextInt();

        int a = X - Y;

        System.out.println("답은" + a);
    } else if (3 == result) {

        System.out.println("숫자 2개를 입력하세요.");
        Scanner number = new Scanner(System.in);
        int X = number.nextInt();
        int Y = number.nextInt();

        int a = X * Y;

        System.out.println("답은" + a);

    } else if (4 == result) {

        System.out.println("숫자 2개를 입력하세요.");
        Scanner number = new Scanner(System.in);
        float X = number.nextInt();
        float Y = number.nextInt();

        float a = X / Y;

        System.out.println("답은" + a);
    }

    else{
        System.out.println("번호를 잘못 눌렸습니다. 다시 누르세요.");
    }
}
}
