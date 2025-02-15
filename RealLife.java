package Operators;
import java.util.Scanner;
public class RealLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	   
		Scanner uservalue=new Scanner(System.in);
	    
		Scanner value=new Scanner(System.in);
	    
		System.out.println(" Real Life Example :");
	    
		System.out.println("enter the item:");
	    
		int item=value.nextInt();
	    
		System.out.println("enter the cost:");
	    
		int cost=value.nextInt();
	    
		double r=200;
	    
		double f=item*cost;
	    
		System.out.println("uservalue :"+r);
	    
		System.out.println("value:"+ f);
	}

}
