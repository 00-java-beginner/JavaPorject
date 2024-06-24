package �ϰ�.day20.�ۺ���ϰ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //1.��jdk7�������������һ��������
        String birthday = "2000��6��30��";
        //�����ַ���
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
        //��ȡ����ֵ
        Date data = sdf.parse(birthday);
        //����ȡ���ĺ���ֵ��ֵ��������������
        long birthdayTime = data.getTime();
        //��ȡ��ǰʱ��ĺ���ֵ
        long todayTime = System.currentTimeMillis();
        //�����������ֵ�Ĳ�ֵ
        long time = todayTime - birthdayTime;
        System.out.println(time / 3600 / 24 / 1000);

        //2.jdk8
        LocalDate ld1 = LocalDate.of(2000,6,30);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }
}
