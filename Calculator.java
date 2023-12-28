import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
       
       Scanner get = new Scanner(System.in);
        int a, b, ch; 
        double res;

        System.out.println("1. Addition");
        System.out.println("2. Subraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.println("Choose the choice:");
        ch = get.nextInt();
        
        System.out.println("Enter two numbers:");
            a = get.nextInt();
            b = get.nextInt();

        switch(ch){
            case 1: 
            res = a + b;
            System.out.println("Addition of two numbers:" + res);
            break;

            case 2: 
            res = a - b;
            System.out.println("Subtraction of two numbers:" + res);
            break;

            case 3: 
            res = a * b;
            System.out.println("Multiplication of two numbers:" + res);
            break;

            case 4: 
            res = a / b;
            System.out.println("Division of two numbers:" + res);
            break;

            case 5: 
            res = a % b;
            System.out.println("Modulus of two numbers:" + res);
            break;

            default: System.out.println("You entered the wrong choice.");
            break;
        }


    }
}