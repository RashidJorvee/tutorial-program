package java8;

public class LamdaExpression {
	interface LamdaInterface {
		String sayHello(String name);
	}

	public static void main(String[] args) {
		LamdaInterface lamdaInterface=new LamdaInterface() {
			
			@Override
			public String sayHello(String name) {
				// TODO Auto-generated method stub
				return "Hello " +name;
			}
		}; 
		System.out.println("Started!!");
		System.out.println(lamdaInterface.sayHello("Rashid"));
		
		LamdaInterface lamdaInterface2 = (String name) -> { return "Hello " +name;};
		System.out.println(lamdaInterface2.sayHello("Raza"));
		
	}

}
