package com.ohgiraffers.section01;

import java.util.Scanner;

public class LHJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = sc.nextInt();

        int[] result = new int[9];

        for(int i=1; i<=9; i++){
            result[i-1] = number * i;
        }

        System.out.println("입력한 값 " + number + "에 대한 곱셈 결과 : ");
        for(int results : result){
            System.out.println(results);
        }

        sc.close();

    }
}
