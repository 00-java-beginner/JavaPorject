package �ϰ�.day23.����;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
       /*

        Listϵ�м��϶��еķ�����
            void add(int index,E element)       �ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
            E remove(int index)                 ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
            E set(int index,E element)          �޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
            E get(int index)                    ����ָ����������Ԫ��
        */


        //1.����һ������
        List<String> list = new ArrayList<>();

        //2.���Ԫ��
        list.add("aaa");
        list.add("bbb");//1
        list.add("ccc");


        //void add(int index,E element)       �ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
        //ϸ�ڣ�ԭ�������ϵ�Ԫ�ػ�����������
        //list.add(1,"QQQ");

        //E remove(int index)                 ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
        //String remove = list.remove(0);
        //System.out.println(remove);//aaa


        //E set(int index,E element)          �޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
        //String result = list.set(0, "QQQ");
        //System.out.println(result);

        // E get(int index)                    ����ָ����������Ԫ��
        //String s = list.get(0);
        //System.out.println(s);


        //3.��ӡ����
        System.out.println(list);


    }
}
