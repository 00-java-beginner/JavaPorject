package �ϰ�.day21.����.ð������;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4};
        //��ѭ������ʾ��Ҫִ�ж����֣������n�����ݣ���ôִ��n-1��
        for (int i = 0; i < arr.length - 1; i++) {
            //��ѭ������ʾÿһ������αȽ����ݲ��ҵ����ֵ
            //-1:��ֹ����Խ��
            //-i:���Ч�ʣ��Ѿ��ȽϹ��Ŀ��Լ�ȥ��Ӧ������
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
