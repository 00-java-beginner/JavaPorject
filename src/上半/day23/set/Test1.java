package �ϰ�.day23.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Test1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        boolean r1 = s.add("����");
        boolean r2 = s.add("����");
        boolean r3 = s.add("����");
        boolean r4 = s.add("����");

        //����������
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        //��ǿfor
        for (String str : s) {
            System.out.println(str);
        }

        //lambda���ʽ
        s.forEach(str ->System.out.println(str));

    }
}
