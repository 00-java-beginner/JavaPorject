import java.util.Random;

public class p78_�ۺ���ϰ_�齱 {
    public static void main(String[] args) {
        //1.��������
        int[] arr = {88, 888, 8888, 88888, 888888};
        //2.����һ���µ�������������
        int [] newArr = new int [arr.length];
        //3.�齱
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            //��ȡ�������
            int randomIndex = r.nextInt(arr.length);
            //��ȡ����
            int prize = arr[randomIndex];
            //�жϽ����Ƿ���ڣ�������������³�ȡ��������������Ч����
            if(!(contains(newArr,prize))){
                //�ѳ�ȡ���Ľ���ŵ�newArr����
                newArr[i] = prize;
                i++;//�����Ϻ��ƶ�����
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    //���巽���ж�prize�����鵱���Ƿ����,���ڷ���true  �����ڷ���false
    public static boolean contains(int [] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize){
                return true;
            }
        }
        return false;


    }
}
