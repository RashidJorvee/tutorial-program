
public class GetterSetter {

	int rollNo;
	String fullName;
	public static void main(String[] args) {
		
		GetterSetter getterSetter = new GetterSetter();
		getterSetter.setFullName("rashid");
		getterSetter.setRollNo(12);
		System.out.println(getterSetter.getFullName());
		System.out.println(getterSetter.getRollNo());

	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
