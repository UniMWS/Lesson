import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    Set<String> text = new HashSet<>();// сразу в множество через конструктор

    public WordsChecker(String text) {
        Collections.addAll(this.text, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        return text.contains(word);
    }

    @Override
    public String toString() {// для контроля
        return "\nWordsChecker:\n" + text;
    }
}
