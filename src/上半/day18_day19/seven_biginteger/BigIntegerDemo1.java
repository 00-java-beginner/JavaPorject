package �ϰ�.day18_day19.seven_biginteger;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
            public BigInteger(int num, Random rnd) ��ȡ�������������Χ:[0~ 2��num�η�-11
            public BigInteger(String val) ��ȡָ���Ĵ�����
            public BigInteger(String val, int radix) ��ȡָ�����ƵĴ�����

            public static BigInteger valueOf(long val) ��̬������ȡBigInteger�Ķ����ڲ����Ż�

            ϸ��:
            ����һ��������������ݲ��ܷ����ı䡣
        */


        //1.��ȡһ������Ĵ�����
        /* Random r=new Random();
            for (int i = e; i < 100; i++) {
            BigInteger bd1 = new BigInteger(4,r);
            System.out.println(bd1);//[@ ~ 15]}
            }
        */

        //2.��ȡһ��ָ���Ĵ����������Գ���long��ȡֵ��Χ
        //ϸ��:�ַ����б���������������ᱨ��
        /* BigInteger bd2 = new BigInteger("1.1");
            System.out.println(bd2);
        */

        /*
            BigInteger bd3 = new BigInteger("abc");
            System.out.println(bd3);
         */

        //3.��ȡָ�����ƵĴ�����
        //ϸ��:
        //1.�ַ����е����ֱ���������
        //2.�ַ����е����ֱ���Ҫ�������Ǻϡ�
        //����������У���ôֻ��д�պ�1��д�����ľͱ���
        BigInteger bd4 = new BigInteger("123", 2);
        System.out.println(bd4);

        //4.��̬������ȡBigInteger�Ķ����ڲ����Ż�
        //ϸ��:
        //1.�ܱ�ʾ��Χ�Ƚ�С��ֻ����long��ȡֵ��Χ֮�ڣ��������long�ķ�Χ�Ͳ����ˡ�
        //2.���ڲ��Գ��õ�����: -16 ~ 16 �������Ż���
        //  ��ǰ��-16~16 �ȴ�����BigInteger�Ķ��������λ�ȡ�������´����µġ�
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd6);//true


        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);//false


        //5.����һ�������ڲ������ݲ��ܷ����ı�
        BigInteger bd9 =BigInteger.valueOf(1);
        BigInteger bd10 =BigInteger.valueOf(2);
        //��ʱ�������޸Ĳ�������BigInteger�����еĽ裬���ǲ�����һ���µ�BigInteger�����¼
        BigInteger result=bd9.add(bd10);
        System.out.println(result);//3










    }
}
