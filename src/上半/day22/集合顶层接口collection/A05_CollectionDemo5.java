package �ϰ�.day22.���϶���ӿ�collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {
      /*
        ��������ϸ��ע��㣺
            1.����NoSuchElementException
            2.������������ϣ�ָ�벻�Ḵλ
            3.ѭ����ֻ����һ��next����
            4.����������ʱ�������ü��ϵķ����������ӻ���ɾ��
                ��ʱ����һ���������м��䣬�ڽ������ǻὲ��Դ����ϸ������������
                �����ʵ��Ҫɾ������ô�����õ������ṩ��remove��������ɾ����
                �����Ҫ��ӣ���ʱû�а취��
       */

        //1.�������ϲ����Ԫ��
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //2.��ȡ����������
        //�������ͺñ���һ����ͷ��Ĭ��ָ�򼯺ϵ�0������
        Iterator<String> it = coll.iterator();
        //3.����ѭ�����ϵ�ȥ��ȡ�����е�ÿһ��Ԫ��
        while(it.hasNext()){
            //4.next�������������飺��ȡԪ��,���ƶ�ָ��
            String str = it.next();
            if("bbb".equals(str)){
                //coll.remove("bbb");
                it.remove();
            }
        }
        System.out.println(coll);

    }
}
