package Home.TaskTwo;

import java.util.Random;
import java.util.Scanner;

//Задание 9.1. - Ввести n чисел с консоли. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
public class ClassAnswersNinePointOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер стороны матрицы в виде целого числа: ");
        int n = in.nextInt();
        Random rand = new Random();
        int[][] matrix = new int[n][n];


        for (int i = 0; i < matrix.length; i++) {//отсортировать строки и стоблцы матрицы по возрастанию с помощью "метода пузырька"
            boolean sorted = true;// вводим переменную
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {//цикл, кторый будет проходить по строкам и сравнивать значения
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][j + 1];
                    matrix[i][j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        for (int[] line:matrix) {
            for (int element:line){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(matrix);

    }
}
