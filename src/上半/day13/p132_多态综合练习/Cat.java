package �ϰ�.day13.p132_��̬�ۺ���ϰ;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge() + "���"+getColor()
                +"��ɫ��è�����۾�����ͷ��"+something);
    }
    public void catchMouse(){
        System.out.println("è��ץ����");
    }
}
