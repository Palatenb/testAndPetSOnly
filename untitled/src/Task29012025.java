import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task29012025 {


    public static void main(String[] args) {

    }

    public static void task1() {
        List<Integer> numbers = List.of(3, 10, 7, 2, 8, 5, 6, 1, 4);
        List<Integer> result = numbers.stream()
                .filter(e -> e % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .map(e -> e * 2).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void task2(){
        List<String> names = List.of("Anna", "Alex", "Bob", "Alice", "John", "Aria");
        String findName = names.stream()
                .filter(e->e.charAt(0)=='A' && e.length()>3)
                .findAny().get();
        System.out.println(findName);
    }
    public static void task3(){
        List<String> words = List.of("apple", "banana", "cherry");
        String list = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(list);
    }
}
