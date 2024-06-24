package �ϰ�.day20.jdk8;

import java.time.Duration;
import java.time.LocalDateTime;

public class A09_DurationDemo {
    public static void main(String[] args) {
        // ��������ʱ�����
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // ����������ʱ�����
        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today);//�ڶ�����������һ������
        System.out.println("����ʱ��������:" + duration);

        System.out.println("============================================");
        System.out.println(duration.toDays());//����ʱ��������
        System.out.println(duration.toHours());//����ʱ����Сʱ��
        System.out.println(duration.toMinutes());//����ʱ���ķ�����
        System.out.println(duration.toMillis());//����ʱ���ĺ�����
        System.out.println(duration.toNanos());//����ʱ����������
    }
}
