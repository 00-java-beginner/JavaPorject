package �ϰ�.day18_day19.nine_regex.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo10 {
    public static void main(String[] args) {
        /*
            ֻд+��*��ʾ̰��ƥ��

            +? ��̰��ƥ��
            *? ��̰��ƥ��

            ̰����ȡ:����ȡ���ݵ�ʱ�򾡿��ܵĶ��ȡ����
            ��̰����ȡ:����ȡ���ݵ�ʱ�򾡿��ܵ��ٻ�ȡ����

            ab+:
            ̰����ȡ:abbbbbbbbbbbb
            ��̰����ȡ:ab
        */
        String s = "Java�Դ�95������������abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "�����˺ܶ��ľ��Ŀǰ��ҵ���õ�������]ava8��]ava11����Ϊ�������ǳ���֧�ְ�ľ��" +
                "��һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨";

        String regex = "ab+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }


    }
}
