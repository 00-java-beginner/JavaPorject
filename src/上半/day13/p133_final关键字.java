package �ϰ�.day13;

import �ϰ�.day13.p129��ʶ��̬.Student;

public class p133_final�ؼ��� {
    public static void main(String[] args) {
        //final �޸Ļ����������ͣ���¼��ֵ���ܷ����仯
        //final �޸������������ͣ���¼�ĵ�ֵַ���ܷ����仯�������ڲ�������ֵ���Է����仯
        final int a = 10;
        //a = 20; �����������Ͳ��ܸ�ֵ����ʱ����a����˳���A

        final Student S = new Student();
        //S = new Student(); �����������Ͳ��ܷ����仯��ֻ�ܶ����������ֵ�����޸�
        S.setName("zhangsan");
        S.setAge(22);
        System.out.println(S.getAge() + ", " + S.getName());
    }
}
