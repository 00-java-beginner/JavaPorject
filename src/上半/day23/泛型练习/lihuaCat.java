package �ϰ�.day23.������ϰ;

public class lihuaCat extends Cat{
    public lihuaCat() {
    }

    public lihuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("һֻ����" + getName()+ "��"+getAge() + "����껨è�����ڳ���");
    }
}
