package �ϰ�.day13.p128�̳еĹ��췽����this��super�ؼ���;

public class Manager extends Employee {
    private double bouns;

    //�ղι���
    public Manager(){

    }
    //��ȫ����������
    public Manager(String id,String name,double salary,double bouns){
        super(id,name,salary);
        this.bouns = bouns;
    }
    public double getBouns(){
        return bouns;
    }
    public void setBouns(double bouns){
        this.bouns = bouns;
    }
    @Override
    public void work(){
        System.out.println("����������");
    }
}
