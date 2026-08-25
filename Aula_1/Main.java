package Aula_1;
public class Main{
    public static void main(String[] args) {
        circulo c = new circulo (30);
        circulo c1 = new circulo (50);

        System.out.println(c.area());
        System.out.println(c.comprimento());

        System.out.println("------------------------");

        System.out.println(c1.area());
        System.out.println(c1.comprimento());

    }
}