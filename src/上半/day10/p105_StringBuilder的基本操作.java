package �ϰ�.day10;

public class p105_StringBuilder�Ļ������� {
    public static void main(String[] args) {
        //1.��������
        StringBuilder sb = new StringBuilder("abc");

        //2.���Ԫ��
        sb.append(1);
        sb.append(6.6);
        sb.append(true);

        //3.��ת
        sb.reverse();

        //4.��ȡ����
        int len = sb.length();
        System.out.println(len);

        //5.�ٰ�StringBuilder����ַ���
        String str = sb.toString();
        System.out.println(str);


        System.out.println(sb);
    }
}
