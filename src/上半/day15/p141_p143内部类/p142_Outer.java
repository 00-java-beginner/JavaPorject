package �ϰ�.day15.p141_p143�ڲ���;

public class p142_Outer{
    //int a = 10;
    //static int b = 20;
    //��̬�ڲ���
    static class Inner{
        public void show1(){
            System.out.println("�Ǿ�̬������������");
            //�����Ҫ���ʷǾ�̬����Ҫ�����ⲿ��Ķ���
            /*p142_Outer o = new p142_Outer();
            System.out.println(o.a);
            System.out.println(b);*/

        }
        public static void show2(){
            System.out.println("��̬������������");
            //�����Ҫ���ʷǾ�̬����Ҫ�����ⲿ��Ķ���
            /*p142_Outer o = new p142_Outer();
            System.out.println(o.a);
            System.out.println(b);*/
        }
    }
}
