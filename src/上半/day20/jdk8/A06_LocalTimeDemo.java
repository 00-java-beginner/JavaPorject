package �ϰ�.day20.jdk8;

import java.time.LocalTime;

public class A06_LocalTimeDemo {
    public static void main(String[] args) {
        // ��ȡ����ʱ�����������(���� ʱ����)
        LocalTime nowTime = LocalTime.now();
        System.out.println("�����ʱ��:" + nowTime);

        int hour = nowTime.getHour();//ʱ
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();//��
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();//��
        System.out.println("second:" + second);

        int nano = nowTime.getNano();//����
        System.out.println("nano:" + nano);
        System.out.println("------------------------------------");
        System.out.println(LocalTime.of(8, 20));//ʱ��
        System.out.println(LocalTime.of(8, 20, 30));//ʱ����
        System.out.println(LocalTime.of(8, 20, 30, 150));//ʱ��������
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

        //isϵ�еķ���
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

        //withϵ�еķ�����ֻ���޸�ʱ���֡���
        System.out.println(nowTime.withHour(10));

        //plusϵ�еķ�����ֻ���޸�ʱ���֡���
        System.out.println(nowTime.plusHours(10));




    }
}
