package utils;

import java.util.List;

import com.app.core.Customer;

import custom_exceptions.CustomerHandlingException;

public class CustomerUtils {
	
	public static Customer findByEmail(String email,List<Customer> customer) throws CustomerHandlingException
	{
		Customer c =new Customer(email);
		int index =customer.indexOf(c);
		if(index == -1)
			throw new CustomerHandlingException("Inavlid Email");
		
		return  customer.get(index);
	}
	public static Customer findByPassword(String password,List<Customer> customer) throws CustomerHandlingException
	{
		Customer c =new Customer(password);
		int index =customer.indexOf(c);
		if(index == -1)
			throw new CustomerHandlingException("Inavlid Password");
		
		return  customer.get(index);
	}

}
