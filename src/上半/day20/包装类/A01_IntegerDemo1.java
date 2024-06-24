package �ϰ�.day20.��װ��;

public class A01_IntegerDemo1 {
    public static void main(String[] args) {
        /*
            public Integer(int value) ���ݴ��ݵ���������һ��Integer����
            public Integer(String s) ���ݴ��ݵ��ַ�������һ��Integer����
            public static Integer valueOf(int i) ���ݴ��ݵ���������һ��Integer����
            public static Integer valueof(String s) ���ݴ��ݵ��ַ�������һ��Integer����
            public static Integer valueof(String s, int radix) ���ݴ��ݵ��ַ����ͽ��ƴ���һ��Integer����
        */

        //1.���ù��췽����ȡInteger�Ķ���(JDK5��ǰ�ķ�ʽ)
        /*Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);*/

        //2.���þ�̬������ȡInteger�Ķ���(JDK5��ǰ�ķ�ʽ)
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        //3.�����ַ�ʽ��ȡ���������(����)
        //�ײ�ԭ��
        //��Ϊ��ʵ�ʿ����У�-128~127֮������ݣ��õıȽ϶ࡣ
        //���ÿ��ʹ�ö���new������ô̫�˷��ڴ���
        //���ԣ���ǰ�������Χ֮�ڵ�ÿһ�����ݶ������ö���
        //���Ҫ�õ��˲��ᴴ���µģ����Ƿ����Ѿ������õĶ���
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);//true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);//false

        //��Ϊ������new�ؼ��֣���Java�У�ÿһ��new���Ǵ�����һ���µĶ���
        //�������������������new��������ֵַ��һ����
        /*Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10 == i11);

        Integer i12 = new Integer(128);
        Integer i13 = new Integer(128);
        System.out.println(i12 == i13);*/
    }
}
