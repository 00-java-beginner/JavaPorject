package �ϰ�.day10;

public class p110_test4 {
    public static void main(String[] args) {
        //����һ���ַ����������ɵ�����ɣ������ַ��������һ�����ʵĳ���
        String str = "Hello World";
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' '){
                break;
            }else {
                count++;
            }
        }
        System.out.println(count);


    }

}
