package �ϰ�.day21.Lambda;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        /*�������鲢�洢һЩ�ַ���������Arrays�е�sort������������Ҫ��:
        �����ַ����ĳ��Ƚ������򣬶̵���ǰ�棬�����ں��档*/

        String[] arr = {"a", "aaaa", "aaa", "aa"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
