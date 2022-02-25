public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle created on " + circle.toString());
        System.out.println("color: " + circle.getColor() +" and filled: " + circle.isFilled());
        System.out.println("The colour is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A reactangle created on " + rectangle.toString());
        System.out.println("color: " + rectangle.getColor() +" and filled: " + rectangle.isFilled());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
