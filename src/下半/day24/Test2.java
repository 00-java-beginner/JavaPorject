package �°�.day24;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        /*ĳ���༶80��ѧ����������Ҫ������λ��
        �೤�ṩ���ĸ�����������(A��B��C��D)ÿ��ѧ��ֻ��ѡ��һ�����㣬
        ��ͳ�Ƴ������ĸ�������ȥ��������ࡣ*/
        //1.��Ҫ��ͬѧ��ͶƱ
        //����һ�����飬�洢�ĸ�����
        String[] arr = {"a", "b", "c", "d"};
        //���������ģ��80��ͬѧͶƱ����������洢����
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            //����������ȡ����Ӧ�ľ�������
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        //2.����ѭ����ͶƱ��������ӵ�������
        for (String name : list) {
            if (hm.containsKey(name)) {
                //����һ����ʱ������¼��ǰkey��Ӧ��ֵ
                int count = hm.get(name);
                //ÿ�θ��Ǻ����if����Ҫ����һ��
                count++;
                //�������������ֵ���¸�ֵ������
                hm.put(name, count);
            } else {
                //��������ڣ���ӵ�һ��
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        //3.ͳ��ȥ�ĸ�����������
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            //����һ����ʱ������¼��ǰ�����ֵ
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        //4.���бȽϻ�ȡͶƱ�������ľ���
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
