package �ϰ�.day20.��װ��;

public class A04_IntegerDemo4 {
    public static void main(String[] args) {
        /*
            public static string tobinarystring(int i) �õ�������
            public static string tooctalstring(int i) �õ��˽���
            public static string toHexstring(int i) �õ�ʮ������
            public static int parseInt(string s) ���ַ������͵�����ת��int���͵�����
        */

        //1.������ת�ɶ����ƣ�ʮ������
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);//1100100

        //2.������ת�ɰ˽���
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);//144

        //3.������ת��ʮ������
        String str3 = Integer.toHexString(100);
        System.out.println(str3);//64

        //4.���ַ������͵�����ת��int���͵�����
        //ǿ��������:ÿ��������java�ж��и��Ե���������
        //�ڼ����ʱ���������ͬһ���������ͣ����޷�ֱ�Ӽ���ġ�
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i + 1);//124
        //ϸ��1:
        //������ת����ʱ�������еĲ���ֻ�������ֲ������������������ᱨ��
        //ϸ��2:
        //8�ְ�װ�൱�У�����Character���ж�Ӧ��parseXxx�ķ�������������ת��
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);


    }
}
