package �ϰ�.day5;

public class ����_04_05_��̬��ʼ��_����ֵ {
    public static void main(String[] args) {
        //��̬��ʼ��
        int[] arr = {3};
        arr[0] = 4;
        System.out.println(arr[0]);

        //�������������ֵ
        int[] arr1 = {11, 22, 33, 44};

        //����һ��������¼���ֵ
        //max�ĳ�ʼ��ֵ����Ϊ0��һ��Ҫ�����鵱�е�ֵ
        int max = arr1[0];
        //ѭ���Ŀ�ʼ��������д��1����ߴ����Ч��
        //��Ϊд��0��һ�ξ����Լ����Լ��Ƚϣ�û������
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println(max);
    }
}
