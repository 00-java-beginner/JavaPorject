package �ϰ�.day23.����;


import java.util.ArrayList;

/*
    ����һ�������ࣺListUtil
    ���ж���һ����̬����addAll��������Ӷ�����ϵ�Ԫ�ء�
*/
public class GenericsDemo3 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list1);


        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2,1,2,3,4);
        System.out.println(list2);

    }
}
