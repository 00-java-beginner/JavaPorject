package �ϰ�.day23.����;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {

        //Listϵ�м����е�����ɾ���ķ���
        //1.ֱ��ɾ��Ԫ��
        //2.ͨ����������ɾ��

        //1.�������ϲ����Ԫ��
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);


        //2.ɾ��Ԫ��
        //���ʣ���ʱɾ������1���Ԫ�أ�����1�����ϵ�Ԫ�أ�
        //Ϊʲô��
        //��Ϊ�ڵ��÷�����ʱ�����������������������
        //���ȵ��ã�ʵ�θ��β�����һ�µ��Ǹ�������

        //list.remove(1);


        //�ֶ�װ�䣬�ֶ��ѻ����������͵�1�����Integer����
        Integer i = Integer.valueOf(1);

        list.remove(i);

        System.out.println(list);


    }
}
