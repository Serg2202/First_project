package Home.TaskOne;

import java.util.Scanner;

//  ответ по заданию №4 - Ввести пароль из командной строки и сравнить его со строкой-образцом.
public class ClassAnswersFour {
    public static void main(String[] args) {


        System.out.println("Введите ваше имя и нажмите Enter: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();
        if (name.equals("Sergio")) {
            System.out.println("Привет " + name + " :)");
        } else {
            System.out.println("Имя неправильное :(");
        }
    }
}
