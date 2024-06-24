package �ϰ�.day18_day19.nine_regex.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) throws IOException {
        /* ��չ����2:
            ������:https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i
            �����е����֤���붼��ȡ������
        */

        //����һ��URL����
        URL url = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i");
        //�����������ַ
        //ϸ��:��֤�����ǳ�ͨ
        URLConnection conn = url.openConnection();//����һ������ȥ��ȡ�����е�����
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //��ȡ������ʽ�Ķ���pattern
        String regex = "[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);//�ڶ�ȡ��ʱ��ÿ�ζ�һ����
        while ((line = br.readLine()) != null) {
            //�����ı�ƥ�����Ķ���matcher����pattern�Ĺ���ȥ��ȡ��ǰ����һ����Ϣ
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        br.close();
    }
}
