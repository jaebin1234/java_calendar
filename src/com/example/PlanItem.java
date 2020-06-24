package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {
    public Date planDate;
    public String detail;
    public String peoples =null;

    public static Date getDatefromString(String strDate){
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate); //SimpleDateFormat 클래스의 parse() 메소드를 이용하여 문자열 형식의 날짜로부터 Date객체를 생성
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public PlanItem(String date,String detail){
        this.planDate = getDatefromString(date);
        this.detail = detail;
    }
    public Date getDate(){
        return planDate;
    }

    public void addPeople(String name){
        peoples += name + ",";
    }

    public String saveString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String sdate = formatter.format(planDate);

        return planDate.toString() + "," + "\"" +detail+ "\"" + "\n"; //Date 클래스의 년도,날짜정보를 문자열로 바꿔줌.
    }
}
