package �ϰ�.day20.jdk7;

import java.util.Calendar;
import java.util.Date;

public class A06_CalendarDemo1 {
    public static void main(String[] args) {
        /*
            public static Calendar lgetInstance()               ��ȡ��ǰʱ�����������
            public final Date getTime()                         ��ȡ���ڶ���
            public final setTime(Date date)                     �������������ڶ���
            public long getTimeInMillis()                       �õ�ʱ�����ֵ
            public void setTimeInMillis(long millis)            ����������ʱ�����ֵ
            public int get(int field)                           ��ȡ�����е�ĳ���ֶ���Ϣ
            public void set(int field,int value)                �޸�������ĳ���ֶ���Ϣ
            public void add(int field,int amount)               Ϊĳ���ֶ�����/����ָ����ֵ
        */

        //1.��ȡ��������
        //ϸ��1:Calendar��һ��������,����ֱ��new,����ͨ��һ����̬������ȡ���������
        //�ײ�ԭ��:
        //�����ϵͳ�Ĳ�ͬʱ������ȡ��ͬ����������,Ĭ�ϱ�ʾ��ǰʱ�䡣
        //�ѻ��ʱ���еļ�Ԫ,��,��,��,ʱ,��,��,����,�ȵȵĶ��ŵ�һ�����鵱��
        //�� :��Ԫ
        // 1 :��
        // 2 :��
        // 3 : һ���еĵڼ���
        // 4:һ�����еĵڼ���
        // 5: һ�����еĵڼ���(����)
        // ....

        //ϸ��2:
        //�·�:��Χ0~11 �����ȡ��������.��ôʵ������1�¡�
        //����:�����������,��������һ���еĵ�һ��
        //      1(������) 2(����һ) 3(���ڶ�) 4(������) 5(������) 6(������) 7(������)
        Calendar c = Calendar.getInstance();

        //2.�޸�һ�����������ʱ��
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);

        //puslic int get(int field) ȡ�����е�ĳ���ֶ���Ϣ
        //public void set(int field,int value) �޸�������ĳ���ֶ���Ϣ
        //public void add(int fieldint amount) Ϊĳ���ֶ�����/����ָ����ֵ


        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH, 8);
        c.set(Calendar.DAY_OF_MONTH, 10);


        //���÷������������������һ����
        c.add(Calendar.MONTH, -1);


        //java��Calendar����,��������Ӧ�����ֶ�����ɳ���
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "," + month + "," + date + "," + getWeek(week));
    }

    //���://��:����
    //�����ݸ�����������Ӧ�Ĺ�ϵ
    //�����Ӧ������: 1 ~7//���ض�Ӧ������
    public static String getWeek(int index) {
        //����һ������,�ú������ڼ� ��1~7������Ӧ��ϵ
        String[] arr = {"", "������", "����һ", "���ڶ�", "������", "������", "������", "������"};
        //�����������ض�Ӧ������
        return arr[index];

    }
}
