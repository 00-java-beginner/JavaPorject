/*
package �ϰ�.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class p113_���ѧ�����󲢱���_1 {
    public static void main(String[] args) {
        //1.��������
        ArrayList<Student> list = new ArrayList<>();
        //2.����¼��
        Scanner sc = new Scanner(System.in);
        //3.�������ѧ������
        for (int i = 0; i < 3; i++) {
            //����ѧ��������Ҫ����ѭ���ڣ���Ȼÿ��ѭ���Ὣ��һ��Ԫ�ظ���
            Student s = new Student();
            System.out.println("������ѧ��������");
            String name = sc.next();
            System.out.println("������ѧ��������");
            int age = sc.nextInt();
            //������¼���������ӵ�ѧ��������
            s.setName(name);
            s.setAge(age);
            //��ѧ��������ӵ�������
            list.add(s);
        }
        //4.�������ϵõ������Ԫ��
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
*/
