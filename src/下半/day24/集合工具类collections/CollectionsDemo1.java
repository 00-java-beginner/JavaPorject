package �°�.day24.���Ϲ�����collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
      /*
        public static <T> boolean addAll(Collection<T> c, T... elements)        �������Ԫ��
        public static void shuffle(List<?> list)                                ����List����Ԫ�ص�˳��
     */



        //addAll  �������Ԫ��
        //1.�������϶���
        ArrayList<String> list = new ArrayList<>();
        //2.�������Ԫ��
        Collections.addAll(list,"abc","bcd","qwer","df","asdf","zxcv","1234","qwer");
        //3.��ӡ����
        System.out.println(list);

        //shuffle ����
        Collections.shuffle(list);

        System.out.println(list);

    }
}
