/*
package �ϰ�.day11;

import java.util.ArrayList;

public class p114_�����û��Ƿ���� {
    public static void main(String[] args) {
        //1.����һ������
        ArrayList<User> list = new ArrayList<>();
        //2.��������
        User u1 = new User("001","zhangsan","123456");
        User u2 = new User("002","lisi","12345678");
        User u3 = new User("003","wangwu","123456qwe");
        //3.���Ԫ�ص�������
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //4.���÷���
        boolean flag = contains(list,"001");
        System.out.println(flag);
        //5.��������
        int index = getIndex(list,"001");
        System.out.println(index);
    }
    //���巽����ѯid�Ƿ����
    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            //�Ȼ�ȡ�û�����
            User u = list.get(i);
            //��ȡ�û����������id
            String uid = u.getId();
            //�����ж�
            if (uid.equals(id)){
                return true;
            }
        }
        return false;
    }
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return i;
            }
        }
        return -1;
    }






}
*/
