package �ϰ�.day3;

import java.util.Scanner;

public class �������� {
    public static void main(String[] args) {
        //��������  sc�Ǳ������Ըı�  ���಻����ı�
        Scanner sc = new Scanner(System.in);

        //��������  i�Ǳ������Ըı�  ���಻����ı�
        int i = sc.nextInt();

        //�������
        System.out.println("���Ϊ" + i);

        System.out.println("�������һ�����е����");
        int height1 = sc.nextInt();

        System.out.println("������ڶ������е����");
        int height2 = sc.nextInt();

        System.out.println("��������������е����");
        int height3 = sc.nextInt();

        int max1 = height1 > height2 ? height1 : height2;
        int max2 = max1 > height3 ? max1 : height3;
        System.out.println("��ߵĺ���Ϊ" + max2);
    }
}
