public class ConstructorThis
{
	ConstructorThis()
	{	
		
		System.out.println("Default Constructor.");
		this(2);
	}
	ConstructorThis(int i)
	{
		this(2,3);
		System.out.println("Constructor with one argument.");
	}
	ConstructorThis(int i, int j)	{ }
	ConstructorThis(int i, int j)	{ }
	ConstructorThis(int i, int j, int k)
	{
		System.out.println("Constructor with three argument.");
	}

	public static void main(String[] args) {
		ConstructorThis constructorThis = new ConstructorThis();
	}
}