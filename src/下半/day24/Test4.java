package �°�.day24;

import java.util.StringJoiner;
import java.util.TreeMap;

public class Test4 {
    public static void main(String[] args) {
        //����һ���ַ�����ͳ��ÿ����ĸ���ֵĴ���
        String str = "ababcddddcccaaa";

        TreeMap<Character, Integer> tm = new TreeMap<>();

        //�����ַ������õ�ÿһ���ַ�
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //���ڣ���ʾ��ǰ�ַ��ֳ�����һ��
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
                //�����ڣ���ʾ��ǰ�ַ���һ�γ���
            } else {
                tm.put(c, 1);
            }
        }
        //�ֱ������ַ�ʽƴ���ַ���
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(") "));
        System.out.println(sb);

        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(") "));
        System.out.println(sj);
    }
}
