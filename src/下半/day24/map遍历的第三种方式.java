package �°�.day24;

import java.util.HashMap;
import java.util.Map;

public class map�����ĵ����ַ�ʽ {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("����", "����");
        m.put("ΤС��", "�彣��");
        m.put("��־ƽ", "С��Ů");

        m.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
