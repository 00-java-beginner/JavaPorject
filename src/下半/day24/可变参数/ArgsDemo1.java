package �°�.day24.�ɱ����;

public class ArgsDemo1 {
    public static void main(String[] args) {
       /*
        ������Ҫ����һ��������ͣ��÷����������������������
        ����2�����ݵĺ�
        ����3�����ݵĺ�
        ����4�����ݵĺ�
        ����n�����ݵĺ�
       */

        System.out.println(getSum(10,20));
        System.out.println(getSum(10,20,30));
        System.out.println(getSum(10,20,30,40));


    }


    //����2�����ݵĺ�
    public static int getSum(int a, int b) {
        return a + b;
    }

    //����3�����ݵĺ�
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    //����4�����ݵĺ�
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }


}
