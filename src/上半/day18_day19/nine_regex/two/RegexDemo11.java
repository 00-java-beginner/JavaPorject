package �ϰ�.day18_day19.nine_regex.two;

public class RegexDemo11 {
    public static void main(String[] args) {
        //public string replaceAll(string regex,string newstr) ����������ʽ�Ĺ�������滻
        //public string[] split(string regex): ����������ʽ�Ĺ����и��ַ���

        /*
            ��һ���ַ���:Сʫʫdqwefqwfqwfwq12312С����dqwefqwfqwfwq12312С�ݻ�
            Ҫ��1:���ַ�������������֮�����ĸ�滻Ϊvs
            Ҫ��2:���ַ����е����������и����*/

        String s = "Сʫʫdqwefqwfqwfwq12312С����dqwefqwfqwfwq12312С�ݻ�";
        //ϸ��:
        //�����ڵײ��֮ǰһ��Ҳ�ᴴ���ı��������Ķ���
        //Ȼ���ͷ��ʼȥ��ȡ�ַ����е����ݣ�ֻҪ������ģ���ô���õ�һ������ȥ�滻��
        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);

        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
