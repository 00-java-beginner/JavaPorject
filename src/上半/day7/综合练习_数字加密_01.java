package �ϰ�.day7;

public class �ۺ���ϰ_���ּ���_01 {
    public static void main(String[] args) {
        //1.���������ĳ���
        int number = 12345;
        //����һ����ʱ������¼number��ʼֵ��������ʹ��
        int temp = number;
        //2.����ѭ��������ĳ���ȡ��
        //���������������ĳ���
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //3.����һ������
        int[] arr = new int[count];

        //4.�������ϵ�ÿһλ����ӵ�������
        //����һ��������Ϊ����
        int index = arr.length - 1;
        while (temp != 0) {//12345
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
