package �ϰ�.day3;

public class �߼������ {
    public static void main(String[] args) {
//        �߼������
//        �߼��룺&   �߼���|    �߼����^   �߼��ǣ���
        //�߼��룺&   ��false����false
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println((a > b) & (a > c));//false & false
        System.out.println((a < b) & (a > c));//true & false
        System.out.println((a > b) & (a < c));//false & true
        System.out.println((a < b) & (a < c));//true & true

        //�߼���|  ��true����true
        System.out.println((a > b) | (a > c));//false | false
        System.out.println((a < b) | (a > c));//true | false
        System.out.println((a > b) | (a < c));//false | true
        System.out.println((a < b) | (a < c));//true | true

        //�߼����^ ��ͬΪfalse  ��ͬΪtrue
        System.out.println((a > b) ^ (a > c));//false ^ false
        System.out.println((a < b) ^ (a > c));//true ^ false
        System.out.println((a > b) ^ (a < c));//false ^ true
        System.out.println((a < b) ^ (a < c));//true ^ true

        //�߼��ǣ���  �����a�Ľ���෴
        System.out.println(!(a > b)); //false

//      ��·�߼������
//      ��·�룺&&   ��·��||
//      ��·�룺&&   ��false����false
//      ������&һ���������ж�·Ч��  �߼���&�����������ұ߶�Ҫִ��
//      ��·��&&������Ϊ�棬�ұ�ִ�У�������Ϊ�٣��ұ߲�ִ��
        System.out.println((a > b) && (a > c));//false && false
        System.out.println((a < b) && (a > c));//true && false
        System.out.println((a > b) && (a < c));//false && true
        System.out.println((a < b) && (a < c));//true && true

        //��·��||  ��true����true
//      ������|һ���������ж�·Ч��   �߼���|�����������ұ߶�Ҫִ��
//      ��·��||������Ϊ�٣��ұ�ִ�У�������Ϊ�棬�ұ߲�ִ��|
        System.out.println((a > b) || (a > c));//false || false
        System.out.println((a < b) || (a > c));//true || false
        System.out.println((a > b) || (a < c));//false || true
        System.out.println((a < b) || (a < c));//true || true

    }
}
