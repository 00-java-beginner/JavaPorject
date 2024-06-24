package �ϰ�.day20.jdk7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /* ����:
            ��ɱ���ʼʱ��:2023��11��11�� 0:0:0(����ֵ)
            ��ɱ�����ʱ��:2023��11��11�� 0:10:0(����ֵ)

            С���µ��������ʱ��Ϊ:2023��11��11�� 0:01:0
            СƤ�µ��������ʱ��Ϊ:2023��11��11�� 0:11:0
            �ô���˵������λͬѧ��û�вμ�����ɱ�?
         */

        //1.�����ַ�����ʾ����ʱ��
        String startstr = "2023��11��11�� 0:0:0";
        String endstr = "2023��11��11�� 0:10:0";
        String orderstr = "2023��11��11�� 0:01:00";
        String orderstr1 = "2023��11��11�� 0:11:0";
        //2.�������������ʱ�䣬�õ�Date����
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
        Date startDate = sdf.parse(startstr);
        Date endDate = sdf.parse(endstr);
        Date orderDate = sdf.parse(orderstr);
        Date orderDate1 = sdf.parse(orderstr1);

        //3.�õ�����ʱ��ĺ���ֵ
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();
        long orderTime1 = orderDate1.getTime();

      //4.�ж�
        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("�μ���ɱ��ɹ�");
        }else {
            System.out.println("�μ���ɱ�ʧ��");
        }
        
        if (orderTime1 >= startTime && orderTime1 <= endTime) {
          System.out.println("�μ���ɱ��ɹ�");
        }else {
          System.out.println("�μ���ɱ�ʧ��");
        }


    }
}
