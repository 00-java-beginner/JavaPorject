package �ϰ�.day20.�ۺ���ϰ;

public class Test2 {
    public static void main(String[] args) {
        /*�Լ�ʵ��parselnt������Ч�������ַ�����ʽ������ת��������Ҫ��:
        �ַ�����ֻ�������ֲ����������ַ�����һλ�����10λ
        0���ܿ�ͷ*/

        //�����ַ���
        String str = "123456";

        if (!str.matches("[1-9]\\d{0,9}")){
            System.out.println("��ʽ����");
        }else {
            System.out.println("��ʽ��ȷ");
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
    }
}
