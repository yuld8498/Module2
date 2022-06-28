package AutomaticTest.Source;

public class NextDay {
    public static int dayofMonthInYear(int month){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            default:return 28;
        }
    }
    public static int dayOfMonthInLeapYear(int month){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            default:return 29;
        }
    }
    public static Boolean leapYear(int year){
        if (year%4 == 0&& year%100!=0){
            return true;
        } else if (year% 400 == 0) {
            return true;
        }else return false;
    }
    public static String findDay(int day , int month, int year){
        int maxDay;
        int newDay;
        int newMonth;
        int newYear;
            if (leapYear(year)){
                maxDay = dayOfMonthInLeapYear(month);
            }else maxDay = dayofMonthInYear(month);
            if (day>maxDay|| day<1||month<1||month>12||year<1){

                return "input day is not valid.";
            }
            if (day == maxDay){
                newDay = 1;
                month +=1;
            }else {
                newDay = day +1;
            }
            if (month>11){
                newMonth = 1;
                year +=1;
            }else newMonth = month;
            newYear = year ;
         return   "Next day is: "+newDay+"/"+newMonth+"/"+newYear;
        }

}
