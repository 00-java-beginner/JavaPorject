package �ϰ�.day21.�ۺ���ϰ;

public class Test2 {
    public static void main(String[] args) {
        //�����������⣬���ʮ�������ж��ٶ�����
        //1.����ѭ��
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);

        //2.���õݹ�
        System.out.println(getSum(12));
    }

    public static int getSum(int mouth) {
        if (mouth == 1 || mouth == 2) {
            return 1;
        } else {
            return getSum(mouth - 1) + getSum(mouth - 2);
        }
    }
}
