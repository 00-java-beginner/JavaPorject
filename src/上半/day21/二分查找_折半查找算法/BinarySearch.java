package �ϰ�.day21.���ֲ���_�۰�����㷨;

public class BinarySearch {
    public static void main(String[] args) {
        //����:����һ���������ö��ֲ��ң���ѯĳ��Ԫ���������е�����
        int[] arr = {10, 44, 88, 101, 155, 200, 388, 418};
        System.out.println(binarySearch(arr, 155));
    }

    public static int binarySearch(int[] arr, int number) {
        //��ʾҪ���ҵķ�Χ
        int max = arr.length - 1;
        int min = 0;
        while (true){
            //��min>maxʱ����ʾ��ǰ������û��������֣�ֱ�ӷ���-1
            if (min > max){
                return -1;
            }
            //mid�����м䷶Χ
            int mid = (max + min) / 2;
            //����midָ���Ԫ�ظ�Ҫ���ҵ�Ԫ�ؽ��бȽ�
            if (arr[mid] > number){
                //1.number��mid�����
                max = mid - 1;
            }else if (arr[mid] < number){
                //2.number��mid���ұ�
                min = mid + 1;
            }else{
                //3.number��midָ���Ԫ��һ��
                return mid;
            }
        }
    }
}
