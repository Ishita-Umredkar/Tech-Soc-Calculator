import java.util.*;
public class calculator1 {

    public static double add(double a, double b) {
        return a+b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }

    public static double remainder(double a, double b) {
        return a%b;
    }

    public static double exp(double a, int b) {
        double y=1;
        for(int i=0;i<b;i++) {
            y=y*a;
        }
        return y;
    }

    public static int factorial(int a) {
        int y=1;
        for(int i=1;i<=a;i++) {
            y=y*i;
        }
        return y;
    }

    public static double sine(double a) {
        double b=3.142*a/180;
        double sin=b-b*b*b/6+b*b*b*b*b/120;
        return sin;
    }

    public static double cosine(double a) {
        double b=3.142*a/180;
        double cos=1-b*b/2+b*b*b*b/24;
        return cos;
    }

    public static double tan(double a) {
        double b=3.142*a/180;
        double tan=b+b*b*b/3+2*b*b*b*b*b/15;
        return tan;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HELLO, I AM CALCULATOR");
        for(int i=1;;i++) {
            System.out.println("Select your Operator");
            System.out.println("\n1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Remainder");
            System.out.println("6 - Exponent");
            System.out.println("7 - Factorial");
            System.out.println("8 - sine");
            System.out.println("9 - cosine");
            System.out.println("10 - tan");

            int op = sc.nextInt();

            switch(op) {

                case 1 : 
                System.out.println("Enter first number");
                double a1 = sc.nextDouble();
                System.out.println("Enter second number");
                double b1 = sc.nextDouble(); 
                System.out.println(add(a1, b1));
                break;

                case 2 :
                System.out.println("Enter first number");
                double a2 = sc.nextDouble();
                System.out.println("Enter second number");
                double b2 = sc.nextDouble(); 
                System.out.println(subtract(a2, b2));
                break;

                case 3 :
                System.out.println("Enter first number");
                double a3 = sc.nextDouble();
                System.out.println("Enter second number");
                double b3 = sc.nextDouble(); 
                System.out.println(multiply(a3, b3));
                break;

                case 4 :
                System.out.println("Enter first number");
                double a4 = sc.nextDouble();
                System.out.println("Enter second number");
                double b4 = sc.nextDouble(); 
                System.out.println(divide(a4, b4));
                break;

                case 5 :
                System.out.println("Enter first number");
                double a5 = sc.nextDouble();
                System.out.println("Enter second number");
                double b5 = sc.nextDouble(); 
                System.out.println(remainder(a5, b5));
                break;

                case 6 :
                System.out.println("Enter the base");
                double a6 = sc.nextDouble();
                System.out.println("Enter the power");
                int b6 = sc.nextInt(); 
                System.out.println(exp(a6, b6));
                break;

                case 7 :
                System.out.println("Enter the positive integer");
                int a7 = sc.nextInt();
                System.out.println(a7 + "!=" + factorial(a7));
                break;

                case 8 : 
                System.out.println("Enter the angle in degrees");
                double a8 = sc.nextDouble();
                System.out.println("sin(" + a8 + ")=" + sine(a8));
                break;

                case 9 : 
                System.out.println("Enter the angle in degrees");
                double a9 = sc.nextDouble();
                System.out.println("cos(" + a9 + ")=" + cosine(a9));
                break;

                case 10 : 
                System.out.println("Enter the angle in degrees");
                double a10 = sc.nextDouble();
                System.out.println("tan(" + a10 + ")=" + tan(a10));
                break;

                default : 
                System.out.println("INVALID INPUT");
            }

            System.out.println("THANK YOU");
            System.out.println("To continue enter any number");
            int no = sc.nextInt();
        } 
    }
}

