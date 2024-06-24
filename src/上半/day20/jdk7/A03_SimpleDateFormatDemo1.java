package �ϰ�.day20.jdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
            public simpleDateFormat() Ĭ�ϸ�ʽ
            public simpleDateFormat(String pattern) ָ����ʽ
            public final string format(Date date) ��ʽ��(���ڶ��� ->�ַ���)
            public Date parse(string source) ����(�ַ��� ->���ڶ���)
        */

        //1.����һ���ַ�����ʾʱ��
        String str = "2023-11-11 11:11:11";
        //2.���ÿղι��촴��simpleDateFormat����
        // ϸ��:
        //��������ĸ�ʽҪ���ַ����ĸ�ʽ��ȫһ��
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        //3.��ӡ���
        System.out.println(date.getTime());//1699672271000


    }

    private static void method1() {
        //1.���ÿղι��촴��simpleDateFormat����Ĭ�ϸ�ʽ
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);//1970/1/1 ����8:00

        //2.���ô��ι��촴��simpleDateFormat����ָ����ʽ
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);//1970��01��01�� 08:00:00

        //������ϰ:yyyy��MM��dd�� ʱ:��:�� ����
    }
}
