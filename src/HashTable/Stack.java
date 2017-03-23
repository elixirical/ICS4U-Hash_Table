package HashTable;

public class Stack {
    //Literally for the head and tail of the list
    private EmployeeData head;
    private EmployeeData tail;

    int numInList = 0;

    //adding a new item to the stack
    public void push( EmployeeData newHead ) {
	    if (numInList == 0) {
	       tail = newHead;
	       head = newHead;
	    } else if (numInList > 0) {
	       newHead.setNext(head);
	       head = newHead;
	    }
	    numInList++;
    }

    //removing an item from the stack
    public EmployeeData pop() {
    	EmployeeData temp = new EmployeeData();
	    if (numInList == 0) {
	    	return null;
	    } 
	    if (numInList == 1) {
	    	temp.setEmployee(head);
	    	head.setEmployee(null);
	    	tail.setEmployee(null);
	    	numInList--;
	    } else if (numInList > 1) {
	    	temp.setEmployee(head);
	    	head.setEmployee(head.getNext());
	    	numInList--;
	    }
	    temp.setNext(null);
	    return temp;
    }

    //look at the topmost item in the stack
    public EmployeeData peek() {
	     return head;
    }
}
