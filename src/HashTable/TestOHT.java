package HashTable;

public class TestOHT {
	public static void main(String [] args) {
		OpenHashTable humanHashedBrowns = new OpenHashTable();
		
		EmployeeData employee = new EmployeeData(111111, "A");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(123456, "B");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(222222, "C");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(234578, "D");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(333333, "E");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(345678, "F");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(444444, "G");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(456789, "H");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(555555, "I");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(567890, "J");
		humanHashedBrowns.addToTable(employee);
		employee = new EmployeeData(666666, "K");
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
