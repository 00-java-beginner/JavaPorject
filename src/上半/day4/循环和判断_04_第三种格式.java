package �ϰ�.day4;

import java.util.Scanner;

public class ѭ�����ж�_04_�����ָ�ʽ {
    public static void main(String[] args) {
        //1.¼�뿼�Եĳɼ�
//        Scanner sc = new Scanner(System.in);
//        System.out.println("��������ĳɼ�");
//        int score = sc.nextInt();
//
//        //2.���ݲ�ͬ�ĳɼ�������ͬ�Ľ�������Ҫ���쳣���ݽ���У�飩
//        if(score >0 && score <= 100 ){
//            if(score >= 95 && score <= 100){
//                System.out.println("����ţ��һ��");
//            }else if(score >= 90 && score < 95){
//                System.out.println("��������һ��");
//            }else if(score >= 85 && score < 90){
//                System.out.println("��������һ��");
//            }else{
//                System.out.println("û����");
//            }
//        }else {
//            System.out.println("����ĳɼ�����ȷ");
//        }


        //������Ʒ�ܼ�Ϊ1000������¼���Ա�ĵȼ����������ʵ��֧����Ǯ
        //һ������ۣ���������ۣ�����������
        //1.���������¼��Ʒ�ļ۸�
        int price = 1000;

        //2.����¼���Ա�ĵȼ�
        Scanner sc1 = new Scanner(System.in);
        System.out.println("�������Ա�ĵȼ�");
        int vip = sc1.nextInt();

        //3.���ݼ���������ʵ��Ҫ֧����Ǯ
        if (vip == 1) {
            System.out.println("ʵ��֧����ǮΪ" + (price * 0.9));
        } else if (vip == 2) {
            System.out.println("ʵ��Ҫ֧����Ǯ" + (price * 0.8));
        } else if (vip == 3) {
            System.out.println("ʵ��Ҫ֧����Ǯ" + (price * 0.7));
        } else {
            System.out.println("ʵ��Ҫ֧����Ǯ" + price);
        }
    }
}
