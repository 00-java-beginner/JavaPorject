package �ϰ�.day13.����������_02_01;
import java.util.ArrayList;
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("����",28,"��");
        Student stu2 = new Student("����",24,"��");
        Student stu3 = new Student("����",26,"��");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int ageMax = StudentUtil.getAgeMax(list);
        System.out.println(ageMax);
    }
}
