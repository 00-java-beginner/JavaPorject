package p93_��������ۺ���ϰ_03;

public class PhoneTest {
    public static void main(String[] args) {
        //1.����һ������
        Phone[] arr = new Phone[3];

        //2.��������
        Phone p1 = new Phone("С��",1999,"��ɫ");
        Phone p2 = new Phone("��Ϊ",4999,"��ɫ");
        Phone p3 = new Phone("��ҫ",3999,"��ɫ");

        //3.��ֵ
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4.��ȡ�۸�
            //����һ���������������еļ۸�
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //��ѭ���õ���Ԫ�ظ�ֵ��һ���µı���
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        //5.����ƽ���۸�
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
