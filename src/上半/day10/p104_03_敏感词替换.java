package �ϰ�.day10;
public class p104_03_���д��滻 {
    public static void main(String[] args) {
        //1.����һ����������˵�Ļ�
        String talk = "�������ã��Ժ�Ҫ���ˣ�TMD��CNM";

        //2.����һ�����дʿ⣬�����Ͳ���һ�����滻��
        String [] arr = {"TMD","CNM","MLGB","QNMB"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
