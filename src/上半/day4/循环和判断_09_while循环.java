package �ϰ�.day4;

import java.util.Scanner;

public class ѭ�����ж�_09_whileѭ�� {
    public static void main(String[] args) {
        /* forѭ����whileѭ������ͬ�㣺���й�����һ����
           ����
            1.forѭ���У�֪��ѭ����������ѭ���ķ�Χ
            2.whileѭ������֪��ѭ���Ĵ����ͷ�Χ��ֻ֪��ѭ���Ľ�������

        */
//        int i = 1;
//        while (i < 100){
//            i++;
//        }
//        System.out.println(i);

        //���=884430���ף�ֽ�ź��Ϊ0.1���ף�������Ҫ�۵����ٴ�
        //1.����һ��������¼�߶�
//        double a = 8844430;
//        //2.����һ��������¼ֽ�ŵĳ�ʼ���
//        double b = 0.1;
//        //��¼�۵��Ĵ���
//        int count = 0;
//        //3.ѭ���۵���ֻҪС�ھͼ���
//        while (b < a){
//            b = b * 2;
//            count++;
//        }
//        System.out.println(count);

        //���󣺼���¼��һ���������ж��Ƿ�Ϊ������
        //1.����¼��һ������
//        Scanner sc = new Scanner(System.in);
//        System.out.println("������һ������");
//        int x = sc.nextInt();
//        //����һ����ʱ������¼x��ԭʼֵ�����������бȽ�
//        int temp = x;
//        //��¼��������Ľ��
//        int num = 0;
//        //2.����ѭ����¼�����������
//        while (x != 0){
//            //���������ȡÿһλ����
//            int ge = x % 10;
//            //����һ��������¼,ѭ������һ��/10 ���õõ��Ľ������ȡģ
//            x = x / 10;
//            //�ѵ�ǰ��ȡ������ƴ�ӵ����ұ�
//            //����num��ge�����Ͷ���int  ����������ִ�е��Ǽӷ�������
//            //����ȡ������*10ʵ��λ�õĿ�Խ����ȡ��һλ�����ڸ�λ��0���������ƴ��
//            num = num * 10 + ge;
//        }
//        System.out.println(num == temp);

        //���󣺼���¼�������������õ����ǵ��̺�����
        //1.����¼������������¼�������ͳ���
        Scanner sc = new Scanner(System.in);
        System.out.println("�����뱻����");
        int dividend = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("���������");
        int divisor = sc1.nextInt();

        //����һ��������¼һ�����˶��ٴ�
        int count = 0;
        //2.���ñ�����-��������ѭ��
        while (dividend >= divisor) {
            //�����Ľ�����¸�ֵ��������
            dividend = dividend - divisor;
            //ֻҪÿ��һ�ξ�����һ��
            count++;
        }
        System.out.println("����Ϊ��" + dividend);
        System.out.println("��Ϊ��" + count);
    }
}
