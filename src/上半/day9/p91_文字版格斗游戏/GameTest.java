package �ϰ�.day9.p91_���ְ����Ϸ;
public class GameTest {
    public static void main(String[] args) {
        //1.����������ɫ
        Role r1 = new Role("�Ƿ�" , 100,'��');
        Role r2 = new Role("�Ħ��" , 100,'��');
        r1.showRoleInfo();
        r2.showRoleInfo();
        //2.��ʼ�񶷣��غ�����Ϸ
        while (true){
            //r1��ʼ����r2
            r1.attack(r2);
            //�ж�r2ʣ���Ѫ��
            if (r2.getBlood() == 0 ){
                System.out.println(r1.getName() + "K.O��" + r2.getName());
                break;
            }
            //r2��ʼ����r1
            r2.attack(r1);
            //�ж�r1ʣ���Ѫ��
            if (r1.getBlood() == 0 ) {
                System.out.println(r2.getName() + "K.O��" + r1.getName());
                break;
            }
        }
    }
}
