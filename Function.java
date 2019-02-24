import static java.lang.Math.*;

public class Function {

    static double delta(double a, double b, double c) {

        return sqrt(pow(b,2)-4*a*c);
    }
    static double zero(double a, double b, double sqrtDelta) { // miejsce zerowe 
        
        return ((-b-sqrtDelta)/2*a);
         
    }
    static double[] zgg(double a , double b , double c ) {
        double[] miejsce = new double[2]; 
        miejsce[0] = zero(a, b, delta(a, b, c));
        miejsce[1] = zero(a, b, -delta(a, b, c));

         return miejsce;
    }
}
