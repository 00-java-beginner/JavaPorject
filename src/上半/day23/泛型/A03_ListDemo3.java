package �ϰ�.day23.����;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*
            Listϵ�м��ϵ����ֱ�����ʽ��
                1.������
                2.�б������
                3.��ǿfor
                4.Lambda���ʽ
                5.��ͨforѭ��
         */


        //�������ϲ����Ԫ��
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.������
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/


        //2.��ǿfor
        //����ı���s����ʵ����һ���������ı������ѡ�
        //��ѭ���Ĺ����У����α�ʾ�����е�ÿһ��Ԫ��
       /* for (String s : list) {
            System.out.println(s);
        }*/

        //3.Lambda���ʽ
        //forEach�����ĵײ���ʵ����һ��ѭ�����������εõ������е�ÿһ��Ԫ��
        //����ÿһ��Ԫ�ش��ݸ������accept����
        //accept�������β�s�����α�ʾ�����е�ÿһ��Ԫ��
        //list.forEach(s->System.out.println(s) );


        //4.��ͨforѭ��
        //size������get��������ѭ����ϵķ�ʽ������������ȡ�������е�ÿһ��Ԫ��
        /*for (int i = 0; i < list.size(); i++) {
            //i:���α�ʾ�����е�ÿһ������
            String s = list.get(i);
            System.out.println(s);
        }*/

        // 5.�б������
        //��ȡһ���б�������Ķ��������ָ��Ĭ��Ҳ��ָ��0������

        //���������һ���������ڱ����Ĺ����У��������Ԫ��
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                //qqq
                it.add("qqq");
            }
        }
        System.out.println(list);



    }
}
