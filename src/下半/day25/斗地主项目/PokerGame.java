package �°�.day25.��������Ŀ;

import java.util.ArrayList;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();
    //׼����
    //˼�룺��̬�����
    //�ص㣺������ļ��ض����أ�����ִֻ��һ��
    static {
        String[] color = {"?","?","?","?"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //�����õ�ÿһ����ɫ
        for (String c : color) {
            //�����õ�ÿһ������
            for (String n : number) {
                //����ɫ��������ӵ�������
                list.add(c+n);
            }
        }
        list.add("С��");
        list.add("С��");
    }



    public PokerGame(){
        System.out.println(list);
        //ϴ��

        //����

        //����
    }
}
