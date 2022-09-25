package guru.qa;

public class HomeWork {

    public static void main(String[] args) {

        //Упражнения с математическими и логическими операторами
        //Операторы математические + - * / %
        //Операторы условные > < >= <= == != !

        int x = 10;
        int y = 20;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(x % y);

        if (x>y) {
            System.out.println("X больше Y");
        }
        else {
            System.out.println("X меньше Y");
        }

        double c = 10.5;
        double d = 20.5;

        System.out.println(c + d);
        System.out.println(d - c);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(d % c);

        //переполнения при вычислениях

        byte a = 100;
        byte b = 127;

        System.out.println(a * b);

    }
}
