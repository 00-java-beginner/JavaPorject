package �ϰ�.day7;

public class �ۺ���ϰ_���ֽ��� {
    public static void main(String[] args) {
        //1.��������
        int[] arr = {1, 9, 6, 3};
        //2.�����鷴ת
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.���ڼ��ܵ�ʱ����ͨ��ȡ��ķ�ʽ��ȡ�ģ����Խ��ܵ�ʱ����Ҫ�ж�
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }
        //4.������+5�����Խ�����-5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        //5.��ȡ�����е�ÿһ�����ֽ���ƴ��
        int number = 0;
        for (int j : arr) {
            number = number * 10 + j;
        }
        System.out.println(number);
    }
}

