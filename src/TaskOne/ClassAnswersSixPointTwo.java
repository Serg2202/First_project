package TaskOne;

import java.util.Scanner;

// 6.Ввести с консоли n целых чисел. На консоль вывести: 6.2. Наибольшее и наименьшее число.

public class ClassAnswersSixPointTwo {
    public static void main(String[] args) {

        int max = -1;
        int min = 100;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите набор целых чисел без пробелов: ");
        String s;
        s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {

            Integer current = Integer.parseInt(s.substring(i, i + 1));//преобразование - явное приведение типов

            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
