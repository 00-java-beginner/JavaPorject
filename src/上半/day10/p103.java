package �ϰ�.day10;
import java.util.Scanner;
public class p103 {
    public static void main(String[] args) {
        //1.����¼��һ�����
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("��������");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("����Ľ����Ч������������");
            }
        }
        //2.�õ�money�����ÿһλ����
        //����һ��������ʾǮ�Ĵ�д
        String moneystr = "";
        while (true) {
            //���������ȡ����
            int ge = money % 10;
            //���÷�����ת����Ľ���д��ֵ��һ���µ��ַ���
            String capitalNumber = getCapitalNumber(ge);
            //��ת��֮��Ĵ�дƴ�ӵ�moneystr��
            //ע�⣺����ȡ�����Ǵ����������Խ���ƴ�ӵ�ʱ����Ҫ�������ң�����ᱨ��
            moneystr = capitalNumber + moneystr;
            //ȥ���ոջ�ȡ������
            money = money / 10;
            //��moneyΪ0ʱ�����Ѿ���ȡ��ȫ�������ݣ���ʱѭ������
            if (money == 0) {
                break;
            }
        }
        //3.��ǰ�油0��������λ
        int count = 7 - moneystr.length();
        for (int i = 0; i < count; i++) {
            moneystr = "��" + moneystr;
        }
        //4.���뵥λ������һ�������ʾ��λ
        String[] arr = {"��", "ʰ", "��", "Ǫ", "��", "ʰ", "Ԫ"};

        String result = "";
        //5.�õ�moneystr�����Ԫ���ڸ�arr����ƴ��
        //�������ﵥλ�����ĵ����鳤����һ�µģ����Կ�����һ������
        for (int i = 0; i < moneystr.length(); i++) {
            char c = moneystr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    //����һ�������������ֱ�ɴ�д������
    //˼���ǽ��βε���������Ȼ����������ȡ�������ж�Ӧ���ַ���
    public static String getCapitalNumber(int number) {
        //��Ӧ���飬�����ֺ����Ĳ���һ����ϵ
        String[] arr = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
        //���ؽ��
        return arr[number];
    }
}
