package �ϰ�.day9.p93_��������ۺ���ϰ;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*��������洢4��Ů���ѵĶ���
        Ů���ѵ�����:���������䡢�Ա𡢰���
        Ҫ��1:�������Ů���ѵ�ƽ������
        Ҫ��2:ͳ�������ƽ��ֵ�͵�Ů�����м���?�������ǵ�,������Ϣ��ӡ������*/
        //1.��������洢����
        GirlFriend[] arr = new GirlFriend[4];
        //2.��������
        GirlFriend gf1 = new GirlFriend("С��", 18, "Ů", "�Զ���");
        GirlFriend gf2 = new GirlFriend("С��", 20, "Ů", "����");
        GirlFriend gf3 = new GirlFriend("С��", 22, "Ů", "���");
        GirlFriend gf4 = new GirlFriend("С��", 24, "Ů", "�ϰ�");
        //3.��������ӵ�������
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        //4.�����ƽ������
        //���
        int sum = 0;
        for (GirlFriend gf : arr) {
            sum = sum + gf.getAge();
        }
        int avg = sum / arr.length;
        System.out.println(avg);

        //5.ͳ�������ƽ��ֵ�͵��м���
        int count = 0;
        for (GirlFriend gf : arr) {
            int age = gf.getAge();
            if (avg < age) {
                count++;
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
            }
        }
        System.out.println(count);
    }

}
