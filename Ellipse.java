public class Ellipse extends Shape{
       public Ellipse(double A, double B) {
              super(A, B);
       }
       public double area(){
              System.out.println("Inside Area for Ellipse.");
              return this.getPI() * this.getDim1() * this.getDim2();
       }
}

