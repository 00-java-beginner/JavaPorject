package �ϰ�.day15.p138_�ӿںͳ������ۺ���ϰ;

import �ϰ�.day13.p132_��̬�ۺ���ϰ.Person;

public  abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }

    public abstract void teach();
}
