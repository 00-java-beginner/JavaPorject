package �ϰ�.day21.�ۺ���ϰ;

public class Test3 {
    public static void main(String[] args) {
        //���ӳ���
        System.out.println(getCount(2));
    }

    public static int getCount(int day) {
        //���쳣����Ƚ��д���
        if (day <= 0 || day >= 11) {
            return -1;
        }
        //�ݹ�ĳ���
        //������Ϊ��ʮ���ʱ�򣬱�ʾֻʣ�������һ����
        if (day == 10) {
            return 1;
        }
        //�ݹ���ɣ�ÿ��Ե����ӵ��ں�һ��Ե�+1�ٳ�2
        return (getCount(day + 1) + 1) * 2;
    }
}
