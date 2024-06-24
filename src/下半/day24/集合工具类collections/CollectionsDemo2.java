package �°�.day24.���Ϲ�����collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
      /*
        public static <T> void sort(List<T> list)                       ����
        public static <T> void sort(List<T> list, Comparator<T> c)      ����ָ���Ĺ����������
        public static <T> int binarySearch (List<T> list,  T key)       �Զ��ֲ��ҷ�����Ԫ��
        public static <T> void copy(List<T> dest, List<T> src)          ���������е�Ԫ��
        public static <T> int fill (List<T> list,  T obj)               ʹ��ָ����Ԫ����伯��
        public static <T> void max/min(Collection<T> coll)              ����Ĭ�ϵ���Ȼ�����ȡ���/Сֵ
        public static <T> void swap(List<?> list, int i, int j)         ����������ָ��λ�õ�Ԫ��
     */


        System.out.println("-------------sortĬ�Ϲ���--------------------------");
        //Ĭ�Ϲ�����Ҫ��дComparable�ӿ�compareTo������Integer�Ѿ�ʵ�֣����մ�С����˳������
        //������Զ��������Ҫ�Լ�ָ������
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 10, 1, 2, 4, 8, 5, 9, 6, 7, 3);
        Collections.sort(list1);
        System.out.println(list1);


        System.out.println("-------------sort�Լ�ָ���������--------------------------");
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);

        Collections.sort(list1, (o1, o2) -> o2 - o1);
        System.out.println(list1);

        System.out.println("-------------binarySearch--------------------------");
        //��ҪԪ������
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.binarySearch(list2, 9));
        System.out.println(Collections.binarySearch(list2, 1));
        System.out.println(Collections.binarySearch(list2, 20));

        System.out.println("-------------copy--------------------------");
        //��list3�е�Ԫ�ؿ�����list4��
        //�Ḳ��ԭ����Ԫ��
        //ע��㣺���list3�ĳ��� > list4�ĳ��ȣ������ᱨ��
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(list4, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        Collections.copy(list4, list3);
        System.out.println(list3);
        System.out.println(list4);

        System.out.println("-------------fill--------------------------");
        //�Ѽ��������е��������ݣ����޸�Ϊָ������
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.fill(list5, 100);
        System.out.println(list5);

        System.out.println("-------------max/min--------------------------");
        //�����ֵ������Сֵ
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.max(list6));
        System.out.println(Collections.min(list6));

        System.out.println("-------------max/minָ������--------------------------");
        // String��Ĭ���ǰ�����ĸ��abcdefg˳��������е�
        // ������Ҫ������ַ���
        // Ĭ�ϵĹ����޷����㣬�����Լ�ָ������
        // ��ָ����������ֵ������Сֵ
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7, "a","aa","aaa","aaaa");
        System.out.println(Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));

        System.out.println("-------------swap--------------------------");
        ArrayList<Integer> list8 = new ArrayList<>();
        Collections.addAll(list8, 1, 2, 3);
        Collections.swap(list8,0,2);
        System.out.println(list8);



    }
}
