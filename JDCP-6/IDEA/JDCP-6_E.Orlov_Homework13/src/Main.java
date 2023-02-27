import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{5, 300, 500, 100, 512, 1, 100, 500});
        System.out.println("JDCP-6 + Евгений Орлов + ДЗ-13 + Внедрение системы контроля версий");
        System.out.println();
        System.out.println("\"Анализ статистики продаж\"");
        System.out.printf("В указанном списке %s получаем максимальный размер продаж:%n%s у.е.%n", Arrays.toString(salesManager.sales), salesManager.max());
    }
}