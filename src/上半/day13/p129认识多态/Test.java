package �ϰ�.day13.p129��ʶ��̬;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("����");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("����");
        t.setAge(40);

        Administrator admin = new Administrator();
        admin.setName("�޹ܴ���");
        admin.setAge(50);

        register(s);
        register(t);
        register(admin);
    }
    public static void register(Person p){
        p.show();
    }
}
