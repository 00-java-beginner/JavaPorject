package �ϰ�.day3;

public class ��Ԫ����� {
    public static void main(String[] args) {
        /* ��ʽ��
             ��ϵ���ʽ�����ʽ1�����ʽ2
           ������
             a > b ? a : b;
           �������
             ���ȼ����ϵ���ʽ��ָ
             ���ֵΪtrue�����ʽ1��ֵ����������
             ���ֵΪfalse�����ʽ2��ֵ����������
        */
        int a = 10;
        int b = 20;

        //��ȡ���������еĽϴ�ֵ
        int max6 = a > b ? a : b;
        System.out.println("���ֵΪ" + max6);


//  ����:����԰������ֻ�ϻ�����֪��ֻ�ϻ������طֱ�Ϊ180kg��200kg
//  ���ó���ʵ���ж���ֻ�ϻ��������Ƿ���ͬ��
        int weight1 = 180;
        int weight2 = 200;
//  ����ʹ����Ԫ�����ʵ���ϻ����ص��жϣ�������ͬ������true����֮Ϊfalse
        boolean c = weight1 == weight2 ? true : false;
        System.out.println("���Ϊ" + c);


//  ����:һ��������ס���������У�
//  ��֪���ǵ���߷ֱ�Ϊ150cm.210cm��165m�����ó���ʵ�ֻ�ȡ���������е�������
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
//  ����Ԫ�������ȡǰ�����иߵ��Ǹ���ʱ���������ڸ���һ�����бȽ�
        int max = height1 > height2 ? height1 : height2;
        int maxheight = max > height3 ? max : height3;
        System.out.println("��ߵĺ���Ϊ" + maxheight);

    }
}
