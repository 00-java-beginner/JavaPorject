package �ϰ�.day23.����;


import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //û�з��͵�ʱ�򣬼�����δ洢����
        //���ۣ�
        //�������û�и�����ָ�����ͣ�Ĭ����Ϊ���е��������Ͷ���Object����
        //��ʱ�������������������������͡�
        //����һ�������������ڻ�ȡ���ݵ�ʱ���޷�ʹ������������Ϊ��

        //��ʱ�Ƴ��˷��ͣ�������������ݵ�ʱ��Ͱ����ͽ���ͳһ��
        //���������ڻ�ȡ���ݵ�ʱ��Ҳʡ��ǿת�ˣ��ǳ��ķ��㡣

        //1.�������ϵĶ���
        ArrayList<String> list = new ArrayList<>();

        //2.�������
        //list.add(123);
        list.add("aaa");
        //list.add(new Student("zhangsan",123));


        //3.�������ϻ�ȡ�����ÿһ��Ԫ��
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            //��̬�ı׶��ǲ��ܷ�����������й���
            //obj.length();
            //str.length();
            System.out.println(str);
        }


    }
}
