package �ϰ�.day15.p138_�ӿںͳ������ۺ���ϰ;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("��������ڽ�����");
    }
}
