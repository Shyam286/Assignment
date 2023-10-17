package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;

import custom_exceptions.CustomerHandlingException;
import utils.CustomerValidationRules;
import static utils.CustomerUtils.*;
public class CustomerManagement {

	public static void main(String[] args) throws CustomerHandlingException {
		String email;
		String password;
		try(Scanner sc =new Scanner(System.in)){
			List<Customer> customers = new ArrayList<Customer>(); 
			boolean flag=false;
			int index =-1 ;
			
			while(!flag) {
				
				System.out.println("Enter your choice \n1:SignUp \n2:SignIn \n  3:Change Password\n  4:UnSubscribe \n  5:Diaplay All Customers\n  0:Exit");
				
				switch(sc.nextInt()){
				    case 1:
				    	System.out.println("Enter Your Details in Specified Order: First Name, Last Name, Email, Password, Registration Amount, Date Of Birth, Plan  ");
				    	Customer customer = CustomerValidationRules.validateAllInput(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),sc.next(),customers); 
				    	customers.add(customer);
				    	System.out.println("Registered...");
				    	
				    	System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
				    	break;
				    	
				    case 2:
				    	System.out.println("Enter Email : ");
				    	 email =sc.next();
				    	 
				    	Customer newCustomer = findByEmail(email,customers);
				    	System.out.println("Enter Password: ");
				    	password =sc.next();
				    	
				    	if(password.equals(newCustomer.getPassword())) {
				    		System.out.println("Welcome to Hello World "+newCustomer.getFirstName());
				    	}
				    	else {
				    		 throw new CustomerHandlingException("Invalid Password");
				    	}
				    	
				    	System.out.println("\n----------------------------------------------------------------------------------------");
				    	break;
				    	
				    case 3:
				    	System.out.println("Enter Email and Old Password and New Password: ");
				    	 email =sc.next();
				    	 password =sc.next();
				    	 String newPassword=sc.next();
				    	Customer oldCustomer = new Customer(email,password);
				    	if(customers.contains(oldCustomer)) {
				    		 index = customers.indexOf(oldCustomer);
				    		 System.out.println("\n----------"+ index +"----------");
				    		oldCustomer = customers.get(index);
				    		oldCustomer.setPassword(newPassword);
				    		customers.set(index, oldCustomer);
				    		
				    		System.out.println("Password Changed Successfully");
				    		
				    	}
				    	else {
				    		throw new CustomerHandlingException("Customer Not Found");
				    	}
				    	 
				    	System.out.println("\n----------------------------------------------------------------------------------------");
				    	break;
				    
				    case 4:
				    	System.out.println("enter Email : ");
				    	Customer c1=new Customer(sc.next());
				    	index =customers.indexOf(c1);
				    	System.out.println("\n----------"+ index +"----------");
				    	if(index > -1){
				    		System.out.println("\n----------"+ index +"----------");
				    		System.out.println(customers.remove(index));
				    		System.out.println("Unscbscribed..");
				    	}
				    	else{
				    		throw new CustomerHandlingException("Customer Not Found");
				    	}
				    	
				      System.out.println("\n----------------------------------------------------------------------------------------");
				      break;
				      
				    case 5:
				    	for(Customer c : customers){
				    		System.out.println(c);
				    	}
				    	
				    	System.out.println("\n----------------------------------------------------------------------------------------");
				    	break ;
				    	
				    case 0:
				    	System.out.println("Terminating The System");
				    	flag =true;
				    		    	 
				    	System.out.println("\n----------------------------------------------------------------------------------------");
				    	break;
				    	
				}
			}
			
		}catch (Exception e) {
			System.out.println("Inavlid Input");
		}
	}

}
