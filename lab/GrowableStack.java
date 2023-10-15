package lab;

public class GrowableStack implements Stack {

	Customer[] customer =new Customer[Stack_Size];
	int top=-1;
	@Override
	public void push(Customer customer) {
		if(top < Stack_Size - 1)
		{
			this.customer[++top] = customer;
		}else {
            System.out.println("Fixed stack is full. Cannot push.");
        }
	}

	@Override
	public Customer pop() {
		if(top >= 0 )
		  return customer[--top];
		else
			return null;
			
	}

}
