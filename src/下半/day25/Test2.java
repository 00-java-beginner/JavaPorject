package �°�.day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //�������⣬Ҫ������7��Ů��3
        //1.��������洢����
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);

        //2.�����������ȡ�����е��������
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);

        //3.��������洢��Ӧ������
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"����","����","����","����","����","�κӷ�","÷�ķ�");
        Collections.addAll(girlList,"С��Ů","������","����","Сҽ��");

        //4.�ж�number��������1����0�������ͬ�Ľ��
        if (number == 1){
            int boyIndex = r.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }else {
            int girlIndex = r.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }
    }
}
