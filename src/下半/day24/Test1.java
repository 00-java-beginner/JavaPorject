package �°�.day24;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        //���ĵ㣺HashMap�ļ�λ�������ŵ����Զ��������Ҫ��дhashCode��equals����
        //����Ƚϵ��ǵ�ֵַ�������Ƕ����ڲ�������ֵ
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("xiaohong", 20);
        Student s2 = new Student("xiaobai", 22);
        Student s3 = new Student("xiaolan", 24);
        Student s4 = new Student("xiaolan", 24);

        map.put(s1, "�㶫");
        map.put(s2, "����");
        map.put(s3, "�Ϻ�");
        map.put(s4, "�Ϻ�");

        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
