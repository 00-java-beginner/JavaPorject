package �ϰ�.day5;

import java.util.Scanner;

public class ѭ���߼��ۺ���ϰ_03_ƽ���� {
    public static void main(String[] args) {
        //���󣺼���¼��һ���������õ�����ƽ�����������С����ȡ������λ
        //1.����¼��һ������
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        int number = sc.nextInt();

        //2.��1��ʼѭ���жϣ������С��number�ͼ�����������ڵ��ھͽ���
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(i + "����" + number + "��ƽ����");
                break;
            } else if (i * i > number) {
                System.out.println((i - 1) + "����" + number + "ƽ��������������");
                break;
            }
        }
    }
}
