package �ϰ�.day18_day19.five_object;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));// false
        //��Ϊequals�����Ǳ�s���õģ���s���ַ���
        //����equalsҪ��string���е�
        //�ַ����е�equals���������жϲ����Ƿ�Ϊ�ַ���
        // ������ַ������ٱȽ��ڲ�������
        //����������������ַ�����ֱ�ӷ���false


        System.out.println(sb.equals(s));// false
        //��Ϊequals�����Ǳ�sb���õģ���sb��StringBuilder
        //���������equals����Ҫ��StringBuilder�е�equals����
        //��ô��StringBuilder���У�û����дequals����
        //ʹ�õ���Object�е�
        //��Object����Ĭ����ʹ��==�űȽ���������ĵ�ֵַ
        //�������s��sb��¼�ĵ�ֵַ�ǲ�һ���ģ����Խ������false
    }
}
