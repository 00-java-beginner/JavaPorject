package �ϰ�.day22.���϶���ӿ�collection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
/*
        public boolean add(E e)             ���
        public void clear()                 ���
        public boolean remove(E e)          ɾ��
        public boolean contains(Object obj) �ж��Ƿ����
        public boolean isEmpty()            �ж��Ƿ�Ϊ��
        public int size()                   ���ϳ���


       ע��㣺
        Collection��һ���ӿ�,���ǲ���ֱ�Ӵ������Ķ���
        ���ԣ���������ѧϰ���ķ���ʱ��ֻ�ܴ�����ʵ����Ķ���
        ʵ���ࣺArrayList
*/
        //Ŀ�ģ�Ϊ��ѧϰCollection�ӿ�����ķ���
        //�Լ�����һЩ��ϰ��ʱ�򣬻��ǰ���֮ǰ�ķ�ʽȥ��������
        Collection<String> coll = new ArrayList<>();


        //1.���Ԫ��
        //ϸ��1���������Ҫ��Listϵ�м�����������ݣ���ô������Զ����true����ΪListϵ�е�������Ԫ���ظ��ġ�
        //ϸ��2���������Ҫ��Setϵ�м�����������ݣ������ǰҪ���Ԫ�ز����ڣ���������true����ʾ��ӳɹ���
        //                                       �����ǰҪ��ӵ�Ԫ���Ѿ����ڣ���������false����ʾ���ʧ�ܡ�
        //                                       ��ΪSetϵ�еļ��ϲ������ظ���
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.���
        //coll.clear();

        //3.ɾ��
        //ϸ��1����ΪCollection���涨����ǹ��Եķ��������Դ�ʱ����ͨ����������ɾ����ֻ��ͨ��Ԫ�صĶ������ɾ����
        //ϸ��2����������һ���������͵ķ���ֵ��ɾ���ɹ�����true��ɾ��ʧ�ܷ���false
        //���Ҫɾ����Ԫ�ز����ڣ��ͻ�ɾ��ʧ�ܡ�
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);


        //4.�ж�Ԫ���Ƿ����
        //ϸ�ڣ��ײ�������equals���������ж��Ƿ���ڵġ�
        //���ԣ���������д洢�����Զ������Ҳ��ͨ��contains�������ж��Ƿ��������ô��javabean���У�һ��Ҫ��дequals������
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);



        //5.�жϼ����Ƿ�Ϊ��
        boolean result2 = coll.isEmpty();
        System.out.println(result2);//false


        //6.��ȡ���ϵĳ���
        coll.add("ddd");
        int size = coll.size();
        System.out.println(size);//3

    }
}
