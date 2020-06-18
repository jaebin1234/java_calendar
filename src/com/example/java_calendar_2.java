package com.example;

import java.util.Calendar;
import java.util.Scanner;

public class java_calendar_2 {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int day;

    public int dayMethod_2(int n) {

        if (n == 1) {
            day = 31;
        } else if (n == 2) {
            day = 28;
        } else if (n == 3) {
            day = 31;
        } else if (n == 4) {
            day = 30;
        } else if (n == 5) {
            day = 31;
        } else if (n == 6) {
            day = 30;
        } else if (n == 7) {
            day = 31;
        } else if (n == 8) {
            day = 31;
        } else if (n == 9) {
            day = 30;
        } else if (n == 10) {
            day = 31;
        } else if (n == 11) {
            day = 30;
        } else if (n == 12) {
            day = 31;
        }
        return day;
    }

    public int dayMethod_3(int n) {
        switch (n) {
            case 2:
                day = 28;
            case 4:
                day = 30;
            case 6:
                day = 30;
            case 9:
                day = 30;
            case 11:
                day = 30;
            default:
                day = 31;
        }
        return day;
    }


    public int dayMethod(int n) {
        return MAX_DAYS[n - 1];
    }

    public void printSampleCalendar() {
        System.out.println(" 일 월 화  수  목 금 토");
        System.out.println(" ---------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9  10 11 12 13 14");
        System.out.println(" 15 16 17 18 19 20 21");
        System.out.println(" 22 23 24 25 26 27 28");
        System.out.println(" 29 30 31");

        return;
    }

    public static void main(String[] args) {

        java_calendar_2 cal = new java_calendar_2();
        cal.printSampleCalendar();

        Scanner sc = new Scanner(System.in);

        System.out.println("월을 입력하시오:");
        int n = sc.nextInt();


        System.out.println(n + "월은 " + cal.dayMethod(n) + "일까지 있습니다.");
        System.out.println(n + "월은 " + cal.dayMethod_2(n) + "일까지 있습니다.");
        System.out.println(n + "월은 " + cal.dayMethod_3(n) + "일까지 있습니다.");
    }
}
