package com.example;

import java.util.Scanner;

public class java_calendar_4 {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int dayMethod(int n) {
        return MAX_DAYS[n - 1];
    }

    public static void main(String[] args) {
        java_calendar_4 cal = new java_calendar_4(); //생성자로 객체 만들기

        String PROMPT = "cal> ";

        Scanner sc = new Scanner(System.in);


        int repeat ;

        int month = 1;
        while (true) {
            System.out.println("입력 하고 싶은 월을 입력하시오.(종료는 -1)");
            System.out.print(PROMPT);
            month = sc.nextInt();
            if(month==-1){
                break;// month가 -1이면 이 while문을 빠져나와라.
            }
            if(month>12){
                continue;
            }
            System.out.println(month + "월은 " + cal.dayMethod(month) + " 일까지 있습니다.");

        }
        System.out.println("Bye~");
        sc.close();
    }

}