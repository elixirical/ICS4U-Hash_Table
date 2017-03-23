package HashTable;

public class EmployeeData {
	private int empNumber;
	private String firstName;
	private EmployeeData next;
	
	public EmployeeData ( int EN, String FN ) {
		setEmpNumber(EN);
		setFirstName(FN);
	}
	
	public EmployeeData(){} // creates an employee data with null values
	
	public void setEmployee ( int EN, String FN, EmployeeData newNext ) {
		empNumber = EN;
		firstName = FN;
		next = newNext;
	}
	
	public void setEmployee ( EmployeeData replace ) {
		empNumber = replace.empNumber;
		firstName = replace.firstName;
		next = replace.next;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public EmployeeData getNext() {
		return next;
	}

	public void setNext(EmployeeData next) {
		this.next = next;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	
}
