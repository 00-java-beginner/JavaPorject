package �ϰ�.day6;

public class ����_04_������ֵ�Ķ���͵��� {
    /*
    public static void main(String[] args) {
        //������ֵ�ķ������õķ�ʽ������
        //1.ֱ�ӵ��ã�������();
        //2.��ֵ���ã��������� ���� = ������();
        //3.������ã�System.out.println(������());
        System.out.println(getsum(1,2,3));
    }
    public static int getsum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }

     */
    public static void main(String[] args) {
        double area1 = getArea(1.3, 2.6);
        double area2 = getArea(5.5, 6.6);
        if (area1 > area2) {
            System.out.println("��һ�������");
        } else {
            System.out.println("�ڶ��������");
        }
    }

    public static double getArea(double len, double width) {
        double area = len * width;
        return area;
    }
}
