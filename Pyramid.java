import java.util.Scanner;
 
public class Pyramid
{
    public static void main (String[] args)
    {
        // long startTime = System.currentTimeMillis();
        int i,j,rows, column;
        Scanner get = new Scanner(System.in);
 
        System.out.println("Enter the number of rows =");
        rows = get.nextInt();
        column = (2*rows)-1;
        System.out.println("column:" + column);
 
    for (i = 1; i <= rows; i++) {
      for(j = 1; j <= column; j++){
        
        if(j >= rows-(i-1) && j <= rows+(i-1)){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
      }
      System.out.println();
    }

    // long stopTime = System.currentTimeMillis();
    // long elapsedTime = stopTime - startTime;
    // System.out.println(elapsedTime);

    }
}

