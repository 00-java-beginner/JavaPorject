package �ϰ�.day20.jdk8;

import java.time.LocalDate;
import java.time.Period;

public class A08_PeriodDemo {
    public static void main(String[] args) {
        // ��ǰ���� ������
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // ���յ� ������
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        System.out.println(birthDate);

        Period period = Period.between(birthDate, today);//�ڶ�����������һ������

        System.out.println("����ʱ��������:" + period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());
    }
}
