package �ϰ�.day15.p136_�ӿ�;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("С��",1);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();

        Frog f = new Frog("С��" , 2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        Dog d = new Dog("����" , 3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();
    }
}
