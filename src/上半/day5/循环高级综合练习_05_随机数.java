package �ϰ�.day5;

import java.util.Random;
import java.util.Scanner;

public class ѭ���߼��ۺ���ϰ_05_����� {
    public static void main(String[] args) {
        //1.����һ��1-100֮��������
        int conut = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        //2.����������Ƕ���
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("������һ������");
            int number1 = sc.nextInt();

            //3.�ж��������ָ�����ͬ����ʾ
            conut++;
            if (conut == 3) {
                System.out.println("������");
                break;
            }
            if (number < number1) {
                System.out.println("��С��");
            } else if (number > number1) {
                System.out.println("��С��");
            } else {
                System.out.println("������");
                break;
            }

        }
    }
}
