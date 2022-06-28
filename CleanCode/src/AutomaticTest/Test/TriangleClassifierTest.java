package AutomaticTest.Test;

import AutomaticTest.Source.TriangleClassifier;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TriangleClassifierTest {
    @Test
    @DisplayName("tam giác đều: ")
    public void testTGD(){
        int first = 2;
        int second =2;
        int thir =2;
        String expected = "tam giác đều";
        String result = TriangleClassifier.TriangleClassifier(first,second,thir);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("tam giác cân: ")
    public void testTGC(){
        int first = 2;
        int second =2;
        int thir =3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.TriangleClassifier(first,second,thir);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("tam giác thường: ")
    public void testTGT(){
        int first = 3;
        int second =4;
        int thir =5;
        String expected = "tam giác thường";
        String result = TriangleClassifier.TriangleClassifier(first,second,thir);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("không phải là tam giác: ")
    public void testnotTG(){
        int first = 8;
        int second =2;
        int thir =3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.TriangleClassifier(first,second,thir);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("không phải là tam giác: ")
    public void testnotTG1(){
        int first = -1;
        int second =2;
        int thir =1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.TriangleClassifier(first,second,thir);
        Assert.assertEquals(expected,result);
    }
    @Test
    @DisplayName("không phải là tam giác: ")
    public void testnotTG2(){
        int first = 0;
        int second =1;
        int thir =1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.TriangleClassifier(first,second,thir);
        Assert.assertEquals(expected,result);
    }
}
