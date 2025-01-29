import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task29012025 {


/*
Задача 1: Фильтрация и преобразование
У тебя есть список чисел. Нужно:

Оставить только четные числа.
Умножить их на 2.
Отсортировать по убыванию.
Собрать в список и вывести.

List<Integer> numbers = List.of(3, 10, 7, 2, 8, 5, 6, 1, 4);

Задача 2: Поиск строки по условию
Есть список имен. Нужно:
Найти любое имя, которое начинается с "A" и состоит более чем из 3 букв.
Вывести его (если есть) или "Имя не найдено".
List<String> names = List.of("Anna", "Alex", "Bob", "Alice", "John", "Aria");
Ожидаемый результат: Например, "Anna" или "Alice", в зависимости от порядка.

Задача 3: Объединение строк
Дан список слов. Нужно:

Преобразовать все слова в верхний регистр.
Объединить их через запятую в одну строку.

List<String> words = List.of("apple", "banana", "cherry");
Ожидаемый результат: "APPLE, BANANA, CHERRY"

*/
    public static void main(String[] args) {
        //11234123

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
