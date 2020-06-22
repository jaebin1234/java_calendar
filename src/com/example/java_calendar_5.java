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

    public void printCalendar_sample(int year, int month) {
        System.out.println("  **** " + year + "년 " + month + "월 ****");
        System.out.println("  일 월 화  수  목 금 토");
        System.out.println("  --------------------");

        //위크데이(요일) 자동으로 받기.
        int weekday = getWeekDay(year, month, 1);

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

    private int getWeekDay(int year, int month, int day) {
        int syear = 1970;

        final int STANDARD_WEEKDAY = 4; //1970년 1월 1일이 목요일이기 떄문.

        int count = 0;//1970년 1월1일 부터 하루 씩 카운팅하는 변수 count 초기화.

        for (int i = syear; i < year; i++) {
            int delta = isLeapYear(i) ? 366 : 365; //윤년이면 366일 ,아니면 365일 더함.
            count += delta;
        }


        for (int i = 1; i < month; i++) { //dayMethod 함수 이용해서 달마다의 일수를 더함.
            int delta = dayMethod(year, i);
            count += delta;
        }

        count += day - 1; //마지막으로 그 달의 day를 더함 단,1월 1일은 더할 필요가 없음.

        int weekday = (count + STANDARD_WEEKDAY) % 7; //카운팅한 일로 요일 구하기.

        return weekday;
    }

    //test code
    public static void main(String[] args) {
        java_calendar_5 dua = new java_calendar_5();
        System.out.println(dua.getWeekDay(1970, 1, 1)==3);
        System.out.println(dua.getWeekDay(1970, 2, 1)==6);
        System.out.println(dua.getWeekDay(1971, 1, 1)==4);
        System.out.println(dua.getWeekDay(1972, 1, 1)==5);
        System.out.println(dua.getWeekDay(1973, 1, 1)==0);


    }

    private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public int dayMethod(int year, int month) { // 각 월이 몇일까지 있는지
        if (isLeapYear(year)) {
            return LEAP_MAX_DAYS[month];
        } else {
            return MAX_DAYS[month];
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