package �ϰ�.day20.jdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04_SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*
            ���裬������ĳ���������Ϊ:2000-11-11
            �����ַ�����ʾ������ݣ�������ת��Ϊ:2000��11��11��

            ����һ��Date�����ʾ2000��11��11��
            ����һ��SimpleDateFormat���󣬲������ʽΪ�����հ�ʱ����:2000��11��11��
        */

        //1.����ͨ��2000-11-11���н�����������һ��Date����
        String str = "2000-11-11";
        //2.����
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        //3.��ʽ��
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��");
        String result = sdf2.format(date);
        System.out.println(result);
    }
}
