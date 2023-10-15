package lab;

import java.util.Scanner;
import static lab.Stack.*;
public class Tester {


public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Customer customer =null;
		boolean choice = false;
		boolean flag =false;
		int myChoice;
		int i;
		int length =Stack_Size;
		Stack stack =null;
		System.out.println("Enter Your choice : \n1.Fixed Stack \n2.Growable Stack ");
		 myChoice = sc.nextInt();
		 
		do {
			switch(myChoice)
			{
			case 1:
				
				 if(!flag)
				 {
					 System.out.println("Fixed");
					 stack =new FixedStack();
//					 System.out.println("Enter your choice: \n 3.Push \n4.Pop");
//					 myChoice = sc.nextInt();
					 flag=true;
				 }
				 break;
				 
			case 2:
				if(!flag)
				 {
					 System.out.println("Growable");
					 stack= new GrowableStack();
//					 System.out.println("Enter your choice: \n 3.Push \n4.Pop");
//					 myChoice = sc.nextInt();
					 flag=true;
				 }
				break;
				
			case 3:
			     if(stack == null)
			     {
			    	 System.out.println("NO Stack chosen!!!");
			     }
			     else {  
					  if(stack instanceof FixedStack) {
						  System.out.println("Enter Your Id ,Name ,Address");
						  customer =new Customer(sc.nextInt(),sc.next(),sc.next());
						  stack.push(customer);
						  
					  }
					  else {
						  System.out.println("Enter Your Id ,Name ,Address");
						  customer =new Customer(sc.nextInt(),sc.next(),sc.next());
						  stack.push(customer);
					  }
			     }
			
				break;
				
			case 4:
				if(stack == null)
			    	 System.out.println("NO Stack chosen!!!");
			     else {  
					  if(stack instanceof FixedStack) 
					  {
						 customer= stack.pop();
						 if(customer!= null)
						 	 System.out.println("cutomer dat deleted "+customer);
						 else
							 System.out.println("Data not present");
					  }
					  else if(stack instanceof GrowableStack)
					    {
						  customer= stack.pop();
						  if(customer!= null)
							  System.out.println("cutomer dat deleted "+customer);
						  else
						      System.out.println("Data not present");
						 }					  
			     }
				
				break;
				
			case 5: 
				if(stack == null)
			    	 System.out.println("NO Stack chosen!!!");
			     else {  
					  if(stack instanceof FixedStack) 
					  {
						  for(i =0;i<5;i++)
						  {
							  System.out.println(stack);
						  }
					  }
					  else if(stack instanceof GrowableStack)
					    {
						  customer= stack.pop();
						  if(customer!= null)
							  System.out.println("cutomer dat deleted "+customer);
						  else
						      System.out.println("Data not present");
						 }	
			     }
				   break;
			   
				case 6:
					   System.exit(0);
					   
			}	   
					   System.out.println("Enter your choice\n 3:push \n 4:pop\n 5.Display \n 6.Exit");
					   myChoice =sc.nextInt();
			
		    
		}while(!choice);
	}
}
