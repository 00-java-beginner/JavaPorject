package p96andp110_�ַ���;
import java.util.Scanner;
import java.util.StringJoiner;
public class p108_�������ֵ�����д�� {
    public static void main(String[] args) {
        //1.����¼��һ���ַ���������С��9��ֻ��������
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            System.out.println("������һ������");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag){
                break;
            }else {
                System.out.println("��ǰ������ַ����Ƿ�������������");
            }
        }
        StringJoiner sb = new StringJoiner("");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changLuoMa(number);
            if (number == str.length()){
                sb.add(s);
            }else {
                sb.add(s).add(",");
            }
        }
        System.out.println(sb);
    }
    //����һ��������¼����ַ�������У��
    public static boolean checkStr(String str){
        if (str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            //��ʾ��ѭ�������ÿһ��Ԫ��ȡ����
            char c = str.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        //ע�⣺ֻ�е�ѭ����������ܷ���true
        return true;
    }
    //����һ���������������������ֲ�����ϵ
    public static String changLuoMa(int number){
        //������������û��0��������Ҫ�����������ֹ�����������Ҫ��0�������һ���յ��ַ���
        String [] arr = {"","��","��","��","��","��","��","��","��","��"};
        return arr[number];
    }
    //����switch����ƥ��
    public static String changLuoMa1(char number){
        String str = switch (number){
          case '0' -> "";
          case '1' -> "��";
          case '2' -> "��";
          case '3' -> "��";
          case '4' -> "��";
          case '5' -> "��";
          case '6' -> "��";
          case '7' -> "��";
          case '8' -> "��";
          case '9' -> "��";
            default -> str = "";
        };
        return str;
    }
}
