package �ϰ�.day10;

public class p110_test3 {
    public static void main(String[] args) {
        //���������ַ������������ǵĳ˻�
        String num1 = "12345";
        String num2 = "23456";
        //1.��num1��num2���int����
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            number1 = (number1*10) + (arr1[i] - 48);
        }
        for (int i = 0; i < arr2.length; i++) {
            number2 = (number2*10) + (arr2[i] - 48);
        }
        //2.���
        int number3 = number1 * number2;

        //3.����˺�Ľ��ת�����ַ���
        String str = number3 + "";
        System.out.println(str);


    }

}
