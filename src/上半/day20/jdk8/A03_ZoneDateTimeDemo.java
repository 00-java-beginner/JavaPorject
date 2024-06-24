package �ϰ�.day20.jdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03_ZoneDateTimeDemo {
    public static void main(String[] args) {
        /*
            static ZonedDateTime now() ��ȡ��ǰʱ���ZonedDateTime����
            static ZonedDateTime ofXxxx(������) ��ȡָ��ʱ���ZonedDateTime����
            ZonedDateTime withXxx(ʱ��) �޸�ʱ��ϵ�еķ���
            ZonedDateTime minusXxx(ʱ��) ����ʱ��ϵ�еķ���
            ZonedDateTime plusXxx(ʱ��) ����ʱ��ϵ�еķ���
         */
        //1.��ȡ��ǰʱ�����(��ʱ��)
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //2.��ȡָ����ʱ�����(��ʱ��)1/������ʱ�������뷽ʽָ��
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        //ͨ��Instant + ʱ���ķ�ʽָ����ȡʱ�����
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);


        //3.withXxx �޸�ʱ��ϵ�еķ���
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);

        //4. ����ʱ��
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

        //5.����ʱ��
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);


    }
}
