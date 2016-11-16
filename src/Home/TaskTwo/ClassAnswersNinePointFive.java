package Home.TaskTwo;

import java.util.Random;
import java.util.Scanner;

//9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
public class ClassAnswersNinePointFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер стороны матрицы в виде целого числа n: ");
        int n = in.nextInt();
        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt((n * 2) - n);
            }
        }

        System.out.println("Original random matrix:");
        printMatrix(matrix, n);
        System.out.println("Повернуть матрицу на 90 градусов против часовой стрелки: ");
        printMatrix(rotateMatrix90(matrix, n), n);
        /*
        System.out.println("Повернуть матрицу на 180 градусов против часовой стрелки: ");
        printMatrix(matrix, n);
        rotateMatrix90(matrix, n);
        System.out.println("Повернуть матрицу на 270 градусов против часовой стрелки: ");
        printMatrix(matrix, n);
        */

    }

    public static int[][] fillMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix90(int[][] matrix, int n) {
        int e = 0;
        int[][] matrixTemp = new int[n][n];
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                matrixTemp[e][j] = matrix[j][i];
            }
            e++;
        }
        return matrixTemp;
    }

    public static int[][] rotateMatrix180(int[][] matrix, int n) {
        int e = 0;
        int[][] matrixTemp = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                matrixTemp[e][j] = matrix[j][i];
            }
        }
        return matrixTemp;
    }
}

