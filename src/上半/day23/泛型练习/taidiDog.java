package �ϰ�.day23.������ϰ;

public class taidiDog extends Dog{
    public taidiDog() {
    }

    public taidiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("һֻ����" + getName() + "��" + getAge() + "���̩�ϣ����ڳԹ�ͷ���߳Ա߲�");
    }
}
