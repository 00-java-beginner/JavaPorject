package �ϰ�.day20.�ۺ���ϰ;

public class Test3 {
    public static void main(String[] args) {
        /*����һ�������Լ�ʵ��toBinarystring������Ч������һ��ʮ��������ת���ַ�����ʾ�Ķ����ơ�*/
        System.out.println(toBinarystring(6));
        System.out.println(Integer.toBinaryString(6));

    }
    public static String toBinarystring(int number){
        StringBuilder sb = new StringBuilder();
        //����ѭ�����ϳ���2
        while (true){
            if (number == 0){
                break;
            }
            //��ȡ����
            int remaindar = number % 2;
            //����ƴ��
            sb.insert(0,remaindar);
            //����2
            number = number / 2;
        }
        return sb.toString();
    }
}
