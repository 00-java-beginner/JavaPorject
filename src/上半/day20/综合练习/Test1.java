package �ϰ�.day20.�ۺ���ϰ;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*����¼��һЩ1~100֮�������������ӵ�������ֱ���������������ݺͳ���200Ϊֹ��*/
        //1.����һ�����������������
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("������1-100֮�������");
            String numStr = sc.nextLine();
            //������¼�������ת����int���ͽ��м���
            int num = Integer.parseInt(numStr);
            //���쳣��ս����ж�
            if (num < 1 || num >100 ){
                System.out.println("��������ֲ��Ϸ�������������");
                continue;
            }
            //��ת�����������ӵ�������
            //list.add(Integer.valueOf(num));
            //�߰汾jdk�������Զ�װ�䣬����Ҫת������
            list.add(num);
            //ͳ�Ƽ����е����ݺ�
            int sum = getSum(list);
            //��sum�����ж�
            if (sum > 200){
                break;
            }
        }
        System.out.println(list);
    }
    //�Լ����е����ݽ����ۼ�
    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            sum = sum + num;
        }
        return sum;
    }
}
