package p96andp110_�ַ���;
import java.util.Scanner;
public class p100_�û���½ {
    public static void main(String[] args) {
        //ģ���û���½�������δ���Ļ���
        //1.��������������¼��ȷ���û���������
        String rightUserName = "zhangsan";
        String rightPassWord = "123456";

        Scanner sc = new Scanner(System.in);
        //2.����¼���û���������
        for (int i = 0; i < 3; i++) {
            System.out.println("�������û���");
            String username = sc.next();
            System.out.println("����������");
            String password = sc.next();

            //3.�Լ���¼����û�������������ж�
            if (username.equals(rightUserName) && password.equals(rightPassWord)){
                System.out.println("�û���½�ɹ�");
                break;
            }else {
                if (i == 2){
                    System.out.println("�˻�������������ϵ����Ա");
                }else {
                    System.out.println("�û���½ʧ�ܣ��û��������������,��ʣ��"+(2 - i) + "�λ���");
                }

            }
        }


    }
}
