package lab;

public interface Stack {
	
	static final int Stack_Size = 3;
	public static int count=0;

	void push(Customer customer);
	
	Customer pop();

}
