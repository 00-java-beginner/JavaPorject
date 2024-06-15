package 上半.day11;

import java.util.ArrayList;

public class p113_添加学生对象并遍历 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.添加对象元素
        Student s1 = new Student("zhangsan" , 22);
        Student s2 = new Student("lisi" , 24);
        Student s3 = new Student("wangwu" , 26);
        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //4.循环打印
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
