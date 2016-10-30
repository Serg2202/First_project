package TaskTwo;

import java.util.Scanner;

// задание 4.Ввести n чисел с консоли.4. Найти число, в котором число различных цифр минимально.
// Если таких чисел несколько, найти первое из них.
public class ClassAnswersFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести n целых чисел с консоли разной длины через пробел: ");
        String[] arrayString = in.nextLine().split(" ");

        for (int i = 0; i < arrayString.length; i++) {
            int w = 0;
            for (int j = 0; j < arrayString[i].length(); j++) {
                for (int d = 0; d < arrayString[i].length(); d++) {
                    if (arrayString[i].charAt(j) == arrayString[i].charAt(d)) {
                        w++;
                    } else {
                        w--;
                    }
                }
            }
            System.out.println(arrayString[i] + " - " + w);
        }


    }
}
