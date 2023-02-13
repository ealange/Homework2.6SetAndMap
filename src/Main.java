import java.util.*;

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
        System.out.println("Нечетные числа из последовательности, без повторов: " + evenNums);

        String textTask3 = "На дворе — трава, на траве — дрова. Не руби дрова на траве двора! Что-нибудь да как-то";
        String textTask3Modified = textModify(textTask3);
        System.out.println(textModify(textTask3Modified));
        List<String> wordsFromText3 = List.of(textTask3Modified.split("\\s"));
        System.out.println(wordsFromText3);
        HashSet<String> uniqueWords = new HashSet<>();
        for (String s : wordsFromText3) {
            uniqueWords.add(s);
        }
        System.out.println("в тексте " + uniqueWords.size() + " уникальных слов: " + uniqueWords);
        String houseJack = "Дом, который построил Джек\n" +
                "Вот дом,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "А это пшеница,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "А это весёлая птица-синица,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "Вот кот,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "Вот пёс без хвоста,\n" +
                "Который за шиворот треплет кота,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "А это корова безрогая,\n" +
                "Лягнувшая старого пса без хвоста,\n" +
                "Который за шиворот треплет кота,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "А это старушка, седая и строгая,\n" +
                "Которая доит корову безрогую,\n" +
                "Лягнувшую старого пса без хвоста,\n" +
                "Который за шиворот треплет кота,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "А это ленивый и толстый пастух,\n" +
                "Который бранится с коровницей строгою,\n" +
                "Которая доит корову безрогую,\n" +
                "Лягнувшую старого пса без хвоста,\n" +
                "Который за шиворот треплет кота,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "\n" +
                "Вот два петуха,\n" +
                "Которые будят того пастуха,\n" +
                "Который бранится с коровницей строгою,\n" +
                "Которая доит корову безрогую,\n" +
                "Лягнувшую старого пса без хвоста,\n" +
                "Который за шиворот треплет кота,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.";
        String houseJackModified = textModify(houseJack);
        System.out.println(houseJackModified);
        List<String> wordsFromText4 = List.of(houseJackModified.split("\\s"));
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String s : wordsFromText4) {
            if (wordsCount.containsKey(s)) {
                int increaseValue = wordsCount.get(s) + 1;
                wordsCount.put(s, increaseValue);
            } else {
                wordsCount.put(s, 1);
            }
        }
        System.out.println("Число повторений слов в тексте: ");
        System.out.println(wordsCount);
    }

    public static String textModify(String text) {
        String textModify = text.toLowerCase(Locale.ROOT)
                .replaceAll("\n", ", ")
                .replaceAll("[,.:;!?—]", "")
                // Замена всех двойных пробелов на одинарные
                .replaceAll("  ", " ")
                .replaceAll("  ", " ");
        return textModify;

    }

}