package �ϰ�.day5;

public class ѭ���߼��ۺ���ϰ_02_���߹� {
    public static void main(String[] args) {
        //���󣺴�ӡ1-100֮������֣����߹�

        //1.��ӡ1-100
        for (int i = 1; i <= 100; i++) {
            //2.�ж�1-100֮����Щ����������߹�
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("��");
            } else {
                System.out.println(i);
            }
        }
    }
}
