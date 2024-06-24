package �ϰ�.day18_day19.eight_bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
            ���췽����ȡBigDecimal����
            public BigDecimal(double val) public BigDecimal(string val)

            ��̬������ȡBigDecimal����
            public static BigDecimal valuef(double val)
        */

        //1.ͨ������double���͵�С������������
        //ϸ��:
        //���ַ�ʽ�п����ǲ���ȷ�ģ����Բ�����ʹ��
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        //ͨ�������ַ�����ʾ��С������������
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        //3.ͨ����̬������ȡ����
        //ϸ��:
        //1.���Ҫ��ʾ�����ֲ���û�г���double��ȡֵ��Χ������ʹ�þ�̬����
        //2.���Ҫ��ʾ�����ֱȽϴ󣬳�����double��ȡֵ��Χ������ʹ�ù��췽��
        //3.������Ǵ��ݵ���0~10֮�������������0������10����ô�����᷵���Ѿ������õĶ��󣬲�������new
        BigDecimal bd6 = BigDecimal.valueOf(10.0);
        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        System.out.println(bd6 == bd7);
    }
}
