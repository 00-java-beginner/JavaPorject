package �ϰ�.day15.p141_p143�ڲ���;

public class p141Outer {
    String name;
    public class Inner{
        //JDK16֮ǰ���ܶ��徲̬����,JDK 16��ʼ�ſ��Զ��徲̬������
        static int a = 10;
    }
    //������ȡ��Ա�ڲ����������ַ�ʽ:
    //1.�ⲿ���д����,�����ṩ�ڲ������
    public Inner getInstance(){
        return new Inner();
    }
}
