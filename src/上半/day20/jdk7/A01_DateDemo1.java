package �ϰ�.day20.jdk7;

import java.util.Date;

public class A01_DateDemo1 {
    public static void main(String[] args) {
        /*
            public Date() ����Date���󣬱�ʾ��ǰʱ��
            public Date(long date) ����Date���󣬱�ʾָ��ʱ��
            public void settime(long time) ����/�޸ĺ���ֵ
            public long gettime() ��ȡʱ�����ĺ���ֵ
        */

        //1.���������ʾһ��ʱ��
        Date d1 = new Date();
        //system.out.println(d1);

        //2.���������ʾһ��ָ����ʱ��
        Date d2 = new Date(0L);
        System.out.println(d2);

        //3.settime �޸�ʱ��
        //1000����=1��
        d2.setTime(1000L);
        System.out.println(d2);

        //4.getTime��ȡ��ǰʱ��ĺ���ֵ
        long time = d2.getTime();
        System.out.println(time);
    }
}
