package �ϰ�.day22.���϶���ӿ�collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        /*
            Collectionϵ�м�������ͨ�õı�����ʽ��
                1.����������
                2.��ǿfor����
                3.lambda���ʽ����


             ������������ص�����������
                    Iterator<E> iterator()  ����ȡһ������������
                    boolean hasNext()       ���жϵ�ǰָ���λ���Ƿ���Ԫ��
                    E next()                ����ȡ��ǰָ���Ԫ�ز��ƶ�ָ��
        */

        //1.�������ϲ����Ԫ��
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.��ȡ����������
        //�������ͺñ���һ����ͷ��Ĭ��ָ�򼯺ϵ�0������
        Iterator<String> it = coll.iterator();
        //3.����ѭ�����ϵ�ȥ��ȡ�����е�ÿһ��Ԫ��
        while(it.hasNext()){
            //4.next�������������飺��ȡԪ�ز��ƶ�ָ��
            String str = it.next();
            System.out.println(str);
        }

    }
}
