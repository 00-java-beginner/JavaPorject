package �ϰ�.day21.����.��������;

public class Insert {
    public static void main(String[] args) {
        //��������
        int[] arr = {1, 6, 8, 12, 4, 22, 55, 11, 18, 43, 99, 66, 100, 88};
        //1.�ҵ��������һ��������Ǵ��Ŀ�ʼ��
        //����һ��������¼��ʼ������
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                //һ���ж�����������ǰi�����ұߵ�������������ʼ��������������Ҫ+1
                startIndex = i + 1;
                //�õ�����ʼ��������û�б�Ҫ����ѭ���ж��ˣ�ֱ�ӽ�������
                break;
            }
        }
        //2.�������飬�õ�����ʼ���������������
        for (int i = startIndex; i < arr.length; i++) {
            //�������������ݣ����뵽ǰ���������һ�鵱��
            //����һ��������¼i��ֵ�����ڽ���λ����Ҫ����ѭ���ж�
            //�������¼i��ֵ��i��ֵ������while�жϵĳ����������仯
            int j = i;
            //˼����ʲô�����������Ҫ����λ��
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
