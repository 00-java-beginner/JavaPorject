package �ϰ�.day5;

import java.util.Scanner;

public class ѭ���߼��ۺ���ϰ_04_�ж��Ƿ�Ϊ���� {
    public static void main(String[] args) {
        //���󣺼���¼��һ�����������ж��Ƿ�Ϊһ������
        //1.����¼��һ��������
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��������");
        int number = sc.nextInt();

        //����һ��������ʾ��ǣ����number�Ƿ�Ϊһ������
        boolean flag = true;
        //2.дһ��ѭ������2��ʼ�жϣ��ж��Ƿ�Ϊһ������
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "��һ������");
        } else {
            System.out.println(number + "����һ������");
        }
    }
}
