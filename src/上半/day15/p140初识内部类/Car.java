package �ϰ�.day15.p140��ʶ�ڲ���;

public class Car {
//    ����:дһ��Javabean������������
//    ����:������Ʒ��,����,��ɫ,��������Ʒ��,ʹ�����ޡ�
//    �ڲ���ķ����ص�:
//    �ڲ������ֱ�ӷ����ⲿ��ĳ�Ա,����˽��
//    �ⲿ��Ҫ�����ڲ���ĳ�Ա,���봴������
    String carName;
    int carAge;
    String carColor;
    //�ⲿ��Ҫ�����ڲ���ĳ�Ա,���봴������
    public void show(){
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;
        //�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա,����˽��
        public void show(){
            System.out.println(engineName);
        }
    }
}
