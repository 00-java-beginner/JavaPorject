package �ϰ�.day13.p132_��̬�ۺ���ϰ;

public class Dog extends Animal{
    public Dog() {
    }
    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge() + "���"+getColor()
                +"��ɫ�Ĺ���ֻǰ�������ı�ס"+something+"�ͳ�");
    }
    public void lookHome(){
        System.out.println("���ڿ���");
    }
}
