package �ϰ�.day13.����������_02;
public class ArrayUtil {
    private ArrayUtil(){};
    //���������ƴ��
    public static String printArr(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    //��ƽ����
    public static double getAvg(double [] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum / arr.length;
    }
}
