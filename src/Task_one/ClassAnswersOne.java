package Task_one;

import java.util.Scanner;


public class ClassAnswersOne {

    public static void main(String[] args) {
//ответ по заданию №1 - Приветствовать любого пользователя при вводе его имени через командную строку.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Ваше имя: " + name + " Ваш возраст: " + age);


    }
}


