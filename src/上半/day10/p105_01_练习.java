package �ϰ�.day10;

import java.util.Scanner;

public class p105_01_��ϰ {
    public static void main(String[] args) {
        //ʹ��StringBuilder�ĳ���
        //1.�ַ�����ƴ��
        //2.�ַ����ķ�ת

        //1.����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.next();

        //2.��ת����¼����ַ���
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.reverse();

        //������ʽ�����д
        String result = new StringBuilder().append(str).reverse().toString();

        //3.�Ƚ�
        if (str.equals(result)){
            System.out.println("��ǰ�ַ����ǶԳƵ�");
        }else {
            System.out.println("��ǰ�ַ������ǶԳƵ�");
        }
    }
}
