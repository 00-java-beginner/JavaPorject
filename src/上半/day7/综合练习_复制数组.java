package �ϰ�.day7;

public class �ۺ���ϰ_�������� {
    public static void main(String[] args) {
        //1.����һ������
        int[] arr = {1, 2, 3, 4, 5};
        //2.����һ���µ�������������ĳ��ȱ���һ��
        int[] newarr = new int[arr.length];
        //3.�����������ѭ��ȡֵ����ֵ��������
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
