package Package_one;

/**
 * Created by USER on 24.10.2016.
 */
public class Main {


    public static void main(String[] args) {
       /*
       Girl girl=new Girl();
        girl.name="Ira";
        girl.age=23;
        girl.goToCinema();
        System.out.println(girl);

        Girl girl1 = new Girl();//ctrl+alt+v отсюда можна выбрать другое имя которое он предложит
        girl1.age=24;
        girl1.name="Ket";
        System.out.println(girl1);
        girl1.goToCinema();
*/

        Box box=new Box(10,20,30);
Box box3=new Box();

        double vol=box.volume();
        System.out.println(vol);

box=null;
        System.gc();// метод finalize работает так: box=null т.е. ни на что не ссылается. а есть спец механизм gc - чистит память.
        // и если нет ссылки на данную область памяти и не переопределен метод finalize
        //box box1=new Box(5,10,15);

        //box1.volume();//берет свойство box
        //Box box2=box1;// две ссылки ссылаются на одну иту же область памяти, на одини тот же объект
        //System.out.println(box2);
        //System.out.println(box1);
        //vol=box1.volume();
        //System.out.println(vol*2);


        /*
        System.out.println(Sort.avg(12));
        System.out.println(Sort.avg(1,2,6,3,4));
        */




    }
}
