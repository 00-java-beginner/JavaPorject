package �ϰ�.day9.p94andp95_��Ӻͱ���;

public class Test2 {
    public static void main(String[] args) {
        //1.��������
        Student[] arr = new Student[3];
        //2.����ѧ��������ӵ����鵱��
        Student stu1 = new Student(001, "����", 18);
        Student stu2 = new Student(002, "����", 20);
        Student stu3 = new Student(003, "����", 22);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //Ҫ��5:��ѯ����idΪ��002����ѧ����������ڣ�����������+1��*/
        //3.��Ҫ�ҵ�idΪ002��ѧ����Ӧ������
        int index = getIndex(arr,004);
        //4.�ж�����
        if (index >= 0){
            //������ڣ�����������+1��
            //�Ȼ�ȡ��ǰѧ��������
            Student stu = arr[index];
            //����������ȡѧ��������
            int newAge = stu.getAge() + 1;
            //���޸ĺ����������set��������
            stu.setAge(newAge);
            //ѭ������
            printArr(arr);
        }else {
            System.out.println("��ǰid�����ڣ��޷��޸�");
        }
    }
    public static int getIndex(Student[] arr , int id){
        for (int i = 0; i < arr.length; i++) {
            //���εõ�ÿһ��ѧ������
            Student stu = arr[i];
            //��stu��һ���ǿ��ж�
            if (stu != null){
                int sid = stu.getId();
                if (sid == id){
                    return i;
                }
            }
        }
        //��ѭ��������û���ҵ��ͱ�ʾ�����ڣ�����û��-1������������Է���-1
        return -1;
    }
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }
}
