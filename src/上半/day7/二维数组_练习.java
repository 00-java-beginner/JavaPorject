package �ϰ�.day7;

public class ��ά����_��ϰ {
    public static void main(String[] args) {
        //1.������ά����
        int[][] yearTwoArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        //2.������ά���飬���õ����������
        int yearSum = 0;
        for (int i = 0; i < yearTwoArr.length; i++) {
            int[] quarterArr = yearTwoArr[i];
            int sum = getSum(quarterArr);
            System.out.println("��" + (i + 1) + "����Ӫҵ��Ϊ��" + sum);
            yearSum = sum + yearSum;
        }
        System.out.println("ȫ���Ӫҵ��Ϊ��" + yearSum);
    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }
}
