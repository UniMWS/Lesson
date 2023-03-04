import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String CLASSIC_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static Map<Character, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("JDCP-6 + Евгений Орлов + ДЗ-19 + Коллекции HashSet и HashMap\nЗадача 1\n");
        for (int i = 0; i < CLASSIC_TEXT.length(); i++) {
            if (Character.isLetter(CLASSIC_TEXT.charAt(i))) {
                char letter = Character.toLowerCase(CLASSIC_TEXT.charAt(i));
                if (map.get(letter) == null)
                    map.put(letter, 1);
                else map.put(letter, map.get(letter) + 1);
            }
        }
//        System.out.println("Заполненная map:\n"+map+"\n");// для контроля
        System.out.print("Чаще всего раз ");
        printMax();
        System.out.print("Реже всего раз ");
        printMin();
    }

    public static void printMax() {
        int max = -1;
        char letter = 0;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > max) {
                max = kv.getValue();
                letter = kv.getKey();
            }
        }
        System.out.println("встречается буква \"" + letter + "\": " + map.get(letter));
    }

    public static void printMin() {
        int min = Integer.MAX_VALUE;
        char letter = 0;
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (value < min) {
                min = value;
                letter = key;
            }
        }
        System.out.println("встречается буква \"" + letter + "\": " + map.get(letter));
    }
}