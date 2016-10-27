package Package_one;


public class Box {
    double width;
    double height;
    double depth;

    public Box() {//объявили дефолтный конструктор
        System.out.println("constract");
    }

    /*
            double volume() {
                //System.out.println(height * width * depth);//здесь пишем в общем формулу
                return (depth*width*height);
            }
        */

    public Box(double width, double height, double depth) {
        this();// вызвать конструктор без параметров
        this.width = width;// ключевое слово this.  текущему объекту width.свойству присвоить локальную переменную
        this.height = height;
        this.depth = depth;
    }

    double volume(){
    return (depth*width*height);
}


    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';// берет строку и добавляет йе несколько свойств.




    }
}
