package p96andp110_�ַ���;
public class p102_01_�ַ�����ƴ�� {
    public static void main(String[] args) {
        //����һ������,��int�����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ�������,
        //���ø÷���,���ڿ���̨��������
        int [] arr = {1,2,3};
        String str = arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int[] arr){
        //1.�Ƚ���У��
        if (arr == null){
            return "";
        }
        if (arr.length == 0){
            return "[]";
        }
        //2.�������飬��ȡ�����е�Ԫ��
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                result = result + arr[i];
            }else {
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }
}
