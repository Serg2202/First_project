package TaskTwo;

import java.util.Scanner;

// задание 2. Ввести n чисел с консоли. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

public class ClassAnswersTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести n целых чисел с консоли: ");
        String s;
        s = in.nextLine();


        String[] arrayString = s.split(" ");
        boolean flag = true;

        while (flag) {
            int counter = 0;
            for (int i = 0; i < arrayString.length - 1; i++) {
                if (arrayString[i].length() > arrayString[i + 1].length()) {
                    String ss = arrayString[i + 1];
                    arrayString[i + 1] = arrayString[i];
                    arrayString[i] = ss;

                    counter = counter + 1;//счетчик. если после проверки очередности элементов потребуется их перестановка то в него запишется значение. Если после прохода массива в них уже не
                    //потребуется перестановка то значение флага станет false и он выйдет из цикла.
                }

            }
            if (counter == 0) {
                flag = false;
            }
        }

        System.out.println("Этот массив упорядочен в порядке возрастания значений их длины: ");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + ", ");
        }

        System.out.println("\nЭтот массив упорядочен в порядке убывания значений их длины: ");
        for (int i = arrayString.length - 1; i >= 0; i--) {
            System.out.print(arrayString[i] + ", ");


        }
    }
}

