package p96andp110_�ַ���;

import java.util.Random;

public class aaa {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int random = r.nextInt(100);
            if (random % 2 == 1){
                System.out.println("�����Ʊ");
            }else {
                System.out.println("���Ʊ");
            }
        }

    }
}
