package �ϰ�.day18_day19.nine_regex.two;

public class RegexDemo13 {
    public static void main(String[] args) {
        /*����:
            ���ַ���:��Ҫѧѧ�����̳̳̳̳̳��滻Ϊ:��Ҫѧ���
        */
        String str = "��Ҫѧѧ�����̳̳̳̳̳�";

        //����:���ظ������� �滻Ϊ ������
        //ѧѧ                ѧ
        //�����            ��
        //�̳̳̳̳̳�        ��
        //  (.)��ʾ���ظ����ݵĵ�һ���ַ�����һ��
        //  \\1��ʾ��һ�ַ��ٴγ���
        //  + ����һ��
        //  $1 ��ʾ��������ʽ�е�һ������ݣ����ó�����
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);



    }
}
