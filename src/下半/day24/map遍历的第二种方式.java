package �°�.day24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map�����ĵڶ��ַ�ʽ {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("����", "����");
        m.put("ΤС��","�彣��");
        m.put("��־ƽ","С��Ů");

        //��ȡ���еļ�ֵ�Զ��󣬷��ؼ���
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //�������ϣ��õ������ÿһ����ֵ�Զ���
        for (Map.Entry<String, String> entry : entries) {
            //�ֱ���÷�����ȡ��ֵ
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}
