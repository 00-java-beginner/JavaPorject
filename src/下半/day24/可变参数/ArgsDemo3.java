package �°�.day24.�ɱ����;

public class ArgsDemo3 {
    public static void main(String[] args) {
        //JDK5
        //�ɱ����
        //�����βεĸ����ǿ��Է����仯�ģ�0 1 2 3 ...
        //��ʽ����������...����
        //int...args

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }

    //�ײ㣺
    //�ɱ�����ײ����һ������
    //ֻ��������Ҫ�����Լ������ˣ�Java������Ǵ�����
    public static int getSum(int...args){
        //System.out.println(args);//[I@119d7047
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}
