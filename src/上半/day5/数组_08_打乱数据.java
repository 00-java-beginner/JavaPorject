package �ϰ�.day5;

import java.util.Random;

public class ����_08_�������� {
    public static void main(String[] args) {
        /*
        ���󣺶���һ�����飬���������˳��
        �ѵ㣺��λ�ȡ�������
            ����������������л�ȡ
         */
        //1.����һ������
        int arr[] = {1, 2, 3, 4, 5};

        //2.���������
        Random r = new Random();

        //3.ѭ����������
        for (int i = 0; i < arr.length; i++) {
            //��ȡһ���������,��ֵ������ı���
            int randomindex = r.nextInt(arr.length);
            //����һ����ʱ������¼������ֵ
            int temp = arr[i];
            //�������ݽ���
            arr[i] = arr[randomindex];
            arr[randomindex] = temp;
        }
        //ѭ��������������飬��֤���
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
