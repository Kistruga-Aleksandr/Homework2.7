import java.util.List;

public class OddInteger {

    public static void outputsOddInteger(List<Integer> nums) {
        for (Integer integer : nums)
            if (integer % 2 == 1) {
                System.out.print(integer + " ");
            }
    }

}
