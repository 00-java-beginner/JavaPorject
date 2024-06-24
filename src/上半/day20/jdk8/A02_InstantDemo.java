package �ϰ�.day20.jdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        /*
            static Instant now() ��ȡ��ǰʱ���Instant����(��׼ʱ��)
            static Instant ofXxxx(long epochMilli) ����(��/����/����)��ȡInstant����
            ZonedDateTime atZone(ZoneIdzone) ָ��ʱ��
            boolean isxxx(Instant otherInstant) �ж�ϵ�еķ���
            Instant minusXxx(long millisToSubtract) ����ʱ��ϵ�еķ���
            Instant plusXxx(long millisToSubtract) ����ʱ��ϵ�еķ���
        */
        //1.��ȡ��ǰʱ���Instant����(��׼ʱ��)
        Instant now = Instant.now();
        System.out.println(now);

        //2.����(��/����/����)��ȡInstant����
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);//1970-01-01T00:00:00z

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);//1970-01-01T00:00:01Z

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);//1970-01-01T00:00:027

        //3. ָ��ʱ��
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);


        //4.isXxx �ж�
        Instant instant4=Instant.ofEpochMilli(0L);
        Instant instant5 =Instant.ofEpochMilli(1000L);

        //5.����ʱ����ж�
        //isBefore:�жϵ����ߴ����ʱ���Ƿ��ڲ�����ʾʱ���ǰ��
        boolean result1=instant4.isBefore(instant5);
        System.out.println(result1);//true

        //isAfter:�жϵ����ߴ����ʱ���Ƿ��ڲ�����ʾʱ��ĺ���
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false

        //6.Instant minusXxx(long millisToSubtract) ����ʱ��ϵ�еķ���
        Instant instant6 =Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        Instant instant7 =instant6.minusSeconds(1);
        System.out.println(instant7);//1970-01-01T00:00:02Z






    }
}
