package �°�.day24;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //LinkedHashMap���Ա�֤��ȡ˳��һ��
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("a",123);
        lhm.put("a",123);
        lhm.put("b",456);
        lhm.put("c",789);

        System.out.println(lhm);
    }
}
