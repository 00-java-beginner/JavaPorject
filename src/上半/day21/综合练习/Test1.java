package �ϰ�.day21.�ۺ���ϰ;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("xiaohong",22,165.3);
        GirlFriend gf2 = new GirlFriend("xiaobai",20,150.2);
        GirlFriend gf3 = new GirlFriend("xiaolan",24,175.6);

        GirlFriend [] arr = {gf1,gf2,gf3};
        //��������Ĵ�С������������һ������������������һ��������������ĸ��������
        Arrays.sort(arr, ( o1, o2) -> {
            //1.����һ����������¼����������ֵ�����ں����ж�
            double temp = o1.getAge() - o2.getAge();
            //���temp��ֵ������0��ִ��?��������ݣ���ʾ����������󲻵���0����ôtempά�ֲ���
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if (temp > 0){
                return 1;
            }else if (temp < 0){
                return -1;
            }else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
