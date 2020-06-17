package com.example;

import java.util.Scanner;

public class java_calendar_practice {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하시오.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));

        String s1,s2;
        System.out.println("두 수를 입력하시오.");
        s1 = sc.next();
        s2 = sc.next();
        System.out.println("두 문자열은 "+s1+","+s2);
        System.out.println("두 문자열의 합은?"+s1+s2);

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        int c = a + b ;

        System.out.println("두 문자열을 정수형으로 변환한값의 합은?"+(a+b));
        sc.close();// 열었던 입력 주소지 반납?
    }


}
