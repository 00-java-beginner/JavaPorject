package �°�.day25;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Test3 {
    public static void main(String[] args) {
        //Ҫ�󣬱��鵽�����ֲ��ڱ��鵽��ͬʱ���еĶ����һ�����Ҫ�����ڶ���
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"����","����","����","����","����","�κӷ�","÷�ķ�","�ο�ˮ","����ˮ","�Ա�");
        //����һ��������¼����ĳ��ȣ���ֹ��ѭ�����������鳤�ȷ����仯
        int size = list.size();
        //����һ����ʱ����洢��ɾ��������
        ArrayList<String> list2 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            //����ѭ���õ����������е�����
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list.size());
                //����ȡ����������ȡ����
                String name = list.get(index);
                //���鵽�����ݽ���ɾ��
                list.remove(name);
                //ɾ�����������ӵ���ʱ������
                list2.add(name);
                System.out.println(name);
            }
            //ѭ����������ʱ�����е��������´洢��������
            list.addAll(list2);
            //�����ʱ���������
            list2.clear();
        }
        
    }
}
