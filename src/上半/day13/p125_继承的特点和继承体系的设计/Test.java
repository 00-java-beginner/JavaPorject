package �ϰ�.day13.p125_�̳е��ص�ͼ̳���ϵ�����;
public class Test {
    public static void main(String[] args) {
        //ע�����
        // 1.Ȩ�����η���private:�����޷�����
        // 2.����ֻ�ܷ��ʸ����з�˽�еĳ�Ա
        //�������󲢵���
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.catchMouse();
        rd.drink();

        System.out.println("-------------------");

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();
    }
}
