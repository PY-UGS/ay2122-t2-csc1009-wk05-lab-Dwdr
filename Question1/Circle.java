public class Circle extends GeometricObject {
    final double PI = 3.14159265358979323;
    private double radius;

    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * PI * this.radius;
    }

    public double getDiameter(){
        return this.radius + this.radius;
    }

    public void printCircle(){
        System.out.println("Print Circle");
    }

}
