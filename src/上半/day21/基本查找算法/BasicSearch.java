package �ϰ�.day21.���������㷨;

public class BasicSearch {
    public static void main(String[] args) {
        //���󣺶���һ���������û����Ӳ��ң���ѯĳ��Ԫ���Ƿ����
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(basicSearch(arr, 111));
    }
    public static boolean basicSearch(int [] arr , int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }

}
