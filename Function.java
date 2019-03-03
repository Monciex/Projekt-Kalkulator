import java.lang.Math;

public class Function {

    public double x1;
    public double x2;
    public double delta;

    public Function (double a, double b, double c) {
        sqrtDelta(a, b, c);
        zero(this.delta, a, b);
    }

    private void sqrtDelta (double a, double b, double c) {
        this.delta =  Math.sqrt((Math.pow(b, 2)) - (4 * a * c));
    }

    private void zero (double delta, double a, double b) {
        if (delta > 0) {
            this.x1 = (-b - delta)/(2 * a);
            this.x2 = (-b + delta)/(2 * a);
            System.out.println(this.x1);
            System.out.println(this.x2);
        }
        else if (delta == 0) {
            this.x1 = -b/(2 * a);
            System.out.println(this.x1);
        }
        else {
            System.out.println ("No zeroes of a function");
        }
        
    }


}