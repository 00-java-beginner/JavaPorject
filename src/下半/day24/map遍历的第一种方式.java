package �°�.day24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class map�����ĵ�һ�ַ�ʽ {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("����", "����");
        m.put("ΤС��","�彣��");
        m.put("��־ƽ","С��Ů");

        //��Ҫ�Ȼ�ȡkey����keyȫ�����뼯����
        Set<String> keys = m.keySet();

        //������ǿforѭ����ȡ����key
        for (String key : keys) {
            String value = m.get(key);
            System.out.println(key + " = " + value);
        }
        //���õ�����
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = m.get(key);
            System.out.println(key + " = " + value);
        }
        //����lambda���ʽ
        keys.forEach(key -> {
                String value = m.get(key);
                System.out.println(key + " = " + value);
            }
        );
    }
}
