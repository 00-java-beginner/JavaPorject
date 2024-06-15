package 上半.day15.p138_接口和抽象类综合练习;

import 上半.day13.p132_多态综合练习.Person;

public  abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }

    public abstract void teach();
}
