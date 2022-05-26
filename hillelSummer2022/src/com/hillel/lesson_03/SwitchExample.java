package com.hillel.lesson_03;

public class SwitchExample {
    public static void main(String[] args) {
        int week = 100;

//        System.out.println(day((byte)week));
        System.out.println(dayNumber("MONDAY"));
//        System.out.println(dayNumber(week));
    }

    static String day(byte i) {
        String weekDay = null;
        switch (i) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                weekDay = "Work Day";
                break;
            case 6:
            case 7:
                weekDay = "Weekend";
                break;
            default:
                weekDay = "End off earth ....";
//                break;
        }
        return weekDay;
    }

    static int dayNumber(String day){
      switch (day.toLowerCase()){
            case "понедельник":
            case "monday":
                 return 1;
            case "Sunday":
                 return 2;
            default:
                return 3;
        }
    }
}
