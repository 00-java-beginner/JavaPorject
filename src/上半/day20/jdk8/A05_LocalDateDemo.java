package �ϰ�.day20.jdk8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class A05_LocalDateDemo {
    public static void main(String[] args) {
        //1.��ȡ��ǰʱ�����������(���� ������)
        LocalDate nowDate = LocalDate.now();
        //System.out.println("���������:" + nowDate);
        //2.��ȡָ����ʱ�����������
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println("ָ������:" + ldDate);

        System.out.println("=============================");

        //3.getϵ�з�����ȡ�����е�ÿһ������ֵ//��ȡ��
        int year = ldDate.getYear();
        System.out.println("year: " + year);
        //��ȡ��//��ʽһ:
        Month m = ldDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());

        //��ʽ��:
        int month = ldDate.getMonthValue();
        System.out.println("month: " + month);


        //��ȡ��
        int day = ldDate.getDayOfMonth();
        System.out.println("day:" + day);

        //��ȡһ��ĵڼ���
        int dayofYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayofYear);

        //��ȡ����
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        //is��ͷ�ķ�����ʾ�ж�
        System.out.println(ldDate.isBefore(ldDate));
        System.out.println(ldDate.isAfter(ldDate));

        //with��ͷ�ķ�����ʾ�޸ģ�ֻ���޸�������
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);

        //minus��ͷ�ķ�����ʾ���٣�ֻ�ܼ���������
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);


        //plus��ͷ�ķ�����ʾ���ӣ�ֻ������������
        LocalDate plusLocalDate = ldDate.plusDays(1);
        System.out.println(plusLocalDate);

        //-------------
        // �жϽ����Ƿ����������
        LocalDate birDate = LocalDate.of(2000, 1, 1);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("���������������? " + birMd.equals(nowMd));//���������������?

    }
}
