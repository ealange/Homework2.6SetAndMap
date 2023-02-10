import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nums);
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                oddNums.add(nums.get(i));
            }

        }
        System.out.println(oddNums);
        HashSet<Integer> evenNums = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                evenNums.add(nums.get(i));
            }
            
        }
        System.out.println(evenNums);

    }

}