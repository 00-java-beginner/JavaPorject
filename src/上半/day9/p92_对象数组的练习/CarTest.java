package �ϰ�.day9.p92_�����������ϰ;
import java.util.Scanner;
public class CarTest {
    public static void main(String[] args) {
        //1.��������
        Car[] arr = new Car[3];
        //2.��������,�������Լ���¼��
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //ע��������������������ѭ�����棬��������ֵ�������һ�������ֵ
            //��Ϊÿ��ѭ����û�д����µĶ���ֻ�ǽ����������еĲ����������޸�
            //������Ҫ�������������ѭ�����棬����ÿ��i++��ʱ�򶼻ᴴ��һ���µĶ���
            Car c = new Car();
            System.out.println("������������Ʒ��");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("�����������ļ۸�");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("��������������ɫ");
            String color = sc.next();
            c.setColor(color);
            //3.�����ݸ�ֵ������
            arr[i] = c;
        }
        for (Car car : arr) {
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }

    }
}
