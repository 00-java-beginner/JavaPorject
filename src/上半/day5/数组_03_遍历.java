package �ϰ�.day5;

public class ����_03_���� {
    public static void main(String[] args) {
        /*int[] arr = {1,2,3,4,5};
        //������������ı�����ʽ
        //ͨ��������.length���Ի�ȡ����ĳ���   ��������ѭ������
        //i��ʾ���������ÿһ������   arr[i]��ʾ���������ÿһ��Ԫ��
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //�ۼӱ���������
        int[] arr1 = {1,2,3,4,5};
        //����һ������������͵�ֵ
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        System.out.println(sum);
        */

        /*
        //����ͳ�Ƹ���������һ�����飬����ÿ��Ԫ�أ�ͳ���������ж��ٸ��ܱ�3����������
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //����һ����������ͳ��
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
         */

        //���󣺶���һ�����飬����ÿ��Ԫ��
        // ������������򽫵�ǰ�������������������ż�����򽫵�ǰ���ֱ�ɶ���֮һ
        int[] arr3 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 1) {
                arr3[i] = arr3[i] * 2;
                //System.out.println(arr3[i]);
            } else {
                arr3[i] = arr3[i] / 2;
                //System.out.println(arr3[i]);
            }
        }
        //ѭ���������ٽ��д�ӡ��һ��ѭ������ֻ��һ������
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
