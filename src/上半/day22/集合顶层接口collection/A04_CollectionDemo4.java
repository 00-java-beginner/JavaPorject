package �ϰ�.day22.���϶���ӿ�collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {
      /*
        ��������ϸ��ע��㣺
            1.����NoSuchElementException
            2.������������ϣ�ָ�벻�Ḵλ
            3.ѭ����ֻ����һ��next����
            4.����������ʱ�������ü��ϵķ����������ӻ���ɾ��
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

        //������ѭ������֮�󣬵�������ָ���Ѿ�ָ�������û��Ԫ�ص�λ��
        //System.out.println(it.next());//NoSuchElementException

        //������������ϣ�ָ�벻�Ḵλ
        System.out.println(it.hasNext());

        //�������Ҫ�����ڶ��α������ϣ�ֻ���ٴλ�ȡһ���µĵ���������
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }
    }
}
