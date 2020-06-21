package com.example;

import java.util.Scanner;
/*
* 월을 입력하면 해당월의 달력을 출력한다.
* 달력의 모양은 1단계에서 작성한 모양으로 만든다.
* 2020년 1월 모델을 예시로 만든다.
* -1을 입력받기 전까지 반복입력을 받는다.
* 프롬프트를 출력한다.
* */

public class java_calendar_5 {
    public void printCalendar_sample(){
        System.out.println(" ******2020-01******");
        System.out.println(" 일 월 화  수  목 금 토");
        System.out.println(" --------------------");
        System.out.println(" -  -  -  1  2  3  4");
        System.out.println(" 5  6  7  8  9  10 11");
        System.out.println(" 12 13 14 15 16 17 18");
        System.out.println(" 19 20 21 22 23 24 25");
        System.out.println(" 26 27 28 29 30 31 ");
        System.out.println(" --------------------");

    }
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int dayMethod(int n) {
        return MAX_DAYS[n - 1];
    }

    public static void main(String[] args) {
        java_calendar_5 cal = new java_calendar_5(); //생성자로 객체 만들기

        String PROMPT = "cal> ";

        Scanner sc = new Scanner(System.in);


        int month =1;
        while (true){
            System.out.println("입력 하고 싶은 월을 입력 하시오(종료는 -1) : ");
            System.out.print(PROMPT);
            month = sc.nextInt();

            if(month==-1){
                break;// month가 -1이면 이 while문을 빠져나와라.
            }
            if(month>12){
                System.out.println("월은 12월 까지 있습니다. 다시 입력해 주세요. ");
                continue; //month가 12이상이면 while문을 다시시작.
            }
            if(month>=1 && month <=12) {

                cal.printCalendar_sample();
                System.out.println(" "+month + "월은 " + cal.dayMethod(month) + "일까지 있습니다.");
            }
        }
        System.out.println("달력 프로 그램이 종료 됩니다.");
        sc.close();
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