package �ϰ�.day18_day19.seven_biginteger;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*
            public BigInteger add(BigInteger val) �ӷ�
            public BigInteger subtract(BigInteger val) ����
            public BigInteger multiply(BigInteger val) �˷�
            public BigInteger divide(BigInteger val) ��������ȡ��
            public BigInteger[] divideAndRemainder(BigInteger val) ��������ȡ�̺�����
            public boolean equals(Object x) �Ƚ��Ƿ���ͬ
            public BigInteger pow(int exponent) ����
            public BigInteger max/min(BigInteger val) ���ؽϴ�ֵ/��Сֵ
            public int intValue(BigInteger val) תΪint����������������Χ��������
        */

        //1.��������BigInteger����
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.�ӷ�
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //3.��������ȡ�̺�����
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //4.�Ƚ��Ƿ���ͬ
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //5.����
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        //6.max
        BigInteger bd5 = bd1.max(bd2);


        //7.תΪint����������������Χ��������
        /* BigInteger bd6 = BigInteger.valueOf(2147483647L);
         int i = bd6.intValue();
         System.out.println(i);
         */

        BigInteger bd6 = BigInteger.valueOf(200);
        double v = bd6.doubleValue();
        System.out.println(v);//200.0
    }
}
