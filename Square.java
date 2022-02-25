public class Square extends Shape{
    public Square(double length, double width){
        super(length, width);
    }
    public double area(){
        System.out.println("Inside Area for Square.");
        return this.getDim1() * this.getDim2();
    }
}