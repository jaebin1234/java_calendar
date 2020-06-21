package com.example;

import java.util.Scanner;
/*
 * 월을 입력하면 해당월의 달력을 출력한다.
 * 달력의 모양은 1단계에서 작성한 모양으로 만든다.
 * 1일은 일요일로 정해도 무방하다.
 * -1을 입력받기 전까지 반복입력을 받는다.
 * 프롬프트를 출력한다.
 * */

public class Prompt {
    public int parseDay(String week) {
        if (week.equals("일요일")) { //문자열 비교는 equals
            return 0;
        } else if (week.equals("월요일")) {
            return 1;
        } else if (week.equals("화요일")) {
            return 2;
        } else if (week.equals("수요일")) {
            return 3;
        } else if (week.equals("목요일")) {
            return 4;
        } else if (week.equals("금요일")) {
            return 5;
        } else if (week.equals("토요일")) {
            return 6;
        } else {
            return 0;
        }
    }

    public void runPrompt() {
        java_calendar_5 cal = new java_calendar_5(); //생성자로 객체 만들기

        Scanner sc = new Scanner(System.in);

        int month = 1;
        int year = 2020;
        int weekday = 0;


        while (true) {
            System.out.println("입력 하고 싶은 년도를 입력 하시오(종료는 -1) : ");
            System.out.print("YEAR> ");
            year = sc.nextInt();
            if (year == -1) {
                break;
            }


            System.out.println("입력 하고 싶은 월을 입력 하시오(종료는 -1) : ");
            System.out.print("MONTH> ");
            month = sc.nextInt();
            if (month == -1) {
                break;// month가 -1이면 이 while문을 빠져나와라.
            }
            if (month > 12 || month < 1) {
                System.out.println("잘못된 입력입니다. 다시 입력해 주세요. ");
                continue; //month가 12이상이면 while문을 다시시작.
            }

            System.out.println("첫째 날의 요일을 입력하세요(일요일,월요일,화요일,수요일,목요일,금요일.토요일) : ");
            String str_weekday = sc.next();
            weekday = parseDay(str_weekday);


            cal.printCalendar_sample(year, month, weekday);//달력
            System.out.println(" " + month + "월은 " + cal.dayMethod(year, month) + "일까지 있습니다.");
            System.out.println();

        }
        System.out.println("달력 프로 그램이 종료 됩니다.");
        sc.close();
    }


    public static void main(String[] args) {
        //셀 실행

        Prompt p = new Prompt();
        p.runPrompt();
    }

}
