package Package_one;

/**
 * Created by USER on 19.10.2016.
 */
public class ArrayInverter {
    public static void invert(int[] args) {
        for (int i = 0; i < args.length / 2; i++) {
            int temp = args[i];// создаем временную переменную
            args[i] = args[args.length - 1 - i];//идем с одной стороны для смена стаканов)
            args[args.length - 1 - i] = temp;//поменяли местами стаканы)
        }

    }
}
