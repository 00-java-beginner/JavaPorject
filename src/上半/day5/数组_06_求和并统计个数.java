package �ϰ�.day5;

import java.util.Random;

public class ����_06_��Ͳ�ͳ�Ƹ��� {
    public static void main(String[] args) {

        /*
        ��������ʮ��1-100֮����������������
             1.��������ĺ�
             2.���������ƽ����
             3.ͳ���ж��ٸ���С��ƽ����
         */
        //1.����һ�����飨��̬��ʼ����
        int arr[] = new int[10];

        //2.����ѭ�������������������
        for (int i = 0; i < arr.length; i++) {
            //��ȡ���������������
            Random r = new Random();
            //��ΧΪ1-100 ������Ҫ�ƽ� + 1
            int number = r.nextInt(100) + 1;
            //�����ɵ���������������У���ʽΪ��������[����] = ����
            arr[i] = number;
        }
        //3.��������ĺ�
        //����һ��������������
        int sum = 0;
        //ѭ�����飬�������
        for (int i = 0; i < arr.length; i++) {
            //��ÿһ��ѭ����ֵ����ֵ��sum�����ۼ�
            sum = sum + arr[i];
        }
        System.out.println("����ĺ�Ϊ" + sum);

        //4.���������ƽ����
        //����һ��������������
        double avg = 0;
        //ѭ������õ�����
        for (int i = 0; i < arr.length; i++) {
            //����ƽ��������
            avg = sum / arr.length;
        }
        System.out.println("�����ƽ����Ϊ" + avg);

        //5.ͳ���ж��ٸ���С��ƽ����
        //����һ��������������
        int count = 0;
        //ѭ�����飬�õ������е������
        for (int i = 0; i < arr.length; i++) {
            //�Եõ�������������ж�
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("��ƽ����С��������" + count + "��");

        //6.����������֤��
        for (int i = 0; i < arr.length; i++) {
            //print��ʾ���·���ӡ�Ľ����һ��չʾ
            System.out.print(arr[i] + " ");
        }
    }
}
