package �ϰ�.day9.p92_�����������ϰ;

public class GoodsTest {
    public static void main(String[] args) {
        //1.����һ������
        Goods[] arr = new Goods[3];
        //2.��������
        Goods g1 = new Goods("001","����з",1999.0,10);
        Goods g2 = new Goods("002","��ʿ����Ϻ",999.0,20);
        Goods g3 = new Goods("003","�䱦з",599.0,30);
        //3.����Ʒ��ӵ�������
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //4.��ӡ����
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
