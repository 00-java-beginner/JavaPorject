package �°�.day25;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //����Ƕ��
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city1,"������","������","������","������","��ˮ��");
        Collections.addAll(city2,"������","������","��ɽ��","��ͷ��","��β��");

        hm.put("�㽭ʡ",city1);
        hm.put("�㶫ʡ",city2);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
