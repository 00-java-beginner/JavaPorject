package �ϰ�.day4;

import java.util.Scanner;

public class ѭ�����ж�_05_switch {
    public static void main(String[] args) {

/*     ���ȼ�����ʽ��ֵ�����κ�case�����ֵ���бȽϣ�����ж�Ӧ��ֵ���ͻ�ִ����Ӧ����䣬��ִ�еĹ����� ������break�ͽ�����
       ������е�case�����ֵ�ͱ��ʽ��ֵ����ƥ�䣬�ͻ�ִ��default���������壬Ȼ���������switch���
       ��ʽ˵����
              ���ʽ��ȡֵΪ��byte��short��int��char��ö�٣�string
              case��
                  1.���������Ҫ�����ʽ���бȽϵ�ֵ
                  2.�����ֵֻ�����������������Ǳ���
                  3.������ֵ�������ظ�
       switch (���ʽ){
           case ֵ1:
                �����1;
                break;
           case ֵ2:
                �����2;
                break;
           default:
                �����n+1;
                break;
        }
*/
        //1.���������¼��Ե���
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ե���");
        String noodles = sc.next();

        //2.�����������switch����ƥ��
        switch (noodles) {
            case "��������":
                System.out.println("����������");
                break;
            case "����ţ����":
                System.out.println("�Ժ���ţ����");
                break;
            case "��̳�����":
                System.out.println("����̳�����");
                break;
            default:
                System.out.println("������ţ����");
                break;
        }

        //1.����¼��������ڼ�
        Scanner sc1 = new Scanner(System.in);
        System.out.println("����������ڼ�");
        int week = sc1.nextInt();

        //2.����switch�����ڽ���ƥ��
        switch (week) {
            case 1:
                System.out.println("�ܲ�");
                break;
            case 2:
                System.out.println("��Ӿ");
                break;
            case 3:
                System.out.println("����");
                break;
            case 4:
                System.out.println("���е���");
                break;
            case 5:
                System.out.println("ȭ��");
                break;
            case 6:
                System.out.println("��ɽ");
                break;
            case 7:
                System.out.println("�úó�һ��");
                break;
            default:
                System.out.println("������ȷ������");
                break;

        }
    }
}
