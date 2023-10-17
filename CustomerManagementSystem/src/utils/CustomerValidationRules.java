package utils;

import java.time.LocalDate;
import java.util.List;
import custom_exceptions.*;
import com.app.core.Customer;
import com.app.core.ServicePlan;

public class CustomerValidationRules {
	
	public static void checkForDups(String email,List<Customer> customerList) throws CustomerHandlingException
	{
		Customer newCustomer = new Customer(email);
		if(customerList.contains(newCustomer))
			throw new CustomerHandlingException("email is already registered, try new email!!!");
		
			
	}
	
	public static Customer validateAllInput(String firstName,String lastName, String email, String password,
				double registratioAmount,String date,String plan,List<Customer> customer) throws CustomerHandlingException {
		
		checkForDups(email,customer);
		ServicePlan newPlan=ServicePlan.valueOf(plan);
		LocalDate newDate = LocalDate.parse(date); 
		return new Customer( firstName, lastName,  email,  password,
				 registratioAmount, newDate, newPlan);
	
	}

}
