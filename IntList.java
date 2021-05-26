package lab2;

public class IntList{
	public int first;
	public IntList rest;
	
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

	
	public IntList(int x,IntList r) {
		first=x;
		rest=r;
	}
	
	public void dsquarelist(IntList l) {
		l.first=l.first*l.first;
		IntList q=l.rest;
		
		while(q!=null) {
			q.first=q.first*q.first;
			q=q.rest;
		}
	}
	
    public IntList squarelistinteractive(IntList l) {
    	IntList L=l;
    	L.first=L.first*L.first;
    	IntList q=L.rest;
    	
    	while (q!=null) {
    		q.first=q.first*q.first;
			q=q.rest;
    	}
    	
    	return L;
	}
    
    public IntList squarelistrecursive(IntList l) {
    	IntList L=l;
    	L.first=L.first*L.first;
    	L.rest=squarelistrecursive(L.rest);
    	
    	return L;
    }
    
    public IntList dcatenate(IntList A, IntList B) {
    	IntList q=A.rest;
    	
    	while (q.rest!=null) {
			q=q.rest;
    	}
    	
    	q.rest=B;
    	return A;
    	
    }
    
    public IntList catenate(IntList A, IntList B) {
    	IntList L=A;
    	IntList q=L.rest;
    	
    	while (q.rest!=null) {
			q=q.rest;
    	}
    	
    	q.rest=B;
    	return L;
    	
    }
    
}

