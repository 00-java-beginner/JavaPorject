package �ϰ�.day15.p138_�ӿںͳ������ۺ���ϰ;

public class PingPangSporter extends Sporter implements English{
    public PingPangSporter() {
    }

    public PingPangSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void Study() {
        System.out.println("ƹ�����˶�Ա��ѧϰ��ƹ����");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("ƹ�����˶�Ա��˵Ӣ��");
    }
}
