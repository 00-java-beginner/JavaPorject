package p96andp110_�ַ���;
public class p102_02_�ַ����ķ�ת {
    public static void main(String[] args) {
        //����һ������,ʵ���ַ�����ת��
        //����¼��һ���ַ���,���ø÷�����,�ڿ���̨������
        String result = reverser("abc");
        System.out.println(result);
    }
    public static String reverser(String str){
        //��ǰѭ����ʾ����ѭ��
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
