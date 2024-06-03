package p96andp110_字符串;

import java.util.Random;

public class aaa {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int random = r.nextInt(100);
            if (random % 2 == 1){
                System.out.println("不买彩票");
            }else {
                System.out.println("买彩票");
            }
        }

    }
}
