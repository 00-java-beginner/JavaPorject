package �ϰ�.day21.���������㷨;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        /*������ϰ1:
          ����:����һ���������û������ң���ѯĳ��Ԫ���������е�����
          Ҫ��:����Ҫ����������Ԫ���Ƿ��ظ�
        */
        int [] arr1 = {1,2,3,4,5,6,1,8};
        int number1 = 1;
        System.out.println(basicSearch1(arr1, number1));


        /*������ϰ2:
          ����:����һ���������û������ң���ѯĳ��Ԫ���������е�����
          Ҫ��:��Ҫ����������Ԫ�����ظ��Ŀ�����
        */
        int [] arr2 = {1,2,3,4,5,6,1,8};
        int number2 = 1;
        System.out.println(basicSearch2(arr2, number2));
    }


    //1.��ѯĳ��Ԫ���������е�����������Ҫ����������Ԫ�����ظ��Ŀ����ԣ�
    public static int basicSearch1(int [] arr , int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    //2.��ѯĳ��Ԫ���������е���������Ҫ����������Ԫ�����ظ��Ŀ����ԣ�
    //ע�⣺���ض��ʱ���Խ����ݷŵ��б���߼������ڽ��з���
    public static List<Integer> basicSearch2(int [] arr , int number){
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}
