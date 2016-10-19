public class Class_answers_one {

    public static void main(String[] args) {
//ответ по заданию №1
/*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Ваше имя: " + name + " Ваш возраст: " + age);
        */
/*
        //ответ по заданию №2
        Scanner in = new Scanner(System.in);
        System.out.print("Введите че-нить: ");
        String name = in.nextLine();

        for (int i = name.length() - 1; i >= 0; --i) {
            System.out.print(name.charAt(i));
        }
*/
//ответ по заданию №3 (создать массив из n случайных чисел и вывести их на экран)
/*Random rand=new Random(System.currentTimeMillis());
  for (int i=0;i<10 ;i++){
      int s=rand.nextInt(21)-5;
      System.lineSeparator();
      System.out.println(s);
  }

//int n=rand.nextInt(100);//задаем промежуток случайных чисел, если убрать значение то число будет генериться максимальной длины
       // int[] a =new int[10];//массив из 10 элементов типа int
*/
//ответ по заданию №4 (Ввести пароль из командной строки и сравнить его со строкой-образцом.)
/*
        System.out.println("Введите ваше имя и нажмите Enter: ");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        scan.close();
        if (name.equals("Sergio")){
            System.out.println("Привет " + name + " :)");
        }
        else {
            System.out.println("Имя неправильное :(");
        }
*/


    }

    public static class OperationsWithNumbersSolver {
        public static void println(Object obj) {
            System.out.println(obj);
        }

        public static void print(Object obj) {
            System.out.print(obj);
        }

        public static void println() {
            System.out.println();
        }
    /*
        public static int[] toIntArray(Collection<Integer> list) {
            int[] result = new int[list.size()];
            Iterator<Integer> it = list.iterator();
            for (int i = 0; i < list.size(); i++) {
                result[i] = it.next();
            }
            return result;
        }
    */
    /*

        public static void findHappyNumbers(int[] sourceNumbers) {
            print("“Счастливые” числа (сумма 1-ой пары чисел = сумме 2-ой пары): ");
            int digit1, digit2, digit3, digit4;
            for (int sourceNumber : sourceNumbers) {
                if ((sourceNumber >= 1000 && sourceNumber <= 9999)
                        || (sourceNumber <= -1000 && sourceNumber >= -9999)) {
                    digit1 = sourceNumber / 1000;
                    digit2 = sourceNumber / 100 % 10;
                    digit3 = sourceNumber % 100 / 10;
                    digit4 = sourceNumber % 10;
                    if (digit1 + digit2 == digit3 + digit4) {
                        print(sourceNumber + ", ");
                    }
                }
            }
            println();

        }
    */

        /*
         * Метод находит элементы, которые равны полусумме соседних элементов в
         * массиве. <strong>Результат метода в случае переполнения не
         * определен</strong>
         *
         * @param sourceNumbers числа для нахождения элементов, которые равны полусумме
         *                      соседних элементов в массиве
         * @return элементы, которые равны полусумме соседних элементов в массиве. В
         * случае переполнения результат не определен.
         */
        public static void findNumbersOfHalfSumOfNeighbors(int[] sourceNumbers) {
            print("Элементы, которые равны полусумме соседних элементов: ");
            if (sourceNumbers.length >= 3) {
                for (int i = 1; i < sourceNumbers.length - 1; i++) {
                    if (sourceNumbers[i] == ((double) ((long) sourceNumbers[i - 1] + (long) sourceNumbers[i + 1]) / 2)) {
                        print(sourceNumbers[i] + ", ");
                    }
                }
            } else {
                print("sourceNumbers.length < 3");
            }
            println();
        }

    }
}


