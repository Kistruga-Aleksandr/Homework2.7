import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("house","house","chair","chair","chair","car","car","door"));
        OddInteger.outputsOddInteger(nums);
        System.out.println();
        EvenInteger.outputsEvenInteger(nums);
        System.out.println();
        UniqueWords.outputsUniqueWords(words);
        RepeatedWords.outputsRepeatedWords(words);

    }
}
