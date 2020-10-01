import java.util.Scanner;

public class Calculator {
    double a = 0;
    double b =0;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
    }


    public double add (double a, double b){
        return a + b;
    }
    public double subtract (double a, double b){
        return a - b;
    }
    public double divide (double a, double b){

       return a / b;
    }
    public double multiple (double a, double b){
        return a * b;
    }
}
