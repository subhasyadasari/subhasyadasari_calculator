import java.util.Scanner;
public class Calculators extends Operation
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
    System.out.println("Enter your options:");
    System.out.println("\n1. Division");
    System.out.println("2. Multiplication");
    System.out.println("3. Addition");
    System.out.println("4. Subtraction");
    
    int ch=sc.nextInt();
    if(ch==1)
    {
    	DIVISION(num1,num2);
    }    
    else if(ch==2)
    {
    	MULTIPLICATION(num1,num2);
    }
    else if(ch==3)
    {
    	ADDITION(num1,num2);
    }	
    else if(ch==4)
    {
    	SUBRACTION(num1,num2);
    }
    else
    {
    	System.out.println("Invalid choice");
    }

}
}