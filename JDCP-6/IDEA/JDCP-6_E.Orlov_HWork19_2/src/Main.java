public class Main {
    public static final String CLASSIC_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static WordsChecker wordsChecker = new WordsChecker(CLASSIC_TEXT);
    public static String wordOne = "ipsum";
    public static String wordTwo = "not";

    public static void main(String[] args) {
        System.out.println("JDCP-6 + Евгений Орлов + ДЗ-19 + Коллекции HashSet и HashMap\nЗадача 2\n");
        searchWord(wordOne);
        searchWord(wordTwo);

//        System.out.println(wordsChecker);// для контроля
    }
    public static void searchWord(String word) {
        System.out.println("Ищем в заданном тексте слово \"" + word + "\": " + wordsChecker.hasWord(word));
    }
}