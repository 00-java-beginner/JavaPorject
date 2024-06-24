package �ϰ�.day13.����������_02_01;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){};
    public static int getAgeMax(ArrayList<Student> list){
        //����һ��������
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if (age > max){
                max = age;
            }
        }
        return max;
    }
}
