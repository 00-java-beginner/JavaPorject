package �°�.day24;

import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
        //Ҫ��:����ѧ��������������У�����һ��������������ĸ���У�ͬ����������Ϊͬһ���ˡ�
        TreeMap<Student,String> tm = new TreeMap<>();
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",26);
        Student s3 = new Student("wangwu",24);
        tm.put(s1,"�㽭");
        tm.put(s2,"�㶫");
        tm.put(s3,"����");
        System.out.println(tm);
    }
}
