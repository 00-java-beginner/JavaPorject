package �ϰ�.day20.��װ��;

import java.util.Scanner;

public class A05_IntegerDemo5 {
    public static void main(String[] args) {
        //����¼��
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        /* String str = sc.next();
        System.out.println(str);*/
        //�׶�:
        //��������ʹ��next��nextInt��nextDouble�ڽ������ݵ�ʱ�������ո񣬻س����Ʊ����ʱ���ֹͣ��
        //����¼�����123 123 ��ô��ʱֻ�ܽ��յ��ո�ǰ�������
        //����Ҫ���ǽ���һ��������
        //Լ��:
        //�Ժ����������Ҫ����¼�룬����ʲô���ͣ�ͳһʹ��nextLine
        //�ص�:�����س���ֹͣ
        String line = sc.nextLine();
        System.out.println(line);
        double v = Double.parseDouble(line);
        System.out.println(v);
    }
}
