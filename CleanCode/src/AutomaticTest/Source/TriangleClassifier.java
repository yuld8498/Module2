package AutomaticTest.Source;

public class TriangleClassifier {
    public static String TriangleClassifier(double firstSide, double secondSide, double thirSide){
        if (firstSide <secondSide + thirSide && secondSide < firstSide+ thirSide && thirSide<secondSide+firstSide){
            if (firstSide == secondSide && firstSide == thirSide){
                return "tam giác đều";
            }else if (firstSide == secondSide || secondSide == thirSide|| firstSide == thirSide){
                return "tam giác cân";
            }else return "tam giác thường";
        }return "không phải là tam giác";
    }
}
