package p96andp110_�ַ���;
import java.util.Scanner;
public class p101_�����ַ�����ͳ�Ƹ��� {
    public static void main(String[] args) {
        /*//1.����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //2.�����ַ���
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }*/
        //1.����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.next();
        //2.ͳ�ƴ�Сд�����ֵĸ���
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //3.�����ַ���
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //ע�⣺char���͵ı����ڲ�������ʱ���Զ�����Ϊint���ͣ���ѯascii���
            if (c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if (c >= '0' && c <= '9'){
                numberCount++;
            }
        }
        System.out.println(smallCount);
        System.out.println(bigCount);
        System.out.println(numberCount);

    }
}
