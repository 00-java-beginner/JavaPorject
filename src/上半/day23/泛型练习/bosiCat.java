package �ϰ�.day23.������ϰ;

public class bosiCat extends Cat{
    public bosiCat() {
    }

    public bosiCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("һֻ����" + getName()+ "��"+getAge() + "��Ĳ�˹è�����ڳ�С����");
    }
}
