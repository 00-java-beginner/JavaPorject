package �ϰ�.day7;

public class ��ά����_��̬��ʼ�� {
    public static void main(String[] args) {
        //1.��������
        //3��ʾ���Էż���һά���飬5��ʾһά�����������װ����Ԫ��
        int[][] arr = new int [3][5];
        //2.����ά���鸳ֵ
        arr[0][0] = 10;
        //3.������ά����
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
