package �ϰ�.day10;
import java.util.Random;
import java.util.Scanner;
public class p110_test1 {
    public static void main(String[] args) {
        //����¼��һ���ַ�����������˳��
        //1.����¼��
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.next();
        //2.���ַ���ת��Ϊ�ַ�����
        char[] strArr = str.toCharArray();
        //3.���ַ��������˳��
        //���������������������λ��
        Random r = new Random();
        for (int i = 0; i < strArr.length; i++) {
            //��ȡ�������
            int number = r.nextInt(strArr.length);
            //����һ����ʱ������¼δ����ǰ��ֵ
            char temp = strArr[i];
            //����˳��
            strArr[i] = strArr[number];
            strArr[number] = temp;
        }
        String result = new String(strArr);
        System.out.println(result);
    }
}
