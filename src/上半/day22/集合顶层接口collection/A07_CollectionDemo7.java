package �ϰ�.day22.���϶���ӿ�collection;

import java.util.ArrayList;
import java.util.Collection;

public class A07_CollectionDemo7 {
    public static void main(String[] args) {
       /* Collectionϵ�м�������ͨ�õı�����ʽ��
        1.����������
        2.��ǿfor����
        3.lambda���ʽ����

        lambda���ʽ������
                default void forEach(Consumer<? super T> action):
        */

        //1.�������ϲ����Ԫ��
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        //2.���������ڲ������ʽ
        //�ײ�ԭ��
        //��ʵҲ���Լ��������ϣ����εõ�ÿһ��Ԫ��
        //�ѵõ���ÿһ��Ԫ�أ����ݸ������accept����
        //s���α�ʾ�����е�ÿһ������
       /* coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //lambda���ʽ
        coll.forEach(s -> System.out.println(s));


    }
}
