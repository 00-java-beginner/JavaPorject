package �ϰ�.day11;

import java.util.ArrayList;

public class p111_���ϵĻ���ʹ�� {
    public static void main(String[] args) {
        //1.�������ϵĶ���
        ArrayList<String> list = new ArrayList<>();

        //2.���Ԫ��
        list.add("aaa");
        list.add("bbb");

        //3.ɾ��Ԫ��
//        list.remove("aaa");
//        list.remove(0);

        //4.�޸�Ԫ��
        list.set(0,"ccc");

        //5.��ѯԪ��
        String s = list.get(0);

        //6.����
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
