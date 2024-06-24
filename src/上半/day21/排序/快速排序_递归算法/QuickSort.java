package �ϰ�.day21.����.��������_�ݹ��㷨;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        //��������������¼Ҫ���ҵķ�Χ
        //��ʼ����Ϊ0
        int start = i;
        //��������Ϊ���鳤��-1
        int end = j;

        //���ݹ����ó��ڣ�ֻ�е�start����endʱ���ݹ�Ż����ִ��
        if (start > end) {
            return;
        }

        //��¼��׼��
        int baseNumber = arr[i];

        //����ѭ���ҵ�Ҫ���������֣�ֻ�п�ʼ�ͽ������������ʱ��ִ�У����ʱ������
        while (start != end) {
            //1.����end���Ӻ���ǰ�ұȻ�׼��С������
            while (true) {
                //end <= start����ʾ��ʱstart��������end�������ұߣ��������ұߵ������Ѿ�ȫ��ѭ���ж����
                //arr[end] < baseNumber����ʾ��ǰ�����е�����С�ڼ�¼�Ļ�׼������ʱ�Ϳ���֤����С�������Ѿ������
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                //��ѭ��û�н��뵽ifʱ����ʾif�������������㣬��ʱ�����ܽ���ѭ��
                //����end�Ǵ��ұ߿�ʼ�Ӻ���ǰ��������Ҫÿ���Լ�һ�Σ�ֱ������ifʱbreak����ѭ��
                end--;
            }
            //2.����start����ǰ�����ұȻ�׼���������
            while (true) {
                //end <= start����ʾ��ʱstart��������end�������ұߣ��������ұߵ������Ѿ�ȫ��ѭ���ж����
                //arr[start] > baseNumber����ʾ��ǰ�����е����ִ��ڼ�¼�Ļ�׼������ʱ�Ϳ���֤���ϴ�������Ѿ����ұ�
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                //��ѭ��û�н��뵽ifʱ����ʾif�������������㣬��ʱ�����ܽ���ѭ��
                //����start�Ǵ���߿�ʼ��ǰ����������Ҫÿ������һ�Σ�ֱ������ifʱbreak����ѭ��
                start++;
            }
            //3.��end��startִ�е�Ԫ�ؽ��н���
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //����ѭ���������ʾstart��endָ���Ԫ����ͬһ������ʱѭ������
        //��ʾ�Ѿ��ҵ��˴�ʱ��׼��Ӧ�ô��������е�λ��
        //��ʱ���ſ�ʼ�����ָ�start��end����һ�����н������ɣ���ʱstart��endָ���Ԫ����ͬһ��������Ҫ���֣�
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //ȷ��6��ߵķ�Χ���ظ�ǰ��Ĳ���
        //������iΪһ��ʼ���ݵ�ֵ��0
        //jΪstart-1����ʾ����������ݣ�������������Ҫ-1����
        quickSort(arr, i, start - 1);
        //ȷ��6�ұߵķ�Χ���ظ�ǰ��Ĳ���
        //������i����������ݣ�����start�ǻ�׼������������Ҫ+1��ʼ
        //jΪһ��ʼ���ݵ�ֵ��arr.length - 1
        quickSort(arr, start + 1, j);
    }
}
