package �ϰ�.day4;

import java.util.Scanner;

public class ѭ�����ж�_06_switch��չ {
    public static void main(String[] args) {
        //switch������  JDK12+����  ֻ��һ�е�����¿���ʡ�Դ�����
//        int number = 2;
//        switch (number){
//            case 1 -> System.out.println("һ");
//            case 2 -> System.out.println("��");
//            case 3 -> System.out.println("��");
//            default -> System.out.println("û�����ѡ��");
//        }

        //switch��if�����ָ�ʽ���Ե�ʹ�ó���
        //if�ĵ����ָ�ʽ��һ�����ڶԷ�Χ���ж�
        //switch�������޸�����һһ�оٳ�������������ѡ��һ


        //���󣺼���¼�����ڼ�����������պ���Ϣ��
        //1.����¼�����ڼ�
//        Scanner sc = new Scanner(System.in);
//        System.out.println("������������ڼ�");
//        int week = sc.nextInt();
//        //2.����switch���������ѡ��
//        switch (week){
//            case 1,2,3,4,5 -> System.out.println("������");
//            case 6,7 -> System.out.println("��Ϣ��");
//            default -> System.out.println("û���������");
//        }
        //���󣺲������绰���а���ѡ��
        //1.��Ʊ��ѯ   2.��ƱԤ��  3.��Ʊ��ǩ  4.�˳�����

        //1.����¼��һ������
        Scanner sc1 = new Scanner(System.in);
        System.out.println("���������ѡ��");
        int number1 = sc1.nextInt();
        //2.����ѡ��ִ�в�ͬ�Ĵ����߼�
        switch (number1) {
            case 1 -> System.out.println("��Ʊ��ѯ");
            case 2 -> System.out.println("��ƱԤ��");
            case 3 -> System.out.println("��Ʊ��ǩ");
            case 4 -> System.out.println("�˳�����");
            default -> System.out.println("�˳�����");
        }
    }
}
