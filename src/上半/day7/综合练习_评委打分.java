package �ϰ�.day7;

import java.util.Scanner;

public class �ۺ���ϰ_��ί��� {
    public static void main(String[] args) {
        //�����ڳ�������У���6����ί��ѡ�ִ�֣�������Χ��[0-100]֮���������
        //ѡ�ֵ����÷�Ϊ:ȥ����5�߷֡���ͷֺ��4����ί��ƽ���֣�������������̲������ѡ�ֵĵ÷֡�
        //1.����һ�������¼������������Χ��0-100
        int[] scoresarr = getscores();
        for (int i = 0; i < scoresarr.length; i++) {
            System.out.println(scoresarr[i]);
        }
        //2.�����ֵ
        int max = getMax(scoresarr);
        //3.����Сֵ
        int min = getMin(scoresarr);
        //4.��������ܺ�
        int sum = getSum(scoresarr);
        //5.��ƽ����
        int avg = (sum - max - min) / (scoresarr.length - 2);
        System.out.println(avg);
    }

    //1.��������
    public static int[] getscores() {
        int[] scores = new int[6];
        //ͨ������¼�����ʽ������0-100
        Scanner sc = new Scanner(System.in);
        //ͨ��ѭ��������¼������ݸ�ֵ������scores
        for (int i = 0; i < scores.length; ) {
            System.out.println("�������������");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                //��ѭ������i++���������ж��ڷ�ֹ�������غ����ѭ��
                i++;
            }
        }
        return scores;
    }

    //2.�����ֵ
    public static int getMax(int[] scoresarr) {
        int max = scoresarr[0];
        for (int i = 0; i < scoresarr.length; i++) {
            if (scoresarr[i] > max) {
                max = scoresarr[i];
            }
        }
        return max;

    }

    //3.����Сֵ
    public static int getMin(int[] scoresarr) {
        int min = scoresarr[0];
        for (int i = 0; i < scoresarr.length; i++) {
            if (scoresarr[i] < min) {
                min = scoresarr[i];
            }
        }
        return min;
    }

    //4.��������ܺ�
    public static int getSum(int[] scoresarr) {
        int sum = 0;
        for (int i = 0; i < scoresarr.length; i++) {
            sum = sum + scoresarr[i];
        }
        return sum;
    }

}
