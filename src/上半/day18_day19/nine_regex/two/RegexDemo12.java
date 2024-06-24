package �ϰ�.day18_day19.nine_regex.two;

public class RegexDemo12 {
    public static void main(String[] args) {
        //����1:�ж�һ���ַ����Ŀ�ʼ�ַ��ͽ����ַ��Ƿ�һ��?ֻ����һ���ַ�
        //����: a123a b456b 17891 &abc& a123b(false)
        // \\���:��ʾ�ѵ�X��������ٳ�����һ��
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));
        System.out.println("--------------------------");


        //����2:�ж�һ���ַ����Ŀ�ʼ���ֺͽ��������Ƿ�һ��?�����ж���ַ�
        //����: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));
        System.out.println("---------------------");

        //����3:�ж�һ���ַ����Ŀ�ʼ���ֺͽ��������Ƿ�һ��?��ʼ�����ڲ�ÿ���ַ�Ҳ��Ҫһ��
        //����: aaa123aaa bbb456bbb 111789111 &&abc&&
        //(.):������ĸ����һ��
        // \\2:������ĸ�ó����ٴ�ʹ��
        // *:������\\2,��ʾ�����ظ������ݳ����մλ���
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("aaa123aab".matches(regex3));
    }
}
