package �ϰ�.day7;

public class ��ά����_��̬��ʼ�� {
    public static void main(String[] args) {
        //1.�����ά����
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        //2.��ȡԪ��
        //System.out.println(arr[i][j]);
        //arr[i]:��ʾ��ά���������
        //arr[i][j]:��ʾһά���������
//        System.out.println(arr[1][0]);

        //3.��ά�������
        //��ѭ����������ά���飬�õ�ÿһ��һά����
        for (int[] ints : arr) {
            //i��ʾ��ά�����е�ÿһ������
            //arr[i]��ʾ��ά�����е�ÿһ��Ԫ��
            for (int anInt : ints) {
                //��ѭ��������һά���飬�õ�ÿһ��Ԫ��
                //j��ʾһά�����е�ÿһ��Ԫ��
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
