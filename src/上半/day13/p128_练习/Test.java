package �ϰ�.day13.p128_��ϰ;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("001","zhangsan","��ʦ");
        System.out.println(l.getId() + "," + l.getName() + "," + l.getWork());

        Maintainer m = new Maintainer("002" , "lisi" , "ά��רԱ");
        System.out.println(m.getId() + "," + m.getName() + "," + m.getWork());

        Tutor t = new Tutor("003" , "wangwu" , "����");
        System.out.println(t.getId() + "," + t.getName() + "," + t.getWork());

        Buyer b = new Buyer("004","zhaoliu","�ɹ�רԱ");
        System.out.println(b.getId() + "," + b.getName() + "," + b.getWork());
    }
}
