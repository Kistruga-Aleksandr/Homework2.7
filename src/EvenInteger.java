import java.util.*;

public class EvenInteger {

    public static void outputsEvenInteger(List<Integer> nums){
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer integer : set)
            if (integer % 2 == 0)
                System.out.print(integer + " ");
    }
}
