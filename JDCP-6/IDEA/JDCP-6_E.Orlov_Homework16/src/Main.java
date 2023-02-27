public class Main {
    // Изящнее и проще заполнять MagicBox<T> готовыми массивами объектов, тем более двух типов
    public static String[] filler1 = {"Подсказки", "убили", "мозг", "оскольчатыми", "переломами", "минус день жизни"};
    public static Integer[] filler2 = {5, 3, 15, 100, 1};

    public static void main(String[] args) {
        System.out.println();
        System.out.println("String MagicBox");
        MagicBox<String> stringMagicBox = new MagicBox<>(5);
        filler(filler1, stringMagicBox);// Заполнялка одна для всех через метод filler в классе Main
//        new Filler<>(filler1, stringMagicBox);// совсем смешно через конструктор класса Filler )))

        System.out.println();
        System.out.println("Integer MagicBox");
        MagicBox<Integer> integerMagicBox = new MagicBox<>(8);
//        filler(filler2, integerMagicBox);// Заполнялка одна для всех через метод filler в классе Main
        new Filler<>(filler2, integerMagicBox);// совсем смешно через конструктор класса Filler )))
    }

    public static <P> P filler(P[] filler, MagicBox<P> magicBox) {
        for (P cell : filler) {
            if (magicBox.add(cell)) System.out.println(cell);
            else System.out.println("Как добавить, так место кончилось.");
        }
        System.out.println("Особо отметим: " + magicBox.pick());
        return (P) magicBox;
    }
}