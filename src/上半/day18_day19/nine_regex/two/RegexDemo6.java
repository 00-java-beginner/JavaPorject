package �ϰ�.day18_day19.nine_regex.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        /* �������ı����밴��Ҫ����ȡ���ݡ�
                Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��
                ��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨
                Ҫ��:�ҳ��������е�JavaXX
         */

        String str = "Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��" +
                "��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨";


        //1.��ȡ������ʽ�Ķ���
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.��ȡ�ı�ƥ�����Ķ���
        //����mȥ��ȡstr���ҷ���p������Ӵ�
        Matcher m = p.matcher(str);

        //3.����ѭ����ȡ
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }


    }

    private static void method1(String str) {
        //Pattern:��ʾ������ʽ
        //Matcher: �ı�ƥ���������ð���������ʽ�Ĺ���ȥ��ȡ�ַ�������ͷ��ʼ��ȡ��
        //          �ڴ���ȥ�ҷ���ƥ�������Ӵ���

        //��ȡ������ʽ�Ķ���
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //��ȡ�ı�ƥ�����Ķ���
        //m:�ı�ƥ�����Ķ���
        //str:��
        //p:����
        //mҪ��str���ҷ���p�����С��
        Matcher m = p.matcher(str);

        //�����ı�ƥ������ͷ��ʼ��ȡ��Ѱ���Ƿ������������Ӵ�
        //���û�У���������false
        //����У�����true���ڵײ��¼�Ӵ�����ʼ�����ͽ�������+1
        // 0,4
        boolean b = m.find();

        //�����ײ�����find������¼�����������ַ����Ľ�ȡ
        // substring(��ʼ��������������);��ͷ����β
        // (0,4)���ǲ�����4����
        // ��ѽ�ȡ��С�����з��ء�
        String s1 = m.group();
        System.out.println(s1);


        //�ڶ����ڵ���find��ʱ�򣬻������ȡ���������
        //��ȡ���ڶ�������Ҫ����Ӵ����������������true
        //���ѵڶ����Ӵ�����ʼ�����ͽ�������+1�����м�¼
        b = m.find();

        //�ڶ��ε���group������ʱ�򣬻����find������¼�������ٴν�ȡ�Ӵ�
        String s2 = m.group();
        System.out.println(s2);
    }
}
