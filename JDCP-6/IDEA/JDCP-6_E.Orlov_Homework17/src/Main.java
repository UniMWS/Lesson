import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6 + Евгений Орлов + ДЗ-17 + Коллекции List");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        while (true) {
            try {
                System.out.println();
                System.out.println("Выберите операцию для списка покупок: \n1. добавить, 2. показать, 3. удалить, 4. найти\n(или \"end\" для выхода)");
                String line = scanner.nextLine();
                if ("end".equals(line)) {
                    break;
                }
                int choice = Integer.parseInt(line);
                System.out.println();
                switch (choice) {
                    case 1:
                        addList(scanner, products);
//                        System.out.println(products);// для контроля
                        break;
                    case 2:
                        printList(products);// вызов метода вывода списка
                        break;
                    case 3:
                        if (printList(products) == null) continue;// вывод списка с проверкой на пустоту
                        removeList(scanner, products);
                        printList(products);// вызов метода вывода списка
                        break;
                    case 4: // задача 2
                        if (products.isEmpty()) {
                            System.out.println("Список пустой.");
                            continue;
                        }
                        findList(scanner, products);
                        break;
                    default:
                        System.out.println("Такой операции \"" + choice + "\" нет. Выбор от 1 до 4");
                        System.out.println();
                }
            } catch (NumberFormatException exception) {
                System.out.println("Надо ввести число от 1 до 4");
            }
        }
        System.out.println();
        System.out.println("Итого в списке покупок: " + products.size());
        printList(products);
    }

    private static void addList(Scanner scanner, List<String> products) {
        System.out.println("Какую покупку хотите добавить?");
        products.add(scanner.nextLine());
        System.out.println("Итого в списке покупок: " + products.size());
    }

    public static <T> T printList(List<T> products) { // метод вывода списка с проверкой заполнения
        if (products.isEmpty()) {
            System.out.println("Список пустой.");
            return null;
        }
        System.out.println("Список покупок: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        return (T) products;
    }

    private static void removeList(Scanner scanner, List<String> products) {
        String line;
        System.out.println("Какую хотите удалить? Введите номер или название");
        line = scanner.nextLine();
        try { // проверка номера
            int indexProduct = Integer.parseInt(line) - 1;
            if ((indexProduct >= 0) & (indexProduct < products.size())) {
                System.out.print("Покупка \"" + products.get(indexProduct) + "\" удалена. ");
                products.remove(indexProduct);
            } else System.out.printf("Нет продукта с номером \"%d\". ", (indexProduct + 1));
        } catch (NumberFormatException e) { // ловим название
            if (products.contains(line)) { // проверяем наличие в списке
                products.remove(line);
                System.out.printf("Покупка \"%s\" удалена. ", line);
            } else System.out.printf("В списке нет покупки \"%s\". ", line);
        }
    }

    private static void findList(Scanner scanner, List<String> products) {
        System.out.println("ведите текст для поиска:");
        String queryLower = (scanner.nextLine()).toLowerCase();
        System.out.println("Найдено:");
        for (int i = 0; i < products.size(); i++) {
            String itemLower = (products.get(i)).toLowerCase();
            if (itemLower.contains(queryLower)) {
                System.out.println((i + 1) + ". " + products.get(i));
            }
        }
    }
}
