package Home.TaskTwo;

import java.util.Scanner;

//Задание 8 - Ввести n чисел с консоли.
//Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
public class ClassAnswersEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер стороны матрицы : ");
        int n = in.nextInt();// прочитаем одно число
        int res = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(res + " ");
                res++;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + (i * n) + " ");
            }
            System.out.println();
        }
    }
}
