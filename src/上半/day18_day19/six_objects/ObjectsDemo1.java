package �ϰ�.day18_day19.six_objects;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
            public static boolean equals(Object a, Object b) �����ǿ��жϣ��Ƚ���������
            public static boolean isNull(Object obj) �ж϶����Ƿ�Ϊnull��Ϊnul1����true ����֮
            public static boolean nonNull(Object obj) �ж϶����Ƿ�Ϊnull����isNull�Ľ���෴
        */
        //1.����ѧ����Ķ���
        Student s1 = null;
        Student s2 = new Student("zhangsan", 23);

        //2.�Ƚ��������������ֵ�Ƿ���ͬ
        if(s1 != null){
            boolean result = s1.equals(s2);
            System.out.println(result);
        }else{
            System.out.println("������Ϊ��");
        }


        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
        //ϸ��:
        //1.�����ĵײ���ж�s1�Ƿ�Ϊnull�����Ϊnull��ֱ�ӷ���false
        //2.���s1��Ϊnull����ô������s1�ٴε���equals����
        //3.��ʱs1��student���ͣ��������ջ��ǻ����student�е�equals������
        // ���û����д���Ƚϵ�ֵַ�������д�ˣ��ͱȽ�����ֵ��





        //public static boolean isNull(Obiect obi) �ж϶����Ƿ�Ϊnull��Ϊnul1����true,��֮
        Student s3 = new Student();
        Student s4 = null;

        System.out.println(Objects.isNull(s3));//false
        System.out.println(Objects.isNull(s4));//true

        System.out.println(Objects.nonNull(s3));//true
        System.out.println(Objects.nonNull(s4));//false



    }
}
