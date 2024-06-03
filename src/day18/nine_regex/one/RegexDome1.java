package day18.nine_regex.one;

public class RegexDome1 {
  public static void main(String[] args) {
    String QQ = "1234567890";
    System.out.println(QQ.matches("[1-9]\\d{5,19}"));
  }
}
