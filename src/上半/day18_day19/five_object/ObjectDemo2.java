package �ϰ�.day18_day19.five_object;

public class ObjectDemo2 {
    public static void main(String[] args) {
        /*
            public boolean equals(Object obj) �Ƚ����������Ƿ����
        */
        Student s1 = new Student("zhangsan",23);
        Student s2 =new Student("zhangsan",23);

        boolean result1 = s1.equals(s2);
        System.out.println(result1);//true

        //����:
        //1.���û����дequals��������ôĬ��ʹ��Object�еķ������бȽϣ��Ƚϵ��ǵ�ֵַ�Ƿ����
        //2.һ��������ֵַ�����������岻���������ǻ���д����д֮��Ƚϵľ��Ƕ����ڲ�������ֵ�ˡ�
    }
}
