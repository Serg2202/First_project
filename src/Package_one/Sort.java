package Package_one;

/**
 * Created by USER on 24.10.2016.
 */
public class Sort {
    static double avg(int...b){
        int sum=0;
        for (int i : b){
            sum +=i;
        }
        return sum/b.length;
    }
}
