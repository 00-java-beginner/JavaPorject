package �°�.day25;
import java.util.ArrayList;
import java.util.Collections;
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"С��","С��","С��","С��","С��","С��","С��","С��","С��","С��");

        Collections.shuffle(list);
        String name = list.get(0);
        System.out.println(name);
    }
}
