package �ϰ�.day5;

public class ѭ���߼��ۺ���ϰ_01_����ѭ������ת������� {
    public static void main(String[] args) {
        //for��ʽ�����޸�ʽ
        /*for(;;){
            System.out.println("ѧϰ");
        }*/

        //while��ʽ������ѭ��
        /*while (true){
            System.out.println("ѧϰ");
        }*/

        //�����ϻ��԰��ӣ��������ж�������
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //��������ѭ���������´�ѭ��
                continue;
            }
            System.out.println("С�ϻ��ڳԵ�" + i + "������");
        }

        //�����ϻ��԰��ӣ�����������Ա���
        for (int i = 1; i <= 5; i++) {
            System.out.println("С�ϻ��ڳԵ�" + i + "������");
            if (i == 3) {
                //��������ѭ��
                break;
            }
        }

    }
}
