package �ϰ�.day7;

import java.util.Scanner;

public class �ۺ���ϰ_��ɻ�Ʊ {
    public static void main(String[] args) {
        //����:��Ʊ�۸��յ���������ͷ�Ȳպ;��ò��շѡ������Ʊԭ�ۣ��·ݺ�ͷ�Ȳջ򾭼òա�
        //�������¹�������Ʊ�۸�:����(5-10��)ͷ�Ȳ�9�ۣ����ò�8.5�ۣ�����(11�µ�����4��)ͷ�Ȳ�7�ۣ����ò�6.5�ۡ�
        //1.����¼����Ҫ����Ĳ���
        Scanner sc = new Scanner(System.in);
        System.out.println("�������Ʊ��ԭ��");
        int ticket = sc.nextInt();
        System.out.println("�����뵱ǰ���·�");
        int mouth = sc.nextInt();
        System.out.println("����������ʲô�� 0��ͷ�Ȳգ�1�����ò�");
        int seat = sc.nextInt();

        //2.�ж����������ǵ���
        if (mouth >= 5 && mouth <= 10) {
            //����ͷ�Ȳ�9�ۣ����ò�8.5��
            ticket = getprice(ticket, seat, 0.9, 0.85);
        } else if ((mouth >= 1 && mouth <= 4) || (mouth == 11 && mouth == 12)) {
            //����ͷ�Ȳ�7�ۣ����ò�6.5��
            ticket = getprice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("����¼����·ݲ��Ϸ�");
        }
        System.out.println(ticket);
    }

    public static int getprice(int ticket, int seat, double v0, double v1) {
        //3.�ж���ʲô��
        if (seat == 0) {
            System.out.println("��ǰΪ����ͷ�Ȳգ�������");
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            System.out.println("��ǰΪ�������òգ���6.5��");
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("û�������λ");
        }
        return ticket;
    }
}