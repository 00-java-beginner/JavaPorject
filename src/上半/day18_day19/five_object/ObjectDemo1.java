package �ϰ�.day18_day19.five_object;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
            public string tostring() ���ض�����ַ�����ʾ��ʽ
            public boolean equals(Object obj) �Ƚ����������Ƿ����
            protected object clone(int a) �����¡
        */
        //1.tostring ���ض�����ַ�����ʾ��ʽ
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@119d7047

        Student stu = new Student();
        String str2 = stu.toString();
        System.out.println(str2);//com.itheima.a04objectdemo.student@4eec7777

        //ϸ��:
        System.out.println(stu);//com.itheima.a04objectdemo.student@4eec7777


        //ϸ��:
        //System:����
        //out:��̬����
        //system.out:��ȡ��ӡ�Ķ���
        //println():����
        //����:��ʾ��ӡ������
        //�����߼�:
        //�����Ǵ�ӡһ�������ʱ�򣬵ײ����ö����tostring�������Ѷ������ַ�����
        //Ȼ���ٴ�ӡ�ڿ���̨�ϣ���ӡ��ϻ��д���

        //˼��:Ĭ������£���ΪObject���е�tostring�������ص��ǵ�ֵַ
        //���ԣ�Ĭ������£���ӡһ�������ӡ�ľ��ǵ�ֵַ
        //���ǵ�ֵַ����������ûʲô�����?
        //����Ҫ���������ڲ�������ֵ?���Ǹ���ô��?
        //����������д����Object���е�toString����
        System.out.println(stu);//com.itheima.a04objectdemo.Student@4eec7777


        //tostring�����Ľ���:
        //������Ǵ�ӡһ��������Ҫ��������ֵ�Ļ�����ô����дtostring�����Ϳ����ˡ�
        //����д�ķ����У��Ѷ��������ֵ����ƴ�ӡ�
    }
}
