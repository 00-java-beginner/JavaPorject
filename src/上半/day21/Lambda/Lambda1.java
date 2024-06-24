package �ϰ�.day21.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 5, 7, 9, 11, 23, 768, 8, 14};
        /*
        Lambda���ʽ��ע���:
        1.Lambda���ʽ���������������ڲ������д
        2.Lambda���ʽֻ�ܼ򻯺���ʽ�ӿڵ������ڲ����д��
        3.����ʽ�ӿ�:
            ���ҽ���һ�����󷽷��Ľӿڽ�������ʽ�ӿڣ��ӿ��Ϸ����Լ�@FunctionalInterfaceע��
        */

        /*
        1.���������ڲ������ʽȥ��������ķ���
        ����һ��������ʱ������������β���һ���ӿڣ���ô����Ҫ��������ӿڵ�ʵ�������
        ���ʵ�������ֻҪ�õ�һ�Σ��Ϳ����������ڲ������ʽ������д
        */
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //Lambda������ʽ
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                return o1 - o2;
            }
        );

        //Lambdaʡ�Ը�ʽ
        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));
    }
}
