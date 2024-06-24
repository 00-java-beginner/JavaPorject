package �ϰ�.day20.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A07_LocalDateTimeDemo {
    public static void main(String[] args) {
        // ��ǰʱ��ĵ���������(����������ʱ����)
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println("������:" + nowDateTime);//�����ǣ�
        System.out.println(nowDateTime.getYear());//��
        System.out.println(nowDateTime.getMonthValue());//��
        System.out.println(nowDateTime.getDayOfMonth());//��
        System.out.println(nowDateTime.getHour());//ʱ
        System.out.println(nowDateTime.getMinute());//��
        System.out.println(nowDateTime.getSecond());//��
        System.out.println(nowDateTime.getNano());//����
        // ��:����ĵڼ���
        System.out.println("dayofYear:" + nowDateTime.getDayOfYear());
        //����
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
        //�·�
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getMonth().getValue());

        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
         System.out.println(lt.getSecond());
    }
}
