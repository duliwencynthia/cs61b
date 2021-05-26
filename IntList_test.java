package lab2;

public class IntList_test {
	public static void main(String[] args) {
		intlist myList = new intlist(0, null);
	    myList.rest = new intlist(1, null);
	    myList.rest.rest = new intlist(2, null);
	    myList.rest.rest.rest = new intlist(3, null);
	    
	    intlist squarelist=myList.squarelistinteractive(myList.rest);
	    while (squarelist!=null) {
	    	System.out.println(squarelist.first);
	    	squarelist=squarelist.rest;
	    }

	}
}
