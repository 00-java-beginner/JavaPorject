package �ϰ�.day20.jdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeForMatterDemo {
    public static void main(String[] args) {
        /*
            static DateTimeFormatter ofPattern(��ʽ) ��ȡ��ʽ����
            String format(ʱ�����) ����ָ����ʽ��ʽ��
        */
        //��ȡʱ�����
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        // ����/��ʽ����
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm;ss EE a");
        // ��ʽ��
        System.out.println(dtf1.format(time));
    }
}
