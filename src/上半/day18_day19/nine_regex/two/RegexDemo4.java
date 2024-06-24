package �ϰ�.day18_day19.nine_regex.two;

public class RegexDemo4 {
    public static void main(String[] args) {
        /*
            ����
            ���д������ʽ��֤�û�������ֻ������Ƿ�����Ҫ�����д������ʽ��֤�û������������Ƿ�����Ҫ�����д������ʽ��֤�û�����ĵ绰�����Ƿ�����Ҫ��
            ��֤�ֻ����� 13112345678 13712345667 13945679027 139456790271
            ��֤�����绰���� 020-2324242 02122442 027-42424 0712-3242434
            ��֤������� 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        */

        //�ĵ�:
        //����һ����ȷ�����ݣ�����������ȥд��
        //13112345678
        //�ֳ�������:
        //��һ����:1 ��ʾ�ֻ�����ֻ����1��ͷ
        //�ڶ�����:[3-9] ��ʾ�ֻ�����ڶ�λֻ����3-9֮���
        //��������:\\d{9} ��ʾ�������ֿ��Գ���9�Σ�Ҳֻ�ܳ���9��
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));//true
        System.out.println("13712345667".matches(regex1));//true
        System.out.println("13945679027".matches(regex1));//true
        System.out.println("139456790271".matches(regex1));//false
        System.out.println("-----------------------------------");

        //�����绰����
        //020-2324242 02122442 027-42424 0712-3242434
        //˼·:
        //����д�����������ʱ����Ҫ����ȷ�����ݷ�Ϊ������
        //һ:����@\\d{2,3}
        //      0:��ʾ����һ������0��ͷ��
        //      \\d{2,3}:��ʾ���Ŵӵڶ�λ��ʼ��������������֣����Գ���2��3�Ρ�
        //��:- ?��ʾ�������մλ�һ��
        //��:���� ����ĵ�һλҲ�������տ�ͷ���ӵڶ�λ��ʼ��������������֣�������ܳ���:5-10λ
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));

        //�������
        //3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //˼·:
        //����д������������ʱ����Ҫ����ȷ�����ݷ�Ϊ������
        //��һ����:@����� \\w+
        //      �������ĸ�����»��ߣ����ٳ���һ�ξͿ�����
        //�ڶ�����:@ ֻ�ܳ���һ��
        //��������:
        //      3.1         .�����[\\w&&[^_]]{2,6}
        //                  �������ĸ�����֣��ܹ�����2-6��(��ʱ���ܳ����»���)
        //      3.2         . \\.
        //      3.3         ��д��ĸ��Сд��ĸ�����ԣ�ֻ�ܳ���2-3��[a-zA-Z]{2,3}
        //      ���ǿ��԰�3.2��3.3����һ�飬��һ����Գ���1�λ�������
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));


        //24Сʱ��������ʽ
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("23:11:11".matches(regex4));

        String regex5 = "([01]\\d 2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:11".matches(regex5));
    }
}
