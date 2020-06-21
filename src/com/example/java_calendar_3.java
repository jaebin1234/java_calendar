package com.example;

import java.util.Scanner;

public class java_calendar_3 {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int dayMethod(int n) {
        return MAX_DAYS[n - 1];
    }

    public static void main(String[] args) {
        java_calendar_3 cal = new java_calendar_3(); //생성자로 객체 만들기

        String PROMPT = "cal> ";

        Scanner sc = new Scanner(System.in);
        System.out.println("반복횟수를 입력하세요.");

        int repeat = sc.nextInt();

        int[] n = new int[repeat];// 배열 n선언 ,입력받은 repeat만큼의 크기로 선언.
        for (int j = 0; j < repeat; j++) {
            System.out.println("입력 하고 싶은 월을 입력하시오.");
            System.out.print(PROMPT);
            n[j] = sc.nextInt();
            System.out.println(n[j] + "월은 " + cal.dayMethod(n[j]) + " 일까지 있습니다.");

        }
        System.out.println("Bye~");
        sc.close();
    }

}