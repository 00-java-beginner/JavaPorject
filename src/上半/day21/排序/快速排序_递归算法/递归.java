package �ϰ�.day21.����.��������_�ݹ��㷨;

public class �ݹ� {
    public static void main(String[] args) {
        //��1-100֮��ĺ�
        System.out.println(getSum(100));
        System.out.println(getJc(5));
    }
    public static int getSum(int number){
        //ֻ�е�����������ʱ��Ż�����ݹ�
        //ֻҪ�����������ͻ�����ݹ�
        if (number == 1){
            return 1;
        }
        //���ڷ����ڵ������������Դ����˵ݹ�
        return number + getSum(number - 1);
    }
    public static int getJc(int number){
        if (number == 1){
            return 1;
        }
        return number * getJc(number - 1);
    }
}
