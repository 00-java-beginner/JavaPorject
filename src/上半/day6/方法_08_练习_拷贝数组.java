package �ϰ�.day6;

public class ����_08_��ϰ_�������� {
    public static void main(String[] args) {
        //1.����һ������
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2.���÷���
        int[] copyarr = copyofrange(arr, 3, 7);

        //ѭ������
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i] + " ");
        }
    }

    public static int[] copyofrange(int[] arr, int form, int to) {
        //2.����һ���µ�����
        int[] newarr = new int[to - form];

        //3.ѭ����������һ�������е�����copy����������
        //����һ����ʱ��������α������
        int index = 0;
        for (int i = form; i < to; i++) {
            //4.��ȡ���������ݸ�ֵ��������
            newarr[index] = arr[i];
            index++;
        }
        //5.����������
        return newarr;
    }

}
