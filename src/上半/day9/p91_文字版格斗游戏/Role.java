package �ϰ�.day9.p91_���ְ����Ϸ;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"˧��","Ӣ��","����"};
    String[] girlfaces = {"����","Ư��","��ɧ"};
    String[] attacks_desc = {
            "%sʹ����һ�С����Ķ�����%s��������",
            "%sʹ����һ�С���ɽ��Ӱ�š���%s��������",
            "%sʹ����һ�С�����ʮ���ơ���%s��������"
    };
    String[] injureds_desc = {
            "���%s���˰벽����������",
            "���%s�����ɣ���������",
            "���%s���˼�������������"
    };
    public Role() {
    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //�漴����
        setFace(gender);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public void attack(Role role){
        Random r = new Random();
        //���������Ч��
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        System.out.printf(KungFu,this.getName(),role.getName());
        //����printf���ỻ�У�Ϊ�˴����Ķ�����Ҫ����println���л���
        System.out.println();
        //1.������ɵ��˺�
        int hurt = r.nextInt(20) + 1;
        //2.����ʣ��Ѫ��
        int remainBlood = role.getBlood() - hurt;
        //3.��ʣ��Ѫ����һ����֤�����Ϊ���������޸�Ϊ0
        remainBlood = Math.max(remainBlood, 0);
        //4.�޸�һ�°�����˵�Ѫ��
        role.setBlood(remainBlood);
        //���˵�����
        //Ѫ������90 0����������
        //Ѫ������50 1����������
        //Ѫ��С��20 2����������
        if (remainBlood > 80){
            System.out.printf(injureds_desc[0],role.getName());
        }else if (remainBlood > 50){
            System.out.printf(injureds_desc[1],role.getName());
        }else {
            System.out.printf(injureds_desc[2],role.getName());
        }
        //����printf���ỻ�У�Ϊ�˴����Ķ�����Ҫ����println���л���
        System.out.println();
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getFace() {
        return face;
    }
    public void setFace(char gender) {
        //�жϴ�������л���Ů
        //�������
        Random r = new Random();
        if (gender =='��'){
            //��������
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if (gender == 'Ů'){
            //����Ů��
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "��Ŀ����";
        }
    }
    //չʾ���н�ɫ����Ϣ
    public void showRoleInfo(){
        System.out.println("����Ϊ" + getName());
        System.out.println("Ѫ��Ϊ" + getBlood());
        System.out.println("�Ա�Ϊ" + getGender());
        System.out.println("����Ϊ" + getFace());
    }
}
