package �ϰ�.day23.������ϰ;

public class hashiqiDog extends Dog{
    public hashiqiDog() {
    }

    public hashiqiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("һֻ����" + getName()+ "��"+getAge() + "��Ĺ�ʿ�棬���ڳԹ�ͷ���߳Ա߲��");
    }
}
