package �ϰ�.day18_day19.five_object;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // protected object clone(int a) �����¡

        //1.�ȴ���һ������
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);

        //2.��¡����
        //ϸ��:
        //�����ڵײ������Ǵ���һ������,����ԭ�����е����ݿ�����ȥ��
        //��дϸ��:
        //1.��дObject�е�clone����
        //2.��javabean��ʵ��Cloneable�ӿ�
        //3.����ԭ���󲢵���clone�Ϳ�����
        //User u2 =(User)u1.clone();

        //��֤һ�����飺Object�еĿ�¡��ǳ��¡
        //��Ҫ�������¡������Ҫ��дclone�������޸�����ķ�����
        //int[] arr = u1.getData();
        //arr[0] = 100;

        //System.out.println(u1);
        //System.out.println(u2);


        //�Ժ�һ����õ��������߽��п�¡
        //1.������д�Ĵ��뵼�뵽��Ŀ��
        //2.��д����
        //Gson gson =new Gson();
        //�Ѷ�����һ���ַ���
        //String s=gson.toJson(u1);
        //�ٰ��ַ�����ض���Ϳ�����
        //User user =gson.fromJson(s, User.class);

        //int[] arr=u1.getData();
        //arr[0] = 100;

        //��ӡ����
        //System.out.println(user);




    }
}
