package �ϰ�.day15.p138_�ӿںͳ������ۺ���ϰ;

public class PIngPangCoach extends Coach implements English{
    public PIngPangCoach() {
    }

    public PIngPangCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("ƹ��������ڽ�ƹ����");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("ƹ���������˵Ӣ��");
    }
}
