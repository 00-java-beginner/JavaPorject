package �ϰ�.day7;

public class �ۺ���ϰ_���ּ��� {
    public static void main(String[] args) {
        //1.����һ������
        int[] arr = {1, 5, 8, 6};
        //2.����ѭ���������ֵ����
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //3.����ѭ�������ܺ���������ȡ��
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //4.����ָ�뽫ȡ������ֵ��ת
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //5.����ת����������ƴ��
        //����һ���µı���������������
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
