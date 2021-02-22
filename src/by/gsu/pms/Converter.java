package by.gsu.pms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {
    private int value;
    private int delimiter;
    private int roundValue;



    public  double convert(long value, int delimiter, int roundValue){
        double valueAfterDivide = (double)value / delimiter;
        BigDecimal bd = new BigDecimal(Double.toString(valueAfterDivide));
        bd = bd.setScale(roundValue, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }
}
