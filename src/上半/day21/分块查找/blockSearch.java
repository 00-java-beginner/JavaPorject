package �ϰ�.day21.�ֿ����;

public class blockSearch {
    public static void main(String[] args) {
        /*�ֿ���Һ���˼��:�������򣬿������
          ʵ�ֲ��裺1.��������blockArr���ÿһ����������Ϣ
                  2.�Ȳ���blockArrȷ��Ҫ���ҵ�����������һ��3.�ٵ���������һ�����ݼ���*/


        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //1.��������
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //2.����������������������Ķ���������
        //ע�⣺�����д�ŵ�����Ϊ����ʱ������������Ҫ���������������ͳһ
        Block[] blockArr = {b1, b2, b3};

        //3.����һ������������¼��Ҫ���ҵ�Ԫ��
        int number = 16;

        //4.���÷���������������Դ���飬Ҫ���ҵ�Ԫ�أ����в���
        int index = getIndex(blockArr, arr, number);

        //5.��ӡ��Ӧ������
        System.out.println(index);
        
    }

    //���÷ֿ���ҵ�ԭ����ѯҪ���ҵ�Ԫ�ص�����
    public static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.ȷ��number����һ�鵱��
        int indexBlock = findIndexBlock(blockArr, number);

        //2.���쳣���������ж�
        if (indexBlock == -1) {
            return -1;
        }
        //3.����ִ�е������ʾҪ���ҵ�Ԫ���������У���ʱ��Ҫ��ȡ������ʼ�����ͽ�������
        //blockArr[indexBlock]��ʾ����ǰҪ���ҵ�Ԫ�����������һ�������ϣ��������ȥ��ȡ��Ӧ���������
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        //4.��������,��ʼ�����ͽ�������Ϊ��ǰnumber���ڵ��������ʼ�����ͽ�������
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //����һ������������ȷ��Ҫ���ҵ�Ԫ������һ�鵱��
    public static int findIndexBlock(Block[] blockArr, int number) {
        //��0������ʼ����blockArr�����numberС��max��ֵ����ô�ͱ�ʾnumber������һ�鵱��
        for (int i = 0; i < blockArr.length; i++) {
            //blockArr[i].getMax()��ʾ����ȡ��ǰ������Ӧ�������е����ֵ
            if (number <= blockArr[i].getMax()) {
                //���������򷵻���������ʾ��ǰ��Ҫ���ҵ�Ԫ���������������Ӧ��������
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
