import java.util.Random;

public class p78_�ۺ���ϰ_�齱_�Ż��� {
    public static void main(String[] args) {
        //1.�ѽ������������ѡ��ȫ������
        int[] arr = {88, 888, 8888, 88888, 888888};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //��ȡ�������
            int randomIndex = r.nextInt(arr.length);
            //��i���������randomIndex���н���
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
