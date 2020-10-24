import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Write first number: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Write second number: ");
        double b = scanner.nextDouble();
        System.out.println("Please select an action: 1 - add , 2 - subtract, 3 - divide, 4 - multiple ");
        int actinon = scanner.nextInt();
        if (actinon== 1){
            System.out.println("a + b = " + calculator.add(a, b));
        }
        else if (actinon== 2){
            System.out.println("a - b = " + calculator.subtract(a, b));
        }
        else if (actinon== 3) {
            System.out.println("a / b = " + calculator.divide(a, b));
        } else {
            System.out.println("a * b = " + calculator.multiple(a, b) + "change");
            
        }
    }
  }

