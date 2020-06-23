package com.example;

import java.text.ParseException;
import java.util.Scanner;
/*
 * 월을 입력하면 해당월의 달력을 출력한다.
 * 달력의 모양은 1단계에서 작성한 모양으로 만든다.
 * 1일은 일요일로 정해도 무방하다.
 * -1을 입력받기 전까지 반복입력을 받는다.
 * 프롬프트를 출력한다.
 * */

public class Prompt {

    public void printMenu() {
        System.out.println("+------------------------+");
        System.out.println("| 1.일정등록");
        System.out.println("| 2.일정검색");
        System.out.println("| 3.달력보기");
        System.out.println("| h.도움말");
        System.out.println("| q.종료");
        System.out.println("+------------------------+");


    }


    public int parseDay(String week) {
        switch (week) {
            case "일요일":
                return 0;
            case "월요일":
                return 1;
            case "화요일":
                return 2;
            case "수요일":
                return 3;
            case "목요일":
                return 4;
            case "금요일":
                return 5;
            case "토요일":
                return 6;
            default:
                return 0;

        }
    }

    public void runPrompt() throws ParseException {
        printMenu();

        Scanner sc = new Scanner(System.in);
        java_calendar_index cal = new java_calendar_index(); //생성자로 객체 만들기

        boolean isloop = true;
        while (isloop) {
            System.out.println("명령 (1,2,3,h,q) ");

            String cmd = sc.next();

            switch (cmd) {
                case "1": {
                    cmdRegister(sc, cal);
                    break;
                }
                case "2": {
                    cmdSearch(sc, cal);
                    break;
                }
                case "3": {
                    cmdCalendar(sc, cal);
                    break;
                }
                case "h": {
                    printMenu();
                    break;
                }
                case "q": {
                    isloop = false;
                    break;
                }
            }

        }

        System.out.println("달력 프로 그램이 종료 됩니다.");
        sc.close();
    }


    private void cmdRegister(Scanner s, java_calendar_index c) throws ParseException {
        System.out.println("[새 일정등록] ");
        System.out.println("날짜를 입력해주세요.(yyyy-MM-dd)");
        String date = s.next();
        String text = "";
        System.out.println("일정을 입력해 주세요. (문장 끝에 ;을 입력해주세요.)");
        String word;
        while (!(word = s.next()).endsWith(";")) {
            text += word + " ";

        }
        word = word.replace(";", "");
        text += word;
        c.registerPlan(date, text);
    }




    private void cmdSearch(Scanner s, java_calendar_index c) {
        System.out.println("[일정 검색]");
        System.out.println("날짜를 입력해주세요.(yyyy-MM-dd)");
        String date = s.next();
        PlanItem plan = null;
        plan = c.searchPlan(date);
        if(plan != null){
            System.out.println(plan.detail);
        }else {
            System.out.println("일정이 없습니다.");
        }

    }

    private void cmdCalendar(Scanner s, java_calendar_index c) {
        int month = 1;
        int year = 2020;
        System.out.println("입력 하고 싶은 년도를 입력 하시오(종료는 -1) : ");
        System.out.print("YEAR> ");
        year = s.nextInt();


        System.out.println("입력 하고 싶은 월을 입력 하시오(종료는 -1) : ");
        System.out.print("MONTH> ");
        month = s.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("잘못된 입력입니다. 다시 입력해 주세요. ");
            return;
        }

        c.printCalendar_sample(year, month);//달력
        System.out.println(" " + month + "월은 " + c.dayMethod(year, month) + "일까지 있습니다.");
        System.out.println();
    }


    public static void main(String[] args) throws ParseException {
        //셀 실행

        Prompt p = new Prompt();
        p.runPrompt();
    }




}
