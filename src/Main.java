import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        in(list);
        list.stream()
                .filter(x-> x%2==0)
                .forEach(System.out::println);
        long sorted = list.stream()
                .filter(x->x%2==0)
                .count();
        System.out.println("Кол-во четных чисел "+sorted);
    }
        public static void in (List < Integer > list) {
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