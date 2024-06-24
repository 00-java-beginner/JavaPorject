package �ϰ�.day18_day19.nine_regex.one;

public class RegexDemo1 {
    public static void main(String[] args) {
        /* ��������Ҫ��У��һ��qq�����Ƿ���ȷ��
            ����:6λ��20λ֮�ڣ��ղ����ڿ�ͷ������ȫ�������֡�
            ��ʹ��Ŀǰ��ѧ֪ʶ���У������Ȼ������һ��������ʽ���顣
        */

        String qq ="1234567890";
        //system.out.println(checkQQ(qq));

        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        //У���û����Ƿ��������
        //У�������Ƿ��������
        //У�����֤�Ƿ��������
        //У���ֻ��Ƿ��������


    }

    public static boolean checkQQ(String qq) {
        //����:6λ��20λ֮�ڣ��ղ����ڿ�ͷ������ȫ�������� ��
        //����˼��:
        //�Ȱ��쳣���ݽ��й���
        //����ľ�������Ҫ��������ˡ�
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }
        //0�����ڿ�ͷ
        if (qq.startsWith("0")) {
            return false;
        }
        //����ȫ��������
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' | c > '9') {
                return false;
            }
        }
        return true;
    }
}
