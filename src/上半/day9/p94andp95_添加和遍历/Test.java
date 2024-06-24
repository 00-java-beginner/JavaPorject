package �ϰ�.day9.p94andp95_��Ӻͱ���;
public class Test {
    public static void main(String[] args) {
            /*����һ������Ϊ3�����飬����洢1~3��ѧ��������Ϊ��ʼ���ݣ�ѧ�������ѧ�ţ�����������ͬ��
            ѧ��������:ѧ�ţ����������䡣
            Ҫ��1:�ٴ����һ��ѧ�����󣬲�����ӵ�ʱ�����ѧ�ŵ�Ψһ���жϡ�
            Ҫ��2:������֮�󣬱�������ѧ����Ϣ��
            Ҫ��3:ͨ��idɾ��ѧ����Ϣ
            ������ڣ���ɾ������������ڣ�����ʾɾ��ʧ�ܡ�
            Ҫ��4:ɾ�����֮�󣬱�������ѧ����Ϣ��
            Ҫ��5:��ѯ����idΪ��002����ѧ����������ڣ�����������+1��*/
        //1.��������
        Student[] arr = new Student[3];
        //2.����ѧ��������ӵ����鵱��
        Student stu1 = new Student(001, "����", 18);
        Student stu2 = new Student(002, "����", 20);
        Student stu3 = new Student(003, "����", 22);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //3.Ҫ��1:�ٴ����һ��ѧ�����󣬲�����ӵ�ʱ�����ѧ�ŵ�Ψһ���жϡ�
        //1.��⣺�ٴ����һ��ѧ������
        Student stu4 = new Student(004, "����", 24);
        //2.��⣺Ψһ���ж�
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //���ڣ������
            System.out.println("��ǰid�Ѵ���");
        } else {
            //�����ڣ����  �����������
            //1.�������� --- ��Ҫ����һ���µ����飬������������+1
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //Ҫ��2:������֮�󣬱�������ѧ����Ϣ��
                printArr(newArr);
            } else {
                //2.����δ�� --- ֱ�����
                //����getCount��ȡ�������������Ѿ��м���Ԫ�ش���
                //���Կ���ֱ�ӽ�count�����������и�ֵ����Ϊ�����Ǵ�0��ʼ�ģ�����ֱ�ӵ���
                arr[count] = stu4;
                //Ҫ��2:������֮�󣬱�������ѧ����Ϣ��
                printArr(arr);
            }
        }
    }

    //����һ����������������ѧ����Ϣ
    public static void printArr(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    //����һ�����飬���������µ����飬����Ϊ������+1
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //ѭ�������õ�������
        //�������鸳ֵ��������
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        //����������
        return newArr;
    }

    //���巽���������Ƿ���������ж�
    public static int getCount(Student[] arr) {
        int count = 0;
        for (Student student : arr) {
            //��������ĳ�ʼ��Ĭ��ֵΪnull��������ֻ��Ҫ���������Ƿ����null�����жϾͿ��Եõ������Ƿ����
            if (student != null) {
                count++;
            }
        }
        return count;
    }

    //���巽����ѧ�Ž����ж�  �ж���Ҫ�������id
    public static boolean contains(Student[] arr, int id) {
        //1.����ѭ���ȵõ������е�Ԫ��
        for (Student stu : arr) {
            //2.�������л�ȡ����Ԫ�ظ�ֵ���µı���
            //3.��ȡ�����е�id
            //ע�⣺�������������δ�����ģ������ᵼ��stu��ȡ��null
            //����null�ǲ���ȥ���÷����ģ�������Ҫ��stu����һ���ǿ��жϣ��������ᱨ��
            if (stu != null) {
                int sid = stu.getId();
                //4.��ѧ�Ž���Ψһ���ж�
                if (sid == id) {
                    return true;
                }
            }

        }
        //ע�⣺���ܽ�falseд��ѭ�����棬����д��ѭ�����棬
        //ѭ����ȫ������û��һ���Ĳſ��Է���false����ʾ��ǰid�������в�����
        return false;
    }
}
