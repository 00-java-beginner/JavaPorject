package �ϰ�.day7;

import java.util.Random;

public class �ۺ���ϰ_������֤�� {
    public static void main(String[] args) {
        //��֤���ʽ����λ��ǰ����λΪ��д����Сд��ĸ�����һλΪ����
        //1.�����еĴ�д��ĸ��Сд��ĸ�ŵ����鵱��
        //����ASCII�������Խ������е���������ת��Ϊchar���������Ӧ���ַ�
        //����һ�����鲢��¼���ĳ���
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //Сд��ĸ��a����ASCII���97��ʼ
                chs[i] = (char) (97 + i);
            } else {
                //��д��ĸ��A����ASCII���65��ʼ
                //����else����Ҫ��ȥǰ��ѭ���Ĵ���������i��ֵ������޷���Ӧ
                chs[i] = (char) (65 + i - 26);
            }
        }
        //2.�����ȡ�ĴΣ������������г�ȡ
        //����һ���ַ�����������ÿ��ѭ�����ֵ����������ƴ����һ��
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomindex = r.nextInt(chs.length);
            //ƴ��ѭ����Ľ��
            result = result + chs[randomindex];
        }
        //3.�����ȡһ������0-9
        int number = r.nextInt(10);
        //��������ָ�result����ƴ�ӾͿ��Եõ����Ľ��
        result = result + number;
        System.out.println(result);
    }
}

