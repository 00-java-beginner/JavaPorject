package p96andp110_�ַ���;

public class p99_�ַ����ıȽ� {
    public static void main(String[] args) {
        //1.���������ַ�������
        String s1 = new String("abc");
        String s2 = "Abc";

        //2.==�űȽ�
        System.out.println(s1 == s2);

        //3.�Ƚ϶����е������Ƿ���ͬ
        boolean result = s1.equals(s2);
        System.out.println(result);

        //4.���Դ�Сд�Ƚ�
        boolean result1 = s1.equalsIgnoreCase(s2);
        System.out.println(result1);
    }
}
