package �ϰ�.day18_day19.eight_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        /*
            public BigDecimal add(BigDecimal val) �ӷ�
            public BigDecimal subtract(BigDecimal val) ����
            public BigDecimal multiply(BigDecimal val) �˷�
            public BigDecimal divide(BigDecimal val) ����
            public BigDecimal divide(BigDecimal val����ȷ��λ������ģʽ)����
        */
        //1.�ӷ�
        BigDecimal bd1 = BigDecimal.valueOf(10.);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //2.����
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //3.�˷�
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);//20.00

        //4.����
        BigDecimal bd6 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(bd6);//3.33
    }
}
