package �ϰ�.day13.p128�̳еĹ��췽����this��super�ؼ���;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001" , "����" , 15000 , 8000);
        System.out.println(m.getId() + m.getName() + m.getSalary() + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook("002" , "����" , 15000);
        System.out.println(c.getId() + c.getName() + c.getSalary());
        c.work();
        c.eat();
    }
}
