public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 5),
                new Triangle(3, 4, 5)
        };

        System.out.println("===== Shape Report =====");

        for (Shape shape : shapes) {

            System.out.println(
                    shape.getClass().getSimpleName());

            System.out.println(
                    "Area = " + shape.area());

            System.out.println(
                    "Perimeter = " + shape.perimeter());

            System.out.println("--------------------");
        }
    }
}