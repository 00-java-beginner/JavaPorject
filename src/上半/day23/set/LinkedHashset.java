package �ϰ�.day23.set;


import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        Student s1 = new Student(23,"����");
        Student s2 = new Student(22,"����");
        Student s3 = new Student(25,"����");
        Student s4 = new Student(23,"����");

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);


        System.out.println(lhs);

        //�ص��ԭ��
        //���򣬲��ظ���������
        //�ײ���ڹ�ϣ��ʹ��˫�����¼���˳��

        //�Ժ�Ҫ����ȥ��ʹ���ĸ�
        //Ĭ��ʹ��HashSet�����Ҫȥȥ���������ȡ����ʹ��LinkedHashSet
    }
}
