package �ϰ�.day21.Arrays;

import java.util.Arrays;

public class MyArrays1 {
    public static void main(String[] args) {
        //1.toString�����������ַ���
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr1));

        //2.binarySearch�����ֲ��ҷ�
        //ϸ��1:���ֲ��ҵ�ǰ��:�����е�Ԫ�ر��������������е�Ԫ�ر����������
        //ϸ��2:���Ҫ���ҵ�Ԫ���Ǵ��ڵģ���ô���ص�����ʵ������
        //���ǣ����Ҫ���ҵ�Ԫ���ǲ����ڵģ����ص���-�����-1/:ΪʲôҪ��1��?
        //����:�����ʱ��������Ҫ��������0����ô������ص�ֵ��-����㣬�ͻ���������ˡ�
        //���Ҫ��������0����ʱ0�ǲ����ڵģ����ǰ�������Ĺ���-����㣬Ӧ�þ���-0
        //Ϊ�˱��������������Java������������ּ�һ��
        System.out.println(Arrays.binarySearch(arr1, 10));

        //3.copyOf����������
        //����һ:������
        //������:������ĳ���
        //�����ĵײ����ݵڶ��������������µ�����
        //���������ĳ�����С��������ĳ��ȣ��Ჿ�ֿ���
        //���������ĳ����ǵ���������ĳ��ȣ�����ȫ����
        //���������ĳ����Ǵ���������ĳ��ȣ��Ჹ��Ĭ�ϳ�ʼֵ
        int [] newArr1 = Arrays.copyOf(arr1,10);
        System.out.println(Arrays.toString(newArr1));

        //4.copyOfRange���������飨ָ����Χ��
        //ϸ�ڣ����󲻰��ң���ͷ����β
        int [] newArr2 = Arrays.copyOfRange(arr1,0,9);
        System.out.println(Arrays.toString(newArr2));

        //5.fill���������
        Arrays.fill(arr1,100);
        System.out.println(Arrays.toString(arr1));

        //6.sort������Ĭ������£��������������ͽ�����������,�ײ�ʹ�õ��ǿ�������
        int[] arr2 = {11, 2, 3, 8, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
