package �ϰ�.day4;

import java.util.Scanner;

public class ѭ�����ж�_01and02_��һ�ָ�ʽ {
    public static void main(String[] args) {
/*
        ΪʲôҪ��if��䣺��Ϊ�ڳ�������Ҫ�����ж�
        ִ��˳��:
                1.���ȼ����ϵ���ʽ��ֵ
                2.�����ϵ���ʽ��ֵΪtrue��ִ�������
                3.�����ϵ���ʽ��ֵΪfalse�Ͳ�ִ�������
                4.����ִ�к�����������

        if��ע��㣺
                1.�����ŵĿ�ͷ��������һ����д���������д�ڵ�һ�е�ĩβ
                2.��������У����ֻ��һ�д��룬���Բ�д�����š�������ò�Ҫʡ��
                3.�����һ���������͵ı��������жϣ���Ҫ��==�ţ�ֱ�Ӱѱ���д��С�������漴��
                    boolean flag =true;
                    if (flag){
                        System.out.println("flag��ֵΪtrue");
                        }
*/
        //if��ʽ��if����ϵ���ʽ��{
        // �����
        //  }
//����:����¼��Ů��������������� 2 ������˸�����Ӧ����֮����Ӧ
        //1.����¼��Ů���ľ���
//        Scanner sc = new Scanner(System.in);
//        System.out.println("������Ů���ľ���");
//        int wine = sc.nextInt();
//
//        //2.�Ծ��������ж�
//        if (wine > 2) {
//            System.out.println("��������");
//        }

//����������Ե�һ����������ֵ�
        //1.����¼�뿼������
        Scanner sc1 = new Scanner(System.in);
        System.out.println("�������������");
        int ranking = sc1.nextInt();

        //2.�����ν����ж�
        if (ranking == 1) {
            System.out.println("С����Ϊ��С���ĺ��ֵ�");
        }

/*���󣺵�������ʻ��ʱ�������˺��̵ƣ��ͻ�����ж�
        ������������ֹͣ
        ����Ƶ������ͼ���
        ����̵���������ʻ
*/
        //1.��������������ʾ�Ƶ�״̬
        boolean islightGreen = true;
        boolean islightRed = false;
        boolean islightYellow = false;

        //2.�ԵƵ�״̬�����ж�
        if (islightGreen) {
            System.out.println("�̵�ͨ��");
        }

        if (islightRed) {
            System.out.println("���ͣ");
        }

        if (islightYellow) {
            System.out.println("�ƵƼ���");
        }

    }
}
