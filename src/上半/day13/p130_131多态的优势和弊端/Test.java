package �ϰ�.day13.p130_131��̬�����ƺͱ׶�;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        //��̬�ı׶ˣ����ܵ�����������й��ܣ�ֻ��ǿת����ܽ��е���
        //ע�⣺ǿתʱ���ת���������ͣ�Ҳ�ᱨ��
        //���������������instanceof�ؼ��ֽ����ж�
        if (a instanceof Dog d){
            d.LookHome();
        }else if (a instanceof Cat c){
            c.CatchMouse();
        }else {
            System.out.println("��ǰ���Ͳ�����");
        }
    }
}
class Animal{
    public void eat(){
        System.out.println("�����ڳԶ���");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("���ڳԹ�ͷ");
    }
    public void LookHome(){
        System.out.println("���ڿ���");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("è�ڳ�è��");
    }
    public void CatchMouse(){
        System.out.println("è��ץ����");
    }
}
