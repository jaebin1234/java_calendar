package com.example;

import java.util.Scanner;

public class java_calendar {
    public static void main(String[] args) {
        System.out.println(" 일 월 화  수  목 금 토");
        System.out.println(" ---------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9  10 11 12 13 14");
        System.out.println(" 15 16 17 18 19 20 21");
        System.out.println(" 22 23 24 25 26 27 28");
        System.out.println(" 29 30 31");

        Scanner sc = new Scanner(System.in);
        System.out.println("월을 입력하시오:");
        int n = sc.nextInt();


        int[] month = {1, 0, 3, 0, 5, 0, 7, 8, 0, 10, 0, 12};
        int[] month_2 = {0, 0, 0, 4, 0, 6, 0, 0, 9, 0, 11, 0};
        int day = 0;

        for (int i = 0; i < 12; i++) {
            if ((i + 1) == month[i]) {
                day = 31;

            } else if ((i + 1) == month_2[i]) {
                day = 30;

            } else {
                day = 28;

            }
        }
        System.out.println(n + "월은 " + day + "일까지 있습니다.");
    }
}
