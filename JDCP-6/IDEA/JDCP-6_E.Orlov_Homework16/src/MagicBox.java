import java.util.Random;

public class MagicBox<T> {
    private Integer maxItems;
    private Integer count;
    private Random random = new Random();
    // `T[] items = (T[]) new Object[maxItems];` - супер-подсказка: день "женил" items и maxItems,
    // пока не разорвал их по местам
    protected T[] items;

    public MagicBox(Integer maxItems) {
        this.maxItems = maxItems;
        this.items = (T[]) new Object[maxItems];
    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                count = i + 1;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (T item : items) {
            if (item == null) {
//                return (T) ("причём тут \"RuntimeException\", если хватит просто if в цикле? \nОсталось заполнить ячеек: " + (items.length - count));
                throw new RuntimeException("Осталось заполнить ячеек: " + (items.length - count));
            }
        }
        return items[random.nextInt(items.length)];
    }
}
