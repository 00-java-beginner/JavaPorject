package �ϰ�.day8.�������1_10_p81_90;
public class cp {
    //��������
    private String food;
    private int price;
    public void setFood(String food) {
        //this�ؼ��ֵ����ã����Խ��ֲ������ͳ�Ա������ȡֵ��Χ��������
        //�Ⱥ���߼���this�����ã���ʾ�ұߵı���ȡֵ��ΧΪ�ͽ�ԭ�򲻱�
        //��ߵ������ǶԳ�Ա����ȡֵ���������Խ����������ȡ�����
        this.food = food;
    }
    public String getFood() {
        return food;
    }
    public void setPrice(int price) {
        if (price >= 0 && price <= 88) {
            this.price = price;
        } else {
            System.out.println("�Ƿ�����");
        }
    }
    public int getPrice() {
        return price;
    }

    //������Ϊ
    public void eat() {
        System.out.println("�����ܺó�");
    }
}
