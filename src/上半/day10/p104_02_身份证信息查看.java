package �ϰ�.day10;
public class p104_02_���֤��Ϣ�鿴 {
    public static void main(String[] args) {
        //1.����һ��������¼���֤
        String id = "522424199507219819";
        //2.��ȡ���֤��7-14λ
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("������ϢΪ��");
        System.out.println("���������գ�" + year + "��" + month + "��" + day + "��");
        //3.��ȡ���֤��17λ
        char gender = id.charAt(16);
        int num = gender - 48;
        if (num % 2 == 0){
            System.out.println("�Ա�Ϊ��Ů");
        }else {
            System.out.println("�Ա�Ϊ����");
        }



    }
}
