package �°�.day24;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //1.����id�����������
        //Ĭ������ͨ��������������Comparator������дcompare��ʵ��
        TreeMap<Integer, String> tm = new TreeMap<>();
        //TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);

        tm.put(1, "������");
        tm.put(2, "��ʦ��");
        tm.put(3, "��̳");

        System.out.println(tm);
    }
}
