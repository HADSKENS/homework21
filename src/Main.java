import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        in(list);
        list.stream()
                .filter(x -> x % 2 == 0)
                .filter(x-> x%2==0)
                .forEach(System.out::println);
        long sorted = list.stream()
                .filter(x->x%2==0)
                .count();
        System.out.println("Кол-во четных чисел "+sorted);

        findMinMax(
                list.stream(),
                Comparator.naturalOrder(),
                (x, y) -> System.out.printf("min %s, max %s %n%n", x, y)
        );
    }

    public static <T>  void findMinMax(
            Stream<? extends T> stream,
            Comparator <? super T> order,
            BiConsumer<? super T, ? super T>minMaxConsumer) {
        List<T> abc = new ArrayList<>();
        T min =null;
        T max =null;
        if (stream != null) {
            abc=stream
                    .sorted(order)
                    .collect(Collectors.toList());
            if (abc.size() !=0){
                min = abc.get(0);
                max = abc.get(abc.size()-1);
                minMaxConsumer.accept(min,max);
            }
            else {
                minMaxConsumer.accept(null,null);
            }
        }
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