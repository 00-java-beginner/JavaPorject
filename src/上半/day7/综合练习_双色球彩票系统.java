package �ϰ�.day7;

import java.util.Random;
import java.util.Scanner;

public class �ۺ���ϰ_˫ɫ���Ʊϵͳ {
    public static void main(String[] args) {
        //1.�����н�����
        int[] arr = createNumber();

        //2.�û������Ʊ����
        int[] userInputArr = userInputNumber();
        //3.�ж��û����н����
        int redConut = 0;
        int blueConut = 0;
        //4.�жϺ�����н����
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == redNumber) {
                    redConut++;
                    //����ҵ����û�����ĺ���������н����������������ѭ����������ѭ���ж���һ��
                    break;
                }
            }
        }
        //5.�ж�������н����
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueConut++;
        }
        //6.���ݺ��������ĸ����ж��н����
        if (redConut == 6 && blueConut == 1) {
            System.out.println("�н�1000��");
        } else if (redConut == 6 && blueConut == 0) {
            System.out.println("�н�500��");
        } else if (redConut == 5 && blueConut == 1) {
            System.out.println("�н�300��");
        } else if ((redConut == 5 && blueConut == 0) || (redConut == 4 && blueConut == 1)) {
            System.out.println("�н�100��");
        } else if ((redConut == 4 && blueConut == 0) ||
                (redConut == 3 && blueConut == 1) || (redConut == 2 && blueConut == 1)) {
            System.out.println("�н�50��");
        } else if ((redConut == 1 && blueConut == 1) || (redConut == 0 && blueConut == 1)) {
            System.out.println("�н�10��");
        } else {
            System.out.println("û���н���лл����");
        }
    }

    public static int[] userInputNumber() {
        //1.��������洢�û�����Ĳ�Ʊ����
        int arr[] = new int[7];
        //2.����¼�����û�����
        Scanner sc = new Scanner(System.in);
        //3.���û�����������,��������벻�ܳ�����Χ���Ҿ���Ψһ�ԣ�
        for (int i = 0; i < 6; ) {
            System.out.println("�������" + (i + 1) + "���������");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                //��ʾ�ڷ�Χ������¼��
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    //��ʾ��ǰ¼��ĺ��벻���ڣ���ӽ�����
                    arr[i] = redNumber;
                    //�ɹ���Ӻ�������������
                    i++;
                } else {
                    System.out.println("��ǰ��������Ѿ����ڣ�����������");
                }
            } else {
                System.out.println("��ǰ¼��ĺ�����볬���˷�Χ");
            }
        }
        //4.���û������������
        System.out.println("�������������");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                //ֻ��������ȷ��Χ�ĺ���Ż����ѭ��
                break;
            } else {
                System.out.println("��ǰ¼���������볬���˷�Χ");
            }
        }
        //5.��������
        return arr;
    }

    public static int[] createNumber() {
        //1.����������������н�����,��������һ������
        int[] arr = new int[7];
        //2.������ɺ��벢��ӵ����鵱�У��������ظ�����������ظ�
        Random r = new Random();
        //���ɺ�����벢��ӵ����鵱��
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;//��Χ��1-33
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                //ֻ����ӳɹ��������Ż�����
                i++;
            }
        }
        //����������벢��ӵ����鵱��
        int blueNumber = r.nextInt(16) + 1;//��Χ��1-16
        arr[arr.length - 1] = blueNumber;
        //������ɺ󷵻�����
        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

}
