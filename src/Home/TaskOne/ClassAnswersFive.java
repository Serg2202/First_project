package Home.TaskOne;

import java.util.Scanner;

//задание №5 - Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.

public class ClassAnswersFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = in.nextInt();

        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Результат будет = " + sum);

        System.out.println("Введите первое число: ");
        int d = in.nextInt();
        System.out.println("Введите второе число: ");
        int e = in.nextInt();
        int sum1 = d * e;
        System.out.println("Результат будет = " + sum1);
    }
}
