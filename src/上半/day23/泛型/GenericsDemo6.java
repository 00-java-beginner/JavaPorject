package �ϰ�.day23.����;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        /*
        *   ����
        *       ����һ���������β���һ�����ϣ����Ǽ����е��������Ͳ�ȷ����
        *
        * */


        //�������ϵĶ���
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        ArrayList<Student2> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        //method(list3);


        //method(list4);


    }

    /*
     * ��ʱ����������д����ʲô���ͣ���ôֻ�ܴ���ʲô���͵����ݡ�
     * �׶ˣ�
     *      ���÷��ͷ�����һ��С�׶ˣ���ʱ�����Խ����������������
     *      Ye  Fu   Zi    Student
     *
     * ϣ������������Ȼ��ȷ�����ͣ������Ժ���ϣ��ֻ�ܴ���Ye Fu Zi
     *
     * ��ʱ���ǾͿ���ʹ�÷��͵�ͨ�����
     *      ?Ҳ��ʾ��ȷ��������
     *      �����Խ������͵��޶�
     *      ? extends E: ��ʾ���Դ���E����E���е���������
     *      ? super E:��ʾ���Դ���E����E���еĸ�������
     *
     * Ӧ�ó�����
     *      1.��������ڶ����ࡢ�������ӿڵ�ʱ��������Ͳ�ȷ�����Ϳ��Զ��巺���ࡢ���ͷ��������ͽӿڡ�
     *      2.������Ͳ�ȷ����������֪���Ժ�ֻ�ܴ���ĳ���̳���ϵ�еģ��Ϳ��Է��͵�ͨ���
     * ���͵�ͨ�����
     *      �ؼ��㣺�����޶����͵ķ�Χ��
     *
     * */
    public static void method(ArrayList<? super Fu> list) {

    }
}

class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}

class Student2{}