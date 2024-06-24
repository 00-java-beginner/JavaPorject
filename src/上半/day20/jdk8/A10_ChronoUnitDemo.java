package �ϰ�.day20.jdk8;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class A10_ChronoUnitDemo {
    public static void main(String[] args) {
        // ��ǰʱ��
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        // ����ʱ��
        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1,
                0, 0, 0);
        System.out.println(birthDate);

        System.out.println("��������:" + ChronoUnit.YEARS.between(birthDate, today));
        System.out.println("��������:" + ChronoUnit.MONTHS.between(birthDate, today));
        System.out.println("��������:" + ChronoUnit.WEEKS.between(birthDate, today));
        System.out.println("��������:" + ChronoUnit.DAYS.between(birthDate, today));
        System.out.println("����ʱ��:" + ChronoUnit.HOURS.between(birthDate, today));
        System.out.println("���ķ���:" + ChronoUnit.MINUTES.between(birthDate, today));
        System.out.println("��������:" + ChronoUnit.SECONDS.between(birthDate, today));
        System.out.println("���ĺ�����:" + ChronoUnit.MILLIS.between(birthDate, today));
        System.out.println("����΢����:" + ChronoUnit.MICROS.between(birthDate, today));
        System.out.println("����������:" + ChronoUnit.NANOS.between(birthDate, today));
        System.out.println("���İ�����:" + ChronoUnit.HALF_DAYS.between(birthDate, today));
        System.out.println("����ʮ����:" + ChronoUnit.DECADES.between(birthDate, today));
        System.out.println("��������(����)��:" + ChronoUnit.CENTURIES.between(birthDate, today));
        System.out.println("����ǧ����:" + ChronoUnit.MILLENNIA.between(birthDate, today));
        System.out.println("���ļ�Ԫ��:" + ChronoUnit.ERAS.between(birthDate, today));
    }
}
