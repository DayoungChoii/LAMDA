import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LamdaEx4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(i->System.out.print(i+" "));

        System.out.println();

        list.removeIf(x->x%2==0 || x%3==0);
        list.forEach(i-> System.out.print(i+" "));

        System.out.println();

        list.replaceAll(x->x*10);
        list.forEach(i-> System.out.print(i+" "));

        System.out.println();

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v)->System.out.print(k+ " " + k+" "));


    }

}
