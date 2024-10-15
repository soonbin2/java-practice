package com.ohgiraffers.section01;

import java.util.Scanner;

public class JYS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        String firstNumber = sc.nextLine();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        String secondNumber = sc.nextLine();

        String reverseFirst = new StringBuilder(firstNumber).reverse().toString();
        String reverseSecond = new StringBuilder(secondNumber).reverse().toString();

        int firstReverse = Integer.parseInt(reverseFirst);
        int secondReverse = Integer.parseInt(reverseSecond);

        int sum = firstReverse + secondReverse;

        System.out.println("뒤집힌 첫 번째 숫자 : " + reverseFirst);
        System.out.println("뒤집힌 두 번째 숫자 : " + reverseSecond);
        System.out.println("두 숫자의 합계 : " + sum);

        sc.close();



    }
}
