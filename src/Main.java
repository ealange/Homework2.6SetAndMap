import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Исходная последовательность: " + nums);
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                oddNums.add(nums.get(i));
            }

        }
        System.out.println("Нечетные числа из последовательности: " + oddNums);
        HashSet<Integer> evenNums = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                evenNums.add(nums.get(i));
            }

        }
        System.out.println("Нечетные числа из последовательности, без повторов: " +evenNums);

        String text = "На дворе — трава, на траве — дрова. Не руби дрова на траве двора! Что-нибудь да как-то";
        text = text.toLowerCase(Locale.ROOT);
        System.out.println(text);
        String textWithoutPunct = text.replaceAll("[,.:;!?—]", "");
        System.out.println(textWithoutPunct);
        String textWithoutDoubledSpaces = textWithoutPunct.replaceAll("  ", " ");
        System.out.println(textWithoutDoubledSpaces);
        List<String> wordsFromText = List.of(textWithoutDoubledSpaces.split("\\s"));
        System.out.println(wordsFromText);
        HashSet<String> uniqueWords = new HashSet<>();
        for (String s : wordsFromText) {
            uniqueWords.add(s);

        }
        System.out.println("в тексте " + uniqueWords.size() + " уникальных слов: " + uniqueWords);
    }

}