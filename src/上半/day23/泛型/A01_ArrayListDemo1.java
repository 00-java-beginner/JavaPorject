package �ϰ�.day23.����;

import java.util.ArrayList;
import java.util.Iterator;

public class A01_ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        /*
            iterator(): ����һ������������Ĭ��ָ�򼯺ϵ�0������
            hasNext():  �жϵ�ǰָ���λ���Ƿ���Ԫ��
            next():     1.��ȡԪ��  2.�ƶ�ָ��

        */

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }



    }




}


