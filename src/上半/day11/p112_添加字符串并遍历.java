package �ϰ�.day11;

import java.util.ArrayList;

public class p112_����ַ��������� {
    public static void main(String[] args) {
        //����һ�����ϣ�����ַ���������
        //1.��������
        ArrayList<String> list = new ArrayList<>();
        //2.���Ԫ��
        list.add("�Է�");
        list.add("˯��");
        list.add("�򶹶�");
        //3.��������
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
