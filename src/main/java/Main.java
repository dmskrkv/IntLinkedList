import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
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
            int num;
            int pos;
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Введите целое число для вставки:");
                        list.addLastElement(scan.nextInt());
                        break;
                    case 2:
                        System.out.println("Введите целое число для вставки:");
                            num = scan.nextInt();
                            System.out.println("Введите номер позиции:");
                            pos = scan.nextInt();
                            list.insertAtPos(num, pos);
                        break;
                    case 3:
                        System.out.println("Введите номер позиции для удаления:");
                            list.deleteAtPos(scan.nextInt());
                        break;
                    case 4:
                        System.out.println("Размер списка: " + list.getSize());
                        break;
                    case 5:
                        System.out.println("Введите номер позиции:");
                            num = list.getElement(scan.nextInt());
                            System.out.println("Значение элемента в позиции: " + num);

                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Некорректный выбор команды.\n");
                        break;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Введенное значение выходит за пределы размера списка.");
            }
        } while (!exit);
    }
}
