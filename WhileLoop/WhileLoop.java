
/**
 * Write a description of class WhileLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WhileLoop
{
public static void main(String [] args)
{
Scanner reader = new Scanner(System.in);

int number;
int sum = 0;

System.out.println("Please enter a number (0 quits)");
number = reader.nextInt();

while ( number != 0) {
    sum = sum + number;
    System.out.println("Please enter another number");
    number = reader.nextInt();
    
    
    }
    System.out.println(sum);
}
}