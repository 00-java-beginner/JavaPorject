package �ϰ�.day18_day19.nine_regex.two;

public class RegexDemo5 {
    public static void main(String[] args) {
        /*
            ������ʽ��ϰ:
            ����
            ���д������ʽ��֤�û����Ƿ�����Ҫ��Ҫ��:��Сд��ĸ�����֣��»���һ��4-16λ���д������ʽ��֤���֤�����Ƿ�����Ҫ��
            ��Ҫ��:18λ��ǰ17λ�������֣����һλ���������ֿ����Ǵ�д��Сд��x����Ҫ��:�������֤����ĸ�ʽ�ϸ�Ҫ��

            ���֤����:
            41080119930228457x
            510801197609022309
            15040119810705387X
            130133197204039024 I
            430102197606046442
        */

        //�û���Ҫ��:��Сд��ĸ�����֣��»���һ��4-16λ
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("lisi".matches(regex1));
        System.out.println("wangwu".matches(regex1));
        System.out.println("$123".matches(regex1));


        //���֤����ļ�У��:
        //18λ��ǰ17λ�������֣����һλ���������ֿ����Ǵ�д��Сд��x
        String regex2 = "[1-9]\\d{16}(\\d|x|x)";
        String regex3 = "[1-9]\\d{16}[\\dXx]";
        String regex5 = "[1-9]\\d{16}(\\d(?i)x)";

        System.out.println("41080119930228457x".matches(regex3));
        System.out.println("510801197609022309".matches(regex3));
        System.out.println("15040119810705387X".matches(regex3));
        System.out.println("130133197204039024".matches(regex3));
        System.out.println("430102197606046442".matches(regex3));


        //���Դ�Сд����д��ʽ
        //��ƥ���ʱ�����abc�Ĵ�Сд
        String regex4 = "a((?i)b)c";
        System.out.println("------------------------------");
        System.out.println("abc".matches(regex4));//true
        System.out.println("ABC".matches(regex4));//false
        System.out.println("aBc".matches(regex4));//true


        //���֤������ϸ�У��
        //��д�����С�ĵ�:
        //��һ��:������ȷ�����ݽ��в��
        //�ڶ���:��ÿһ���ֵĹ��ɣ�����д������ʽ
        //������:��ÿһ���ֵ�����ƴ����һ�𣬾������յĽ��
        //��д��ʱ��:������ȥ��д��

        //410801 1993 02 28 457x
        //ǰ��6λ:ʡ�ݣ��������ɳ�������Ϣ����һλ������0������5λ����������       [1-9]\\d{5}
        //���ǰ���: 18 19 20                                                (18|19|20)
        //��ĺ���: �������ֳ�������                                           \\d{2}
        //�·�: 01~ 09 10 11 12                                               (@[1-9]|1[0-2])
        //����: 01~09 10~19 20~29 30 31                                       (0[1-9]|[12]\\d|3[01])
        //������λ: �������ֳ���3�� ���һλ����������Ҳ�����Ǵ�дx����Сдx        \\d{3}[\\dXx]
        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(@[1-9]|1[0-2])(@[1-9]|[12]\\d|3[01])\\d{3}[\\dxXx]";

        System.out.println("41080119930228457x".matches(regex6));
        System.out.println("510801197609022309".matches(regex6));
        System.out.println("15040119810705387X".matches(regex6));
        System.out.println("130133197204039024".matches(regex6));
        System.out.println("430102197606046442".matches(regex6));


    }
}
