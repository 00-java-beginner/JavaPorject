package p96andp110_�ַ���;

public class p109_�����ַ��������ݲ��Ƚ� {
    public static void main(String[] args) {
        //1.���������ַ���
        String str1 = "abcde";
        String str2 = "cdeab";

        //2.���÷�����ת�ַ���
        boolean result = check(str1, str2);

        //3.���
        System.out.println(result);
    }
    //����һ��������ת�ַ���
    //�вΣ���תǰ���ַ���
    //����ֵ����ת����ַ���
    public static String rotate(String str) {
        //��һ�ַ�������substring���н�ȡ������ߵĽ�ȡ��ƴ�ӵ��Ҳ�
        //��ȡ����ߵ�
        char first = str.charAt(0);
        //��ȡʣ�µ�
        String end = str.substring(1);
        //����ƴ�Ӳ�����
        return end + first;
    }
    //����һ����������ѭ����ת���Ƚ�
    public static boolean check(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            //1.������ת
            str1 = rotate1(str1);
            //2.���бȽ�
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;
    }
    public static String rotate1(String str) {
        //�ڶ��ַ��������ַ����ȱ��һ�����飬Ȼ����������е����ݣ��ٰ������һ���ַ���
        char[] arr = str.toCharArray();
        //1.�õ�0������ֵ
        char first = arr[0];
        //2.��ʣ���ַ���ǰŲһλ
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //3.��ԭ���������ŵ����
        arr[arr.length - 1] = first;

        //4.������ת�����ַ���
        String result = new String(arr);
        return result;
    }
}
