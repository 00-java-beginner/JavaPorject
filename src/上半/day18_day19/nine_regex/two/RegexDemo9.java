package �ϰ�.day18_day19.nine_regex.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        /*
            �������ı�����Ҫ����ȡ���ݡ�
                Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��
                ��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨


            ����1:��ȡ�汾��Ϊ8��11.17��Java�ı�������ֻҪJava������ʾ�汾�š�
            ����2:��ȡ�汾��Ϊ8��11��17��Java�ı�����ȷ��ȡ���Ϊ:Java8 Java11 Java17 Java17
            ����3:��ȡ���˰汾��Ϊ8��11.17��Java�ı���
        */
        String s = "Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��" +
                "��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨";

        //1.����������ʽ
        //?���Ϊǰ�������Java
        //=��ʾ��Java����Ҫ���������
        //�����ڻ�ȡ��ʱ��ֻ��ȡǰ�벿��
        //����1:
        String regex1 = "((?i)Java)(?=8|11|17)";
        //����2:
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";
        //����3:
        String regex4 = "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
