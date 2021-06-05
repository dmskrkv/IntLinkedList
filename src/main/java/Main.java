import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.addLastElement(10);
        list.addLastElement(20);
        list.addLastElement(30);
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("\nСписок возможных операций двунаправленного связанного списка:");
            System.out.println("1. Вставить элемент в конец;");
            System.out.println("2. Вставить элемент в позицию;");
            System.out.println("3. Удалить элемент из позиции;");
            System.out.println("4. Получить размер списка;");
            System.out.println("5. Получить значение элемента по позиции;");
            System.out.println("6. Выход.");
            int choice = scan.nextInt();
            int num, pos;
            switch (choice) {
                case 1:
                    System.out.println("Введите целое число для вставки:");
                    list.addLastElement(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Введите целое число для вставки:");
                    try {
                        num = scan.nextInt();
                        System.out.println("Введите номер позиции:");
                        pos = scan.nextInt();
                        list.insertAtPos(num, pos);
                    } catch (IllegalArgumentException iae) {
                        System.out.println("Введенное значение выходит за пределы размера списка.");
                    }
                    break;
                case 3:
                    System.out.println("Введите номер позиции для удаления:");
                    try {
                        list.deleteAtPos(scan.nextInt());
                    } catch (IllegalArgumentException iae) {
                        System.out.println("Введенное значение выходит за пределы размера списка.");
                    }
                    break;
                case 4:
                    System.out.println("Размер списка: " + list.getSize());
                    break;
                case 5:
                    System.out.println("Введите номер позиции:");
                    try {
                        num = list.getElement(scan.nextInt());
                        System.out.println("Значение элемента в позиции: " + num);
                    } catch (IllegalArgumentException iae) {
                        System.out.println("Введенное значение выходит за пределы размера списка.");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный выбор команды.\n");
                    break;
            }
        } while (!exit);
    }
}
