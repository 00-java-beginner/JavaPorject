package �ϰ�.day18_day19.one_Math;

public class Test {
  public static void main(String[] args) {
    //1.abs:��ȡ��������ֵ
    System.out.println(Math.abs(-88));
    //1.1����abs����-2147483648����bug�����Կ�����absExact�׳��쳣
    //System.out.println(Math.absExact(-2147483648));

    //2.ceil:��һ������������������һ
    System.out.println(Math.ceil(12.5));
    System.out.println(Math.ceil(-12.5));

    //3.floor:ȥβ��
    System.out.println(Math.floor(12.5));
    System.out.println(Math.floor(-12.5));

    //4.round:��������
    System.out.println(Math.round(12.4));
    System.out.println(Math.round(-12.6));

    //5.max:��ȡ���������ϴ�ֵ
    System.out.println(Math.max(1,2));

    //6.min:��ȡ���������ϴ�ֵ
    System.out.println(Math.min(1,2));

    //7.pow:��ȡa��b����
    System.out.println(Math.pow(8, 2));

    //8.sqrt:��ƽ��
    System.out.println(Math.sqrt(4));

    //9.cbrt:������
    System.out.println(Math.cbrt(8));

    //10.random:���������Χ0-1��
    //��ȡʮ��1-100֮��������
    for (int i = 0; i < 10; i++) {
      System.out.println(Math.floor(Math.random()*100)+1);
    }

  }
}
