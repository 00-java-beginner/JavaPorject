package �ϰ�.day10;

public class p104_01_�����ֻ��� {
    public static void main(String[] args) {
        //1.����һ��������¼�ֻ���
        String phoneNumber = "18258222617";

        //2.��ȡ�ֻ���ǰ��λ
        //ע�⣺substring�������󲻰��ң������ڽضϵ�ʱ��Ҫ���ұ����һλ������+1�����򲻰������ұ���λ
        String start = phoneNumber.substring(0,3);

        //3.��ȡ�ֻ��ź���λ,������Ҫ��ȡ�����һλ�����Կ���ֱ�Ӵ���Ҫ��ȡ����һλ��������ʼ������Ҫд����ֵ
        String end = phoneNumber.substring(7);

        //4.ƴ��
        String result = start + "****" + end;
        System.out.println(result);

    }
}
