package HashTable;

public class TestOHT {
	public static void main(String [] args) {
		OpenHashTable humanHashedBrowns = new OpenHashTable(2);
		
		EmployeeData employee = new EmployeeData(111111, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(123456, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(222222, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(234578, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(333333, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(345678, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(444444, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(456789, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(555555, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(567890, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(666666, "A");
		humanHashedBrowns.addToTable(employee);
		
		humanHashedBrowns.displayContents();
		humanHashedBrowns.removeFromTable(345678);
		System.out.println("removed 345678");
		humanHashedBrowns.displayContents();
		humanHashedBrowns.removeFromTable(223132);
		System.out.println("removed 223132");
		humanHashedBrowns.displayContents();
		
	}
}
