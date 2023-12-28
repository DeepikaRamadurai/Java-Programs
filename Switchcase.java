import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args){

        int x = 2;

        switch(x){
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:System.out.println("You entered a wrong choice"); 
        } 

        //Get user input and print the data
        Scanner y = new Scanner(System.in);
        int z;
        System.out.println("Give input:");
        z = y.nextInt();
    
        switch(z){
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:System.out.println("You entered a wrong choice"); 
        } 
    
    }
}