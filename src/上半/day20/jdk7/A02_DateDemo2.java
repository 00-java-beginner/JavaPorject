package �ϰ�.day20.jdk7;

import java.util.Date;
import java.util.Random;

public class A02_DateDemo2 {
    public static void main(String[] args) {
        /*
        ����1:��ӡʱ��ԭ�㿪ʼһ��֮���ʱ��
        ����2:������������Date���󣬱Ƚ�һ���ĸ�ʱ����ǰ���ĸ�ʱ���ں�
        */


        //����2:������������Date���󣬱Ƚ�һ���ĸ�ʱ����ǰ���ĸ�ʱ���ں�


        Random r = new Random();

        //��������ʱ�����
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();

        if (time1 > time2) {
            System.out.println("��һ��ʱ���ں��棬�ڶ���ʱ����ǰ��");
        } else if (time1 < time2) {
            System.out.println("�ڶ���ʱ���ں��棬��һ��ʱ����ǰ��");
        } else {
            System.out.println("��ʾ����ʱ��һ��");
        }


    }

    private static void method() {
        //����1:��ӡʱ��ԭ�㿪ʼһ��֮���ʱ��
        //1.����һ�����󣬱�ʾʱ��ԭ��
        Date d1 = new Date(0L);

        //2.��ȡd1ʱ��ĺ���ֵ
        long time = d1.getTime();

        //3.���������������Ҫ��һ��ĺ���ֵ����
        time = time + 1000L * 60 * 60 * 24 * 365;
        //4.�Ѽ���֮���ʱ�����ֵ�������û�d1����
        d1.setTime(time);
        //5.��ӡd1
        System.out.println(d1);
    }
}
