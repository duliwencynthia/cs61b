package lab2;

public class IntList_test {
	public static void main(String[] args) {
	    IntList myList = new IntList(0, null);
	    myList.rest = new IntList(1, null);
	    myList.rest.rest = new IntList(2, null);
	    myList.rest.rest.rest = new IntList(3, null);
	    
	    IntList squarelist=myList.squarelistinteractive(myList.rest);
	    while (squarelist!=null) {
	    	System.out.println(squarelist.first);
	    	squarelist=squarelist.rest;
	    }

	}
}
