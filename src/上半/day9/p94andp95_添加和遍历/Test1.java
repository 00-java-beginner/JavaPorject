package �ϰ�.day9.p94andp95_��Ӻͱ���;
public class Test1 {
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
        //3.Ҫ��3:ͨ��idɾ��ѧ����Ϣ
        //Ҫ�ҵ�id������������Ӧ������
        int index = getIndex(arr,001);

        //������ڣ���ɾ��
        if (index >= 0){
            arr[index] = null;
            //Ҫ��4:ɾ�����֮�󣬱�������ѧ����Ϣ��
            printArr(arr);
        }else {
            //��������ڣ�����ʾɾ��ʧ�ܡ�
            System.out.println("��ǰ���������ڣ�ɾ��ʧ��");
        }
    }
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }
    //1.Ҫ���  ������
    //2.��Ҫʲô�� �����id
    //�Ƿ���Ҫ���ã���Ҫ
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
}
