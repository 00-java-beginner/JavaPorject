package �ϰ�.day20.�ۺ���ϰ;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //jdk7,�ж�ƽ�������
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//�·ݵķ�Χ0-11
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        if (day1 == 29){
            System.out.println("������");
        }else {
            System.out.println("��ƽ��");
        }

        //jdk8
        LocalDate ld1 = LocalDate.of(2000,3,1);
        LocalDate ld2 = ld1.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        if (day2 == 29){
            System.out.println("������");
        }else {
            System.out.println("��ƽ��");
        }
        //ֱ�ӿ����ж�ƽ����
        System.out.println(ld1.isLeapYear());

    }
}
