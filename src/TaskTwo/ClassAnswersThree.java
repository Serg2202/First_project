package TaskTwo;

import java.util.Scanner;

// Задание 3. Ввести n чисел с консоли. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
public class ClassAnswersThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести n целых чисел с консоли разной длины через пробел: ");
        String[] arrayString = in.nextLine().split(" ");
        int avarageSum = 0;
        String minAverage = "";
        String maxAverage = "";

        for (String nums : arrayString) {// суммирует числа
            avarageSum += nums.length();

        }
        avarageSum = avarageSum / arrayString.length;//здесь определили среднюю длину
        System.out.println("Средняя длина всех введенных чисел: " + avarageSum);

        for (String nums : arrayString) {
            if (nums.length() < avarageSum) {
                minAverage += nums + " - " + nums.length() + "\n";//сохранили в minAverage все котр меньше
            }
            if (nums.length() > avarageSum ){
                maxAverage += nums + " - " + nums.length() + "\n";// созхранили в maxAverage все котр больше
            }
        }
        System.out.println("Числа, длина которых меньше средней: \n" + minAverage);
        System.out.println("Числа, длина которых больше средней: \n" + maxAverage);


    }

}
