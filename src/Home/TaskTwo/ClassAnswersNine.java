package Home.TaskTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.incrementExact;

//Задание 9 - Ввести с консоли n-размерность матрицы a [n] [n].
// Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.

public class ClassAnswersNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер стороны матрицы в виде целого числа: ");
        int n = in.nextInt();
        Random rand = new Random();// для геренирования случайнх чисел есть спец метод Random
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(n * 2) - n;
            }
        }

        System.out.println("Original random matrix:");
        printMat(matrix);

        //sorted(matrix);
        shft(matrix, 1, Direction.left);
        shft(matrix, 1, Direction.right);
        shft(matrix, 1, Direction.up);
        shft(matrix, 1, Direction.down);
        elementsEqualToZero(matrix);
        rotateMatrix90(matrix, n);
        /*второй вариант
        for (int i = 0; i < pow(n, 2); i++) {
            int num = rand.nextInt(n * 2) - n;
            System.out.println(num);
        }*/
    }

    static void printMat(int[][] matrix) {
        for (int[] current : matrix) {
            for (int i : current) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //region
    //задание 9.1 - Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
    static void sorted(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {//отсортировать матрицу по строкам по возрастанию значений
            boolean sorted;// вводим переменную
            do {
                sorted = false;
                for (int j = 0; j < matrix.length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {//цикл, кторый будет проходить по строкам и сравнивать значения
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                        sorted = true;
                    }
                }
            }
            while (sorted);
        }

        for (int j = 0; j < matrix.length; j++) {//отсортировать матрицу по столбцам  по возрастанию значений
            boolean sorted;// вводим переменную
            do {
                sorted = false;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {//цикл, кторый будет проходить по строкам и сравнивать значения
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                        sorted = true;
                    }
                }
            }
            while (sorted);
        }

        System.out.println("\nОтсортированная матрица:");
        printMat(matrix);

    }
    //region
// Задание 9.2 - Выполнить циклический сдвиг заданной матрицы на k позиций вправо влево, вверх, вниз.

    static void shft(int[][] matrix, int count, Direction d) {//здесь задаем нашу матрицу, на сколько позиций ее сдвинуть, направление сдвига
        for (int i = 0; i < count; i++) {
            shift(matrix, d);
        }
    }

    static void shift(int[][] matrix, Direction d) {//здесь задаем нашу матрицу, направление сдвига
        int tmp = 0;
        switch (d) {
            case left:
                for (int q = 0; q < matrix.length; q++) {
                    tmp = matrix[q][0];
                    System.arraycopy(matrix[q], 1, matrix[q], 0, matrix.length - 1);//используем мтеод arraycopy для копирования элементов из одного массива в другой
                    matrix[q][matrix.length - 1] = tmp;
                }
                break;
            case right:
                for (int q = 0; q < matrix.length; q++) {
                    tmp = matrix[q][matrix.length - 1];
                    System.arraycopy(matrix[q], 0, matrix[q], 1, matrix.length - 1);//используем мтеод arraycopy для копирования элементов из одного массива в другой
                    matrix[q][0] = tmp;
                }
                break;
            case up:
                for (int i = 0; i < matrix.length; i++) {
                    tmp = matrix[0][i];
                    for (int j = 0; j < matrix.length - 1; j++) {
                        matrix[j][i] = matrix[j + 1][i];
                    }
                    matrix[matrix.length - 1][i] = tmp;
                }
                break;
            case down:
                for (int i = 0; i < matrix.length; i++) {
                    tmp = matrix[matrix.length - 1][i];
                    for (int j = matrix.length - 1; j > 0; j--) {
                        matrix[j][i] = matrix[j - 1][i];
                    }
                    matrix[0][i] = tmp;
                }
                break;
        }
        System.out.println("\nСдвиг матрицы :" + d);
        printMat(matrix);
    }

    //Задание 9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
    public static void rotateMatrix90(int[][] matrix, int n) {
        int e = 0;
        int[][] matrixTemp = new int[n][n];//для поворота двумерной матрицы на 90 градусов нужно применить транспонирование.
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                matrixTemp[e][j] = matrix[j][i];
            }
            e++;
        }
        System.out.println("\n" + "Повернули на 90 против часовой стрелки :");
        printMat(matrix = matrixTemp);
    }

    //Задание 9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
    public static void elementsEqualToZero(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            int n = 0;
            int[] c = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    c[n++] = matrix[i][j];//создает новый массив и присваиваем значение ненулевое
                }
            }
            matrix[i] = Arrays.copyOf(c, c.length);//метод который
        }
        System.out.println("\n" + "Нули в конце :");
        printMat(matrix);
    }

    enum Direction {
        left, right, up, down// в enum перечисляю направлениея куда сдвигать матрицу. enum  это тип, поля которого состоят из некоторых констант
    }
}


//Задание 9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.


//Задание 9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.


//Задание 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.


//Задание 9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.




