import java.util.Scanner;


public class TaskSchema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число А: ");
        int A = in.nextInt();

        System.out.println("Введите второе целое число В: ");
        int B = in.nextInt();

        System.out.println("Введите третье целое число X: ");
        int X = in.nextInt();

        if ((A > 1) && (B == 0)) {
            int result;
            result = X / A;
            System.out.println("Введенные числа прошли проверки и вывели результат: " + A + B + result);
        } else {
            System.out.println("Введенные числа не удовлетворяют условиям: А>1 и B=0 " + A + B);
        }

        if ((A == 2) | (X > 1)) {
            int result1;
            result1 = X + 1;
            System.out.println("Введенные числа прошли проверки и вывели результат: " + A + result1);

        } else {
            System.out.println("Введенные числа не удовлетворяют условиям: А=2 и Х>1 " + A + X);
        }
    }
}
