package �ϰ�.day15.p141_p143�ڲ���;

public class p141_Test_Outer{
    private int a = 10;
    class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            /*������oi���õ�show���������Ȼ��ȴӷ����ڲ��Ҿֲ�����
            ֱ�����a�ᴥ���ͽ�ԭ��ֱ���ڱ�����Ѱ�ұ���a//30
            �����this����a���ᴥ�������ߵĵ�ֵַ����ǰ�����ĵ��������ڲ������
            ����ֱ�Ӵ�ӡ�ڲ�������a//20
            ������������ⲿ��������this�ؼ��֣�����ⲿ�����ĵ�ֵַ����
            ���Դ�ӡ�����ⲿ������a//10
            �����ⲿ���������this����ʵ�������ķ�ʽ*/
            System.out.println(p141_Test_Outer.this.a);//10

            System.out.println(this.a);//20

            System.out.println(a);//30
        }
    }


}
