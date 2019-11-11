public class InstanceVariable {
	int zip;
	
	public static void main(String[] args) {
		InstanceVariable instanceVariable = new InstanceVariable();
		instanceVariable.zip=11002;
		InstanceVariable instanceVariableTwo = new InstanceVariable();
		instanceVariableTwo.zip=44001;
		
		//Now access the variable zip using the different instance.
		System.out.println(instanceVariable.zip);
		System.out.println(instanceVariableTwo.zip);
	}
}
