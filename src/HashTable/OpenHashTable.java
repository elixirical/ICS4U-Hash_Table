package HashTable;

import java.util.ArrayList;

public class OpenHashTable {
	int numItems;
	int k = 2; // Number of buckets as outlined in specifications
	
	ArrayList<ArrayList<EmployeeData>> hashTable = new ArrayList<ArrayList<EmployeeData>>();
	
	public void createHashTable () {
		for ( int n = 0; n < k; n++ ) {
			ArrayList<EmployeeData> bucket = new ArrayList<EmployeeData>();
			hashTable.add(bucket);
		}
	}
	
	public int calcBucket ( EmployeeData toHash ) {
		return (toHash.getEmpNumber() % k);
	}
	
}
