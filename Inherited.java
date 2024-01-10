package Inheritance;
public class Inherited {
    public static void main(String[] args) {
        System.out.println("=======Rectangle=======");
        Rectangle r = new Rectangle(10,15);
        System.out.println("Perimeter = "+r.getPerimeter());
        System.out.println("Area = "+r.getArea());
        System.out.println("=========Sqare=======");
        Sqare sq = new Sqare(12);
        System.out.println("Perimeter = "+sq.getPerimeter());
        System.out.println("Area = "+sq.getArea());
    }
}
