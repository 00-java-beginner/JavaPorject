package �ϰ�.day15.p141_p143�ڲ���;

public class p141Test {
    public static void main(String[] args) {
        /*
        һ����д��Ա�ڲ����ע���:
        1.��Ա�ڲ�����Ա�һЩ���η�������,����:private,Ĭ��,protected,public,static��
        2.�ڳ�Ա�ڲ�������,JDK16֮ǰ���ܶ��徲̬����,JDK 16��ʼ�ſ��Զ��徲̬������

        ������ȡ��Ա�ڲ����������ַ�ʽ:
        1.�ⲿ���д����,�����ṩ�ڲ������(private)

        2.ֱ�Ӵ���
        ��ʽ:�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������
        ����:Outer.Inner oi=new Outer().new Inner()
*/
        //��Ա����ֻ��ͨ����������ķ�ʽȥ����
        //�����Ҫ�����ڲ���ĳ�Ա����ֻ���ȴ����ⲿ�����ſ�?�Ե����ڲ������
        //����ڲ��౻private���Σ�����ֱ�ӵ���
        p141Outer.Inner oi = new p141Outer().new Inner();

        //1.�ⲿ���д����,�����ṩ�ڲ������
        p141Outer o = new p141Outer();
        System.out.println(o.getInstance());

    }
}
