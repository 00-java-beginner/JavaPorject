package �ϰ�.day18_day19.nine_regex.one;

public class RegexDemo3 {
    public static void main(String[] args) {
        // \ ת���ַ� �ı�����Ǹ��ַ�ԭ���ĺ���
        //��ϰ:���ַ�������ʽ��ӡһ��˫����
        //"��Java�б�ʾ�ַ����Ŀ�ͷ���߽�β

        //��ʱ\��ʾת���ַ����ı��˺����Ǹ�˫����ԭ���ĺ���
        //���������һ������ͨͨ��˫���Ŷ��ѡ�
        System.out.println("\"");

        // \��ʾת���ַ�
        //����\����ⷽʽ��ǰ���\��һ��ת���ַ����ı��˺���\ԭ���ĺ��壬�������һ������ͨͨ��\���ѡ�
        System.out.println("c:Users\\moon\\IdeaProjects\\basic-code\\myapi\\src\\com\\itheima\\a08regexdemo\\RegexDemo1.java");


        //.��ʾ����һ���ַ�
        System.out.println("��".matches("..")); //false
        System.out.println("��".matches(".")); //true
        System.out.println("��a".matches(".."));//true

        // \\d ��ʾ�����һ������
        // \\dֻ���������һλ����
        // ������:����\��ʾһ��\
        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false

        //\\wֻ����һλ�����ַ�[a-zA-Z_0-9]
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("��".matches("\\w"));//false

        // �ǵ����ַ�
        System.out.println("��".matches("\\W")); // true
        System.out.println("---------------------------------------------");
        // ��������ƥ��ֻ��У�鵥���ַ���


        // ���������� ��ĸ �»��� ���� 6λ
        System.out.println("2442fsfsf".matches("\\w{6,}"));//true
        System.out.println("244f".matches("\\w{6,}"));//false

        // ���������ֺ��ַ� ������4λ
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23 F".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));//true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));//false


    }
}
