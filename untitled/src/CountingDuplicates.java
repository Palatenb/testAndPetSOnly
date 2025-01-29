import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        long globalCount = 0;
        Map<Character, Long> frequencyMap = text.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        globalCount = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .count();
        return (int) globalCount;
    }
}
