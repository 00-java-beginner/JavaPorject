package �ϰ�.day23.����;


import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        /*
            ���Ͳ��߱��̳��ԣ��������ݾ߱��̳���
        */

        //�������ϵĶ���
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        //����method����
        //method(list1);
        //method(list2);
        //method(list3);


        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());


    }


    /*
    * ��ʱ����������д����ʲô���ͣ���ôֻ�ܴ���ʲô���͵����ݡ�
    * */
    public static void method(ArrayList<Ye> list) {

    }


}


