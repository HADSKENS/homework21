import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();in(list);
        list.stream()
                .filter(x -> x%2==0)
                .forEach(System.out::println);
    }
        public static void in (List<Integer> list){
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(9);
            list.add(10);
    }
}