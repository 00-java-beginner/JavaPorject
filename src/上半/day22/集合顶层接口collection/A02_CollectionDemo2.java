package �ϰ�.day22.���϶���ӿ�collection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        //1.�������ϵĶ���
        Collection<Student> coll = new ArrayList<>();


        //2.��������ѧ������
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);


        //3.��ѧ��������ӵ����ϵ���
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.�жϼ�����ĳһ��ѧ�������Ƿ����
        Student s4 = new Student("zhangsan",23);
        //��Ϊcontains�����ڵײ�����equals�����ж϶����Ƿ�һ�µġ�
        //���������Զ������û����дequals��������ôĬ��ʹ��Object���е�equals���������жϣ���Object����equals������������ֵַ�����жϡ�
        //�������ͬ������ͬ���䣬����Ϊ��ͬһ��ѧ����
        //���ԣ���Ҫ���Զ����Javabean���У���дequals�����Ϳ����ˡ�
        System.out.println(coll.contains(s4));
    }
}
