package AutomaticTest.Test;

import AutomaticTest.Source.NextDay;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class NextDayTest {
    @Test
    @DisplayName("Testing 1/1/2018")
    public void testNextDay(){
        int day =1;
        int month =1;
        int year = 2018;
        String expected = "Next day is: 2/1/2018";
        String result  = NextDay.findDay(day,month,year);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing 31/1/2018")
    public void testNextDay31(){
        int day =31;
        int month =1;
        int year = 2018;
        String expected = "Next day is: 1/2/2018";
        String result  = NextDay.findDay(day,month,year);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing 30/4/2018")
    public void testNextDay30(){
        int day =30;
        int month =4;
        int year = 2018;
        String expected = "Next day is: 1/5/2018";
        String result  = NextDay.findDay(day,month,year);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing 28/2/2018")
    public void testNextDay28(){
        int day =28;
        int month =2;
        int year = 2018;
        String expected = "Next day is: 1/3/2018";
        String result  = NextDay.findDay(day,month,year);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing 29/2/2018")
    public void testNextDay29(){
        int day =29;
        int month =2;
        int year = 2020;
        String expected = "Next day is: 1/3/2020";
        String result  = NextDay.findDay(day,month,year);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing 31/12/2018")
    public void testNextDay3121(){
        int day =31;
        int month =12;
        int year = 2018;
        String expected = "Next day is: 1/1/2019";
        String result  = NextDay.findDay(day,month,year);
        Assert.assertEquals(expected,result);
    }
}
