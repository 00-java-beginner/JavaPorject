package �ϰ�.day15.p141_p143�ڲ���;

public class p142Outer {
    int a = 10;
    public void show(){
        int b = 20;
        //�ֲ��ڲ���
        class Inner{
            String name;
            int age;
            public void method(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("�ֲ��ڲ����е�method����");
            }
            public static void method1(){
                System.out.println("�ֲ��ڲ����е�method1��̬����");
            }
        }
        //��Ҫ�ڷ����ڲ���������ʹ��
        Inner i = new Inner();
        System.out.println(i.age);
        System.out.println(i.name);
        i.method();
        Inner.method1();


    }


}
