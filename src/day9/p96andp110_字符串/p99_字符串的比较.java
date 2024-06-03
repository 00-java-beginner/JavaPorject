package p96andp110_字符串;

public class p99_字符串的比较 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc";

        //2.==号比较
        System.out.println(s1 == s2);

        //3.比较对象中的内容是否相同
        boolean result = s1.equals(s2);
        System.out.println(result);

        //4.忽略大小写比较
        boolean result1 = s1.equalsIgnoreCase(s2);
        System.out.println(result1);
    }
}
