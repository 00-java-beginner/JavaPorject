package �ϰ�.day4;

import java.util.Scanner;

public class ѭ�����ж�_03_�ڶ��ָ�ʽ {
    public static void main(String[] args) {
/*���󣺼���¼��һ����������ʾ���ϵ�Ǯ��
        ������ڵ���100�飬�������������
        ���򣬾ͳԾ���ʵ�ݵ�ɳ��С�ԡ�
*/
        //1.����¼��һ����������ʾ���ϵ�Ǯ
        Scanner sc = new Scanner(System.in);
        System.out.println("�����������ϴ���Ǯ");
        int money = sc.nextInt();

        //2.��Ǯ�����жϣ���ѡһ��
        if (money > 100) {
            System.out.println("ȥ���������");
        } else {
            System.out.println("ȥ��ɳ��С��");
        }

/*�����û��ڳ���ʵ�ʹ�����Ʒ�ܼ�Ϊ:600Ԫ��
        ����¼��һ��������ʾ�û�ʵ��֧����Ǯ��
        ���������ڵ���600����ʾ����ɹ������򸶿�ʧ�ܡ�
*/
        //1.����¼��һ����������ʾ�û�֧����Ǯ
        Scanner sc1 = new Scanner(System.in);
        System.out.println("�����븶��Ľ��");
        int price = sc1.nextInt();

        //2.�Ը�������жϣ���ѡһ��
        if (price >= 600) {
            System.out.println("����ɹ�");
        } else {
            System.out.println("����ʧ��");
        }
/*���󣺼���ĳӰԺ������100��Ʊ��Ʊ�����Ϊ1~100.
        ��������Ʊ������࣬ż��Ʊ�����Ҳࡣ����¼��һ��������ʾ��ӰƱ��Ʊ�š�
        ���ݲ�ͬ�����������ͬ����ʾ:
            ���Ʊ��Ϊ��������ô��ӡ��������Ʊ��Ϊż������ô��ӡ���ұߡ�
*/
        //1.����¼���ӰƱ��Ʊ��
        Scanner sc2 = new Scanner(System.in);
        System.out.println("���������Ʊ��");
        int number = sc2.nextInt();
        //ֻ��number��0-100֮�䣬������ʵ��Ʊ��
        if (number >= 0 && number <= 100) {
            if (number % 2 == 1) {
                System.out.println("Ʊ��Ϊ�����������");
            } else {
                System.out.println("Ʊ��Ϊż�������ұ�");
            }
        } else {
            System.out.println("��������ȷ��Ʊ��");
        }
        //2.�ж�Ʊ������������ż��

    }
}
