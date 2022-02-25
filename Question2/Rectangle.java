public class Rectangle extends Shape{
    public Rectangle(double length, double width){
        super(length, width);
    }
    public double area(){
        System.out.println("Inside Area for Rectangle.");
        return this.getDim1() * this.getDim2();
    }
}

