package �ϰ�.day7;

public class �ۺ���ϰ_������ {
    public static void main(String[] args) {
        //�ж�101-200֮���ж��ٸ�����
        //1.ѭ���õ�101-200֮�������
        int conut = 0;
        for (int i = 101; i <= 200; i++) {
            //����һ��������Ϊһ��ʼ����һ������
            boolean flag = true;
            //2.ѭ��2-i֮���ܷ�������������Ա������ͱ�ʾ����һ������
            for (int j = 2; j < i; j++) {
                //3.�ж��Ƿ�Ϊ����
                if (i % j == 0) {
                    //��� i/j=0���ʾ����һ����������false��ֵ��flag
                    flag = false;
                    //���������������ֱ������ѭ��������һ���ж�
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i + "��һ������");
                conut++;
            } else {
                System.out.println(i + "����һ������");
            }
        }
        System.out.println("һ����" + conut + "������");

    }

}
