import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedWords {

    public static void outputsRepeatedWords(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);

    }
}
