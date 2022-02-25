public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){
        super();
    }
    public Rectangle(double width, double height){
        super();
        setWidth(width);
        setHeight(height);
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width *2) + (this.height *2);
    }
}
