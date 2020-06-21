package com.example;

import java.util.Scanner;

/* 2020년 1월달력
        System.out.println("   ****2020-01****");
        System.out.println(" 일 월 화  수  목 금 토");
        System.out.println(" ---------------------");
        System.out.println(" -  -  -  1  2  3  4");
        System.out.println(" 5  6  7  8  9  10 11");
        System.out.println(" 12 13 14 15 16 17 18");
        System.out.println(" 19 20 21 22 23 24 25");
        System.out.println(" 26 27 28 29 30 31");
 */
/*
 * 월을 입력하면 해당월의 달력을 출력한다.
 * 달력의 모양은 1단계에서 작성한 모양으로 만든다.
 * 2020년 1월 모델을 예시로 만든다.
 * -1을 입력받기 전까지 반복입력을 받는다.
 * 프롬프트를 출력한다.
 * */

public class java_calendar_5 {

    public void printCalendar_sample(int year, int month, int weekday) {
        System.out.println("  **** " + year + "년 " + month + "월 ****");
        System.out.println("  일 월 화  수  목 금 토");
        System.out.println("  --------------------");

        //첫번째 줄에서 달력을 프린트 했을때 빈 공간
        for (int i = 0; i < weekday; i++) {
            System.out.print("   ");
        }

        int maxDay = dayMethod(year, month);//해당 월의 최대 일수

        //첫번재 줄에서 달력을 프린트 했을때 숫자가 시작되는 부분
        int count = 7 - weekday;
        int delim = (count < 7) ? count : 0;
        // if(count<7){
        // delim = count ;
        // }else {
        // delim =0;
        // }
        for (int i = 1; i <= count; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        //두번째줄 ~


        for (int i = count + 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == delim) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(" --------------------");


    }

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public int dayMethod(int year, int month) { // 각 월이 몇일까지 있는지
        if (isLeapYear(year)) {
            return LEAP_MAX_DAYS[month - 1];
        } else {
            return MAX_DAYS[month - 1];
        }
    }


}
/* 2020년 1월달력
        System.out.println(" ******2020-01******");
        System.out.println(" 일 월 화  수  목 금 토");
        System.out.println(" ---------------------");
        System.out.println(" -  -  -  1  2  3  4");
        System.out.println(" 5  6  7  8  9  10 11");
        System.out.println(" 12 13 14 15 16 17 18");
        System.out.println(" 19 20 21 22 23 24 25");
        System.out.println(" 26 27 28 29 30 31");
 */