package �°�.day24;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*
            V put(K key,V value)                    ���Ԫ��
            V remove(Object key)                    ���ݼ�ɾ����ֵ��Ԫ��
            void clear()                            �Ƴ����еļ�ֵ��Ԫ��
            boolean containsKey(Object key)         �жϼ����Ƿ����ָ���ļ�
            boolean containsValue(Object value)     �жϼ����Ƿ����ָ����ֵ
            boolean isEmpty()                       �жϼ����Ƿ�Ϊ��
            int size()                              ���ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ���
        */


        //1.����Map���ϵĶ���
        Map<String, String> m = new HashMap<>();

        //2.���Ԫ��
        //put������ϸ�ڣ�
        //���/����
        //��������ݵ�ʱ������������ڣ���ôֱ�ӰѼ�ֵ�Զ�����ӵ�map���ϵ���,��������null
        //��������ݵ�ʱ��������Ǵ��ڵģ���ô���ԭ�еļ�ֵ�Զ��󸲸ǣ���ѱ����ǵ�ֵ���з��ء�

        m.put("����", "����");
        m.put("ΤС��","�彣��");
        m.put("��־ƽ","С��Ů");

        //String value2 = m.put("ΤС��", "˫��");
        //System.out.println(value2);

        //ɾ��
        //String result = m.remove("����");//����
        //System.out.println(result);

        //���
        //m.clear();

        //�ж��Ƿ����
        /*boolean keyResult = m.containsKey("����");
        System.out.println(keyResult);

        boolean valueResult = m.containsValue("С��Ů2");
        System.out.println(valueResult);*/

       /* boolean result = m.isEmpty();
        System.out.println(result);*/

        int size = m.size();
        System.out.println(size);


        //3.��ӡ����
        System.out.println(m);

    }
}