public class Triangle extends Shape{
    public Triangle(double height, double base){
        super(height, base);
    }
    public double area(){
        System.out.println("Inside Area for Triangle.");
        return 0.5 * this.getDim1() * this.getDim2();
    }
}
