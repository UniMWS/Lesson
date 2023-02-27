public class Filler<T> {
    // это для себя, чисто попробовать
    public Filler(T[] filler, MagicBox<T> magicBox) {
        for (T cell : filler) {
            if (magicBox.add(cell)) System.out.println(cell);
            else System.out.println("Как добавить, так место кончилось.");
        }
        System.out.println("Особо отметим: " + magicBox.pick());
    }
}
