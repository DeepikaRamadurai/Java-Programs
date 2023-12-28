import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
       
       //Simple Interest
        Scanner get = new Scanner(System.in);
        int P, N;
        double R, Interest, sum, CI;

        System.out.println("Enter Principle:");
        P = get.nextInt();
        System.out.println("Enter Number of years:");
        N = get.nextInt();
        System.out.println("Enter Rate of Interest:");
        R = get.nextDouble();

        Interest = (P*N*R)/100;
        sum = P + Interest;
        System.out.println("Interest:" + Interest);
        System.out.println("sum:" + sum);

        //Compound Interest
        CI = P *(Math.pow((1+R/100),N));
        System.out.println("Compound Interest:" + CI);
            }
}