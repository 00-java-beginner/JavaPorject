package �ϰ�.day10;
import java.util.Random;
public class p110_test2 {
    public static void main(String[] args) {
        //������֤�룬�����Ǵ�д��Ҳ������Сд��������������
        //���򣺳���Ϊ5����λ��ĸ��һλ���֣����ֿ��Գ���������λ��
        //1.���԰����д�Сд��ĸ����һ��������
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25){
                arr[i] = (char) (97 + i);
            }else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        //2.������������Ĵν���ĸȡ����
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(arr.length);
            result = result + arr[randomIndex];
        }
        //3.����һ���������ƴ���ں��棬������˳��
        int number = r.nextInt(10);
        //4.�������յĽ����ת��������
        result = result + number;
        char[] newArr = result.toCharArray();
        //5.���������е�����
        for (int i = 0; i < newArr.length; i++) {
            //��ȡһ���������
            int index = r.nextInt(newArr.length);
            char temp = newArr[i];
            newArr[i] = newArr[index];
            newArr[index] = temp;
        }
        //6.������ת��Ϊ�ַ���
        String result1 = new String(newArr);
        System.out.println(result1);






    }
}
