package �ϰ�.day10;

import java.util.StringJoiner;

public class p106_Stringjoiner {
    public static void main(String[] args) {
        //1.����һ�����󣬲��ƶ��м�ָ���
        //StringJoiner sj = new StringJoiner("---");
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.���Ԫ��
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();
        System.out.println(len);

        String str = sj.toString();
        System.out.println(str);
        //3.��ӡ���
        System.out.println(sj);

    }
}
