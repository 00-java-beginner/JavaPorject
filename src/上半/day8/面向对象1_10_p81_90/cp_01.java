package �ϰ�.day8.�������1_10_p81_90;

public class cp_01 {
    public static void main(String[] args) {
        //��������
        cp f = new cp();
        //�������Ը�������ֵ
        f.setFood("������");
        f.setPrice(66);
        System.out.println(f.getFood());
        System.out.println(f.getPrice());
        //������Ϊ
        f.eat();

        //�����ڶ�������ֻ��Ҫ�޸Ķ���������
        cp f1 = new cp();
        //�������Ը�������ֵ
        f1.setFood("�����Ź�");
        f1.setPrice(88);
        System.out.println(f1.getFood());
        System.out.println(f1.getPrice());
        //������Ϊ
        f1.eat();
    }
}
