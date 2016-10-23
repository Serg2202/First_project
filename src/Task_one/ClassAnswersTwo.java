package Task_one;

import java.util.Scanner;

//ответ по заданию №2 - Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class ClassAnswersTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целые числа без пробелов: ");
        String name = in.nextLine();

        for (int i = name.length() - 1; i >= 0; --i) {
            System.out.print(name.charAt(i));
        }
    }
}
