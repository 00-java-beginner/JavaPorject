package �ϰ�.day4;

import java.util.Scanner;

public class ѭ�����ж�_07_08_forѭ�� {
    public static void main(String[] args) {
        //��ʽ��for(int i = 1; i <= 10;i++){}
        //���д����100.fori
        //��ʼ�����ִֻ��һ�Σ��ж����Ϊtrue��ѭ��������false��ѭ������
        //��ӡ���helloworld
//        for(int i = 1; i <=5; i++){
//            System.out.println("Hello World");
//        }
//
//        //������� 1.��ӡ1-5
//        for(int a = 1; a <=5; a++){
//            System.out.println(a);
//        }
//
//        //������� 1.��ӡ5-1
//        for(int b = 5; b >= 1; b--){
//            System.out.println(b);
//        }

        //���  ��͵ı������ܶ�����ѭ�����棬��Ϊֻ������������������Ч
        //���������ѭ�����棬��ô����ֻ�ڱ���ѭ������Ч
        //������ѭ������֮�󣬱����ͻ���ڴ�����ʧ���ڶ���ѭ����ʼ��ʱ���ֻ����¶���һ���µı���
        //д�ۼ���͵ı��������԰ѱ���������ѭ��������
//        int num = 0;
//        for(int a = 1; a <=5; a++){
//            num = num + a;
//        }
//        System.out.println(num);

        //��1-100֮���ż����
        //1.��ȡ1-100֮���ÿ����
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            //2.�ۼ���ͣ����жϣ�����ͣ�
//            if(i % 2 == 0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

        //ͳ����������������
        //����¼���������֣���ʾһ����Χ��
        //ͳ�Ƽ��ܱ�3���������ܱ�5�����������ж��ٸ�
        //1.����¼����������
        Scanner sc = new Scanner(System.in);
        System.out.println("¼��һ�����ֱ�ʾ��Χ�Ŀ�ʼ");
        int start = sc.nextInt();
        System.out.println("¼��һ�����ֱ�ʾ��Χ�Ľ���");
        int end = sc.nextInt();

        //ͳ�Ʊ���
        int conut = 0;
        //2.����ѭ����ȡ�����Χ�е�ÿһ������
        //��ʼ������start  ����������end
        for (int i = start; i <= end; i++) {
            //3.��ÿһ�����ֽ����жϣ�ͳ���ж��ٸ�����Ҫ�������
            if (i % 3 == 0 && i % 5 == 0) {
                conut++;
            }
        }
        System.out.println(conut);


    }
}
