package �ϰ�.day22.���϶���ӿ�collection;

import java.util.ArrayList;
import java.util.Collection;

public class A06_CollectionDemo6 {
    public static void main(String[] args) {
       /* Collectionϵ�м�������ͨ�õı�����ʽ��
        1.����������
        2.��ǿfor����
        3.lambda���ʽ����

        ��ǿfor��ʽ��
            for(�������� ������: ����/����){

            }

        �������ɷ�ʽ��
            ���ϵ����� + for �س�

        */


        //1.�������ϲ����Ԫ��
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.������ǿfor���б���
        //ע��㣺
        //s��ʵ����һ����������������ѭ���Ĺ��������α�ʾ�����е�ÿһ������
        for(String s : coll){
            s = "qqq";
        }

        System.out.println(coll);//zhangsan lisi wangwu





    }
}
